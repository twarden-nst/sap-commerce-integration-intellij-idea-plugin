package com.intellij.idea.plugin.hybris.common.utils;

import com.intellij.idea.plugin.hybris.common.HybrisConstants;
import com.intellij.idea.plugin.hybris.type.system.model.EnumType;
import com.intellij.idea.plugin.hybris.type.system.model.EnumTypes;
import com.intellij.idea.plugin.hybris.type.system.model.ItemType;
import com.intellij.idea.plugin.hybris.type.system.model.ItemTypes;
import com.intellij.idea.plugin.hybris.type.system.model.Items;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlElement;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.DomFileElement;
import com.intellij.util.xml.DomManager;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.intellij.util.containers.ContainerUtil.newArrayList;

/**
 * TODO Good solve will be a create index between items.xml and java classes
 *
 * @author Nosov Aleksandr
 */
public final class PsiItemXmlUtil {

    public static final String ITEM_TYPE_TAG_NAME = "itemtype";
    public static final String ENUM_TYPE_TAG_NAME = "enumtype";

    private PsiItemXmlUtil() {
    }

    public static List<XmlElement> findTags(final PsiClass psiClass, final String tagName) {
        final Project project = psiClass.getProject();
        final String psiClassName = psiClass.getName();
        if (psiClassName == null) {
            throw new IllegalStateException("class name must not be a null");
        }
        final String searchName = cleanSearchName(psiClassName);

        final Collection<VirtualFile> files =
            FilenameIndex.getAllFilesByExt(project, "xml", GlobalSearchScope.allScope(project)).stream()
                         .filter(file -> file.getName().endsWith(HybrisConstants.HYBRIS_ITEMS_XML_FILE_ENDING))
                         .collect(Collectors.toList());

        final List<XmlElement> result = newArrayList();

        for (VirtualFile file : files) {
            final XmlFile xmlFile = (XmlFile) PsiManager.getInstance(project).findFile(file);

            if (xmlFile != null) {
                final DomManager manager = DomManager.getDomManager(project);
                final DomFileElement<DomElement> domFile = manager.getFileElement(xmlFile);
                assert domFile != null;
                final Items root = (Items) domFile.getRootElement();

                if (ITEM_TYPE_TAG_NAME.equals(tagName)) {
                    final ItemTypes sourceItems = root.getItemTypes();
                    final List<ItemType> itemTypes = sourceItems.getItemTypes();
                    final Stream<ItemType> streamItemTypes = itemTypes.stream();
                    final Stream<ItemType> streamItemGroups =
                        sourceItems.getTypeGroups()
                                   .parallelStream()
                                   .flatMap(typeGroup -> typeGroup.getItemTypes().stream())
                                   .collect(Collectors.toList()).stream();
                    result.addAll(Stream.concat(streamItemTypes, streamItemGroups)
                                        .filter(itemType ->
                                                    searchName.equals(itemType.getCode().getValue()))
                                        .map(DomElement::getXmlElement)
                                        .collect(Collectors.toList()));
                } else if (ENUM_TYPE_TAG_NAME.equals(tagName)) {
                    final EnumTypes sourceItems = root.getEnumTypes();
                    final List<EnumType> enumTypes = sourceItems.getEnumTypes();
                    result.addAll(enumTypes.stream()
                                           .filter(itemType ->
                                                       searchName.equals(itemType.getCode().getValue()))
                                           .map(DomElement::getXmlElement)
                                           .collect(Collectors.toList()));
                }
            }
        }
        return result;
    }

    private static String cleanSearchName(@NotNull final String searchName) {
        final int idx = searchName.lastIndexOf("Model");
        if (idx == -1) {
            return searchName;
        }
        return searchName.substring(0, idx);
    }
}