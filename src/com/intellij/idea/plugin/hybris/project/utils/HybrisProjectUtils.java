package com.intellij.idea.plugin.hybris.project.utils;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.intellij.idea.plugin.hybris.project.exceptions.HybrisConfigurationException;
import com.intellij.idea.plugin.hybris.project.settings.HybrisModuleDescriptor;
import com.intellij.idea.plugin.hybris.project.settings.HybrisModuleDescriptorFactory;
import com.intellij.idea.plugin.hybris.project.settings.HybrisModuleDescriptorFactoryImpl;
import com.intellij.idea.plugin.hybris.utils.HybrisConstants;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.Processor;
import gnu.trove.THashSet;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.lang3.Validate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.apache.commons.collections.CollectionUtils.isEmpty;

/**
 * Created 10:39 PM 11 June 2015
 *
 * @author Alexander Bartash <AlexanderBartash@gmail.com>
 */
public final class HybrisProjectUtils {

    public static final HybrisModuleDescriptorFactory MODULE_DESCRIPTOR_FACTORY = HybrisModuleDescriptorFactoryImpl.INSTANCE;

    private static final Logger LOG = Logger.getInstance(HybrisProjectUtils.class);

    private HybrisProjectUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Should never be accessed.");
    }

    public static void buildDependencies(@NotNull final Iterable<HybrisModuleDescriptor> moduleDescriptors) {
        Validate.notNull(moduleDescriptors);

        for (HybrisModuleDescriptor moduleDescriptor : moduleDescriptors) {

            moduleDescriptor.getDependenciesTree().clear();

            final Set<String> requiredExtensionNames = moduleDescriptor.getRequiredExtensionNames();

            if (isEmpty(requiredExtensionNames)) {
                continue;
            }

            for (String requiresExtensionName : requiredExtensionNames) {

                final Optional<HybrisModuleDescriptor> dependsOn = Iterables.tryFind(
                    moduleDescriptors, new FindHybrisModuleDescriptorByName(requiresExtensionName)
                );

                if (dependsOn.isPresent()) {
                    moduleDescriptor.getDependenciesTree().add(dependsOn.get());
                } else {
                    LOG.warn(String.format(
                        "Module '%s' contains unsatisfied dependency '%s'.",
                        moduleDescriptor.getModuleName(), requiresExtensionName
                    ));
                }
            }
        }
    }

    @NotNull
    public static Set<HybrisModuleDescriptor> getAlreadyOpenedModules(@NotNull final Project project) {
        Validate.notNull(project);

        final Set<HybrisModuleDescriptor> existingModules = new THashSet<HybrisModuleDescriptor>();

        for (Module module : ModuleManager.getInstance(project).getModules()) {
            try {
                final VirtualFile moduleFile = module.getModuleFile();
                if (null == moduleFile) {
                    LOG.error("Can not find module file for module: " + module.getName());
                    continue;
                }

                final HybrisModuleDescriptor moduleDescriptor = MODULE_DESCRIPTOR_FACTORY.createDescriptor(
                    VfsUtil.virtualToIoFile(moduleFile.getParent())
                );

                existingModules.add(moduleDescriptor);
            } catch (HybrisConfigurationException e) {
                LOG.error(e);
            }
        }

        return existingModules;
    }

    @NotNull
    public static List<File> findModuleRoots(@NotNull final File rootProjectDirectory,
                                             @Nullable final Processor<File> stepProcessor
    ) {
        Validate.notNull(rootProjectDirectory);

        final List<File> paths = new ArrayList<File>(1);

        if (null != stepProcessor) {
            stepProcessor.process(rootProjectDirectory);
        }

        if (isRegularModule(rootProjectDirectory) || isConfigModule(rootProjectDirectory)) {

            paths.add(rootProjectDirectory);

        } else {
            if (isPlatformModule(rootProjectDirectory)) {
                paths.add(rootProjectDirectory);
            }

            if (rootProjectDirectory.isDirectory()) {
                final File[] files = rootProjectDirectory.listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);

                if (null != files) {
                    for (File file : files) {
                        paths.addAll(findModuleRoots(file, stepProcessor));
                    }
                }
            }
        }

        return paths;
    }

    public static boolean isConfigModule(@NotNull final File file) {
        Validate.notNull(file);

        return file.getName().equals(HybrisConstants.CONFIG_EXTENSION_NAME)
               && new File(file, HybrisConstants.LOCAL_EXTENSIONS_XML).isFile();
    }

    public static boolean isPlatformModule(@NotNull final File file) {
        Validate.notNull(file);

        return file.getName().equals(HybrisConstants.PLATFORM_EXTENSION_NAME)
               && new File(file, HybrisConstants.EXTENSIONS_XML).isFile();
    }

    public static boolean isRegularModule(@NotNull final File file) {
        Validate.notNull(file);

        return new File(file, HybrisConstants.EXTENSION_INFO_XML).isFile();
    }

    @NotNull
    public static String[] getSupportedHybrisModuleFileNames() {
        return new String[]{
            HybrisConstants.EXTENSION_INFO_XML,
            HybrisConstants.LOCAL_EXTENSIONS_XML,
            HybrisConstants.EXTENSIONS_XML
        };
    }

    public static class FindHybrisModuleDescriptorByName implements Predicate<HybrisModuleDescriptor> {

        private final String name;

        public FindHybrisModuleDescriptorByName(@NotNull final String name) {
            Validate.notEmpty(name);

            this.name = name;
        }

        @Override
        public boolean apply(@Nullable final HybrisModuleDescriptor t) {
            return null != t && name.equalsIgnoreCase(t.getModuleName());
        }
    }
}
