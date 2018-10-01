/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

/*
 * This file is part of "hybris integration" plugin for Intellij IDEA.
 * Copyright (C) 2014-2016 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.intellij.idea.plugin.hybris.impex;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.idea.plugin.hybris.impex.psi.ImpexTypes;
import com.intellij.psi.TokenType;
import com.intellij.psi.CustomHighlighterTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Impex.flex</tt>
 */
class ImpexLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int WAITING_MACRO_VALUE = 4;
  public static final int MACRO_DECLARATION = 6;
  public static final int HEADER_TYPE = 8;
  public static final int HEADER_LINE = 10;
  public static final int FIELD_VALUE = 12;
  public static final int BEAN_SHELL = 14;
  public static final int MODYFIERS_BLOCK = 16;
  public static final int WAITING_ATTR_OR_PARAM_VALUE = 18;
  public static final int HEADER_PARAMETERS = 20;
  public static final int MACRO_USAGE = 22;
  public static final int MACRO_CONFIG_USAGE = 24;
  public static final int WAITING_MACRO_CONFIG_USAGE = 26;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 10, 10, 12, 12
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1824 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\172\3\1\6\77\3");

  /* The ZZ_CMAP_A table has 448 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\60\1\4\1\3\22\0\1\4\1\0\1\10\1\5\1\11\1\6\1\50\1\7\1\26\1"+
    "\27\1\0\1\45\1\31\1\21\1\23\1\56\12\46\1\32\1\30\1\57\1\22\1\33\1\0\1\47\1"+
    "\41\1\1\1\12\1\52\1\40\1\15\1\20\1\1\1\17\2\1\1\42\1\54\1\14\1\13\1\51\1\1"+
    "\1\36\1\44\1\35\1\37\1\55\4\1\1\24\1\0\1\25\1\0\1\53\1\0\1\41\1\1\1\12\1\52"+
    "\1\40\1\15\1\20\1\1\1\17\2\1\1\42\1\54\1\14\1\13\1\51\1\1\1\36\1\44\1\35\1"+
    "\37\1\55\4\1\1\0\1\34\10\0\1\60\252\0\2\16\115\0\1\43\50\0\2\60\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\5\0\1\2\5\0\1\3\1\4\2\5"+
    "\1\6\1\7\3\3\1\4\1\10\2\4\1\1\1\6"+
    "\12\11\1\12\1\13\1\14\1\15\1\16\4\11\1\17"+
    "\2\11\1\20\1\21\1\22\1\3\1\23\1\24\1\25"+
    "\1\26\1\27\2\3\6\30\1\31\1\32\1\33\1\34"+
    "\2\30\1\17\2\30\1\2\1\6\1\2\1\35\1\3"+
    "\1\36\1\37\1\40\6\41\1\42\1\41\1\17\1\3"+
    "\2\43\1\44\1\0\1\45\3\46\1\0\3\4\2\0"+
    "\1\47\1\50\1\11\1\0\4\11\1\17\1\0\1\51"+
    "\3\0\1\52\1\46\1\53\1\30\1\54\1\30\3\0"+
    "\1\2\1\41\1\47\1\45\1\46\3\41\1\55\2\0"+
    "\1\56\1\46\1\0\3\4\1\47\1\0\1\11\1\0"+
    "\4\11\1\17\1\0\2\30\1\17\2\0\1\2\1\47"+
    "\3\41\1\17\1\0\1\46\1\0\3\4\2\0\1\11"+
    "\1\57\2\11\1\0\1\57\1\60\1\57\1\0\1\46"+
    "\1\0\3\4\1\57\1\0\3\11\3\0\2\61\1\62"+
    "\1\63\2\64\1\65\1\66\4\0\1\4\1\0\1\11"+
    "\4\0\1\4\1\0\1\11\1\67\1\55\2\0\1\4"+
    "\1\0\1\11\2\0\1\4\1\0\1\11\2\0\1\4"+
    "\1\0\1\11\2\0\1\4\1\0\1\11\2\70\2\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[247];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u027d"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u027d"+
    "\0\u0436\0\u0467\0\u0498\0\u04c9\0\u027d\0\u04fa\0\u052b\0\u0372"+
    "\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651\0\u027d\0\u027d"+
    "\0\u027d\0\u027d\0\u027d\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746"+
    "\0\u0777\0\u07a8\0\u027d\0\u07d9\0\u080a\0\u083b\0\u027d\0\u027d"+
    "\0\u027d\0\u027d\0\u027d\0\u0777\0\u086c\0\u027d\0\u089d\0\u0372"+
    "\0\u083b\0\u08ce\0\u08ff\0\u027d\0\u027d\0\u027d\0\u027d\0\u0930"+
    "\0\u0715\0\u0961\0\u0992\0\u07a8\0\u09c3\0\u09f4\0\u0a25\0\u0a56"+
    "\0\u052b\0\u027d\0\u027d\0\u027d\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a"+
    "\0\u0b4b\0\u0b7c\0\u027d\0\u0bad\0\u0bde\0\u0c0f\0\u027d\0\u0c40"+
    "\0\u027d\0\u0372\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66"+
    "\0\u0d97\0\u0dc8\0\u0651\0\u0df9\0\u0e2a\0\u055c\0\u0e5b\0\u0e8c"+
    "\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0777\0\u0fe3"+
    "\0\u1014\0\u1045\0\u027d\0\u083b\0\u086c\0\u1076\0\u027d\0\u10a7"+
    "\0\u10d8\0\u1109\0\u113a\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u0b1a"+
    "\0\u122f\0\u1260\0\u1291\0\u0c0f\0\u12c2\0\u12f3\0\u027d\0\u1324"+
    "\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u027d\0\u1419\0\u144a\0\u147b"+
    "\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2\0\u1603"+
    "\0\u10d8\0\u1634\0\u0992\0\u1665\0\u0a87\0\u1696\0\u16c7\0\u16f8"+
    "\0\u1291\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed\0\u181e\0\u184f"+
    "\0\u1880\0\u18b1\0\u04fa\0\u18e2\0\u1913\0\u1944\0\u089d\0\u1634"+
    "\0\u0a87\0\u1975\0\u19a6\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\u027d"+
    "\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e\0\u1b5f\0\u1b90\0\u1bc1\0\u1bf2"+
    "\0\u1c23\0\u02ae\0\u02ae\0\u1c54\0\u1c85\0\u04fa\0\u04fa\0\u1cb6"+
    "\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1dab\0\u1ddc\0\u1e0d\0\u1e3e"+
    "\0\u1e6f\0\u1ea0\0\u1ed1\0\u1f02\0\u1f33\0\u027d\0\u027d\0\u1f64"+
    "\0\u1f95\0\u1fc6\0\u1ff7\0\u2028\0\u2059\0\u208a\0\u20bb\0\u20ec"+
    "\0\u211d\0\u214e\0\u217f\0\u21b0\0\u21e1\0\u2212\0\u2243\0\u2274"+
    "\0\u22a5\0\u22d6\0\u2307\0\u027d\0\u02ae\0\u027d\0\u04fa";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[247];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\16\1\17\1\20\1\21\1\22\1\23\2\16\1\24"+
    "\1\25\4\17\1\26\1\27\2\17\6\16\1\30\4\16"+
    "\1\17\1\31\1\32\3\17\1\16\1\17\1\16\1\17"+
    "\2\16\5\17\2\16\1\0\2\33\1\20\1\21\1\34"+
    "\54\33\1\35\1\36\1\20\1\21\1\22\2\35\1\37"+
    "\1\40\1\41\3\36\1\42\1\43\1\44\1\36\1\45"+
    "\1\35\1\46\1\47\1\50\1\51\1\52\1\35\1\53"+
    "\3\35\1\54\1\55\1\56\3\36\1\35\1\36\1\57"+
    "\1\60\1\61\1\35\5\36\1\35\1\62\1\35\2\16"+
    "\1\20\1\21\1\22\15\16\1\63\35\16\1\0\1\16"+
    "\1\64\1\20\1\21\1\22\5\16\4\64\1\16\3\64"+
    "\13\16\6\64\1\16\1\64\1\16\1\64\2\16\5\64"+
    "\2\16\1\0\1\16\1\65\1\20\1\21\1\22\4\16"+
    "\1\66\4\65\1\16\3\65\1\67\1\70\1\71\1\50"+
    "\1\51\1\52\1\72\1\53\2\16\1\73\6\65\1\16"+
    "\1\65\1\16\1\65\1\74\1\75\5\65\2\16\1\0"+
    "\1\76\1\77\1\20\1\21\1\22\3\76\1\100\1\101"+
    "\3\77\1\102\1\76\2\77\1\103\6\76\1\104\1\105"+
    "\1\106\1\76\1\107\1\110\5\77\1\76\1\77\1\111"+
    "\1\112\2\76\5\77\1\113\1\114\1\76\2\115\1\20"+
    "\1\21\1\116\3\115\1\117\50\115\1\16\1\120\1\20"+
    "\1\21\1\22\2\16\1\121\1\24\1\66\4\120\1\16"+
    "\3\120\1\67\1\120\1\16\1\122\3\16\1\123\2\16"+
    "\1\124\6\120\1\16\1\120\1\16\1\120\2\16\5\120"+
    "\2\16\1\0\2\125\1\20\1\21\1\22\2\125\1\126"+
    "\1\127\1\130\3\125\1\131\3\125\1\132\3\125\1\122"+
    "\3\125\1\133\3\125\1\134\7\125\1\132\1\135\12\125"+
    "\2\16\1\20\1\21\1\22\53\16\1\0\2\16\1\20"+
    "\1\21\1\22\4\16\1\136\46\16\1\0\2\137\1\20"+
    "\1\21\1\22\4\137\1\140\46\137\63\0\1\17\10\0"+
    "\4\17\1\0\3\17\13\0\6\17\1\0\1\17\1\0"+
    "\1\17\2\0\5\17\5\0\1\20\62\0\1\22\62\0"+
    "\1\141\52\0\10\142\1\143\50\142\1\0\1\144\10\0"+
    "\1\145\3\144\1\0\3\144\1\0\1\146\2\0\2\146"+
    "\5\0\6\144\1\0\1\144\1\0\1\144\2\0\5\144"+
    "\17\0\1\147\45\0\1\17\10\0\2\17\1\150\1\17"+
    "\1\0\3\17\13\0\6\17\1\0\1\17\1\0\1\17"+
    "\2\0\5\17\4\0\1\17\10\0\4\17\1\0\3\17"+
    "\13\0\3\17\1\151\2\17\1\0\1\17\1\0\1\17"+
    "\2\0\5\17\4\0\1\17\10\0\4\17\1\0\3\17"+
    "\13\0\6\17\1\0\1\17\1\0\1\17\2\0\1\152"+
    "\4\17\3\0\2\33\2\0\57\33\2\0\1\34\54\33"+
    "\1\0\1\36\10\0\4\36\1\0\3\36\1\0\1\153"+
    "\11\0\6\36\1\0\1\36\1\0\1\36\2\0\5\36"+
    "\3\0\2\154\2\0\3\154\1\155\51\154\1\0\1\156"+
    "\10\0\4\156\1\0\3\156\13\0\6\156\1\0\1\156"+
    "\1\0\1\156\2\0\5\156\4\0\1\36\10\0\4\36"+
    "\1\0\3\36\1\0\1\153\11\0\4\36\1\157\1\36"+
    "\1\0\1\36\1\0\1\36\2\0\5\36\17\0\1\160"+
    "\45\0\1\36\10\0\2\36\1\161\1\36\1\0\3\36"+
    "\1\0\1\153\11\0\6\36\1\0\1\36\1\0\1\36"+
    "\2\0\5\36\4\0\1\36\10\0\4\36\1\0\3\36"+
    "\1\0\1\153\11\0\6\36\1\0\1\36\1\0\1\60"+
    "\2\0\5\36\4\0\1\36\10\0\4\36\1\0\3\36"+
    "\13\0\6\36\1\0\1\36\1\0\1\36\2\0\5\36"+
    "\4\0\1\36\10\0\4\36\1\0\3\36\1\0\1\153"+
    "\11\0\1\36\1\162\4\36\1\0\1\36\1\0\1\36"+
    "\2\0\5\36\4\0\1\36\10\0\4\36\1\0\3\36"+
    "\1\0\1\153\11\0\3\36\1\163\2\36\1\0\1\36"+
    "\1\0\1\36\2\0\5\36\4\0\1\36\10\0\4\36"+
    "\1\0\3\36\1\0\1\153\11\0\6\36\1\0\1\36"+
    "\1\0\1\36\2\0\1\164\4\36\51\0\1\165\13\0"+
    "\1\36\10\0\4\36\1\0\3\36\1\0\1\166\11\0"+
    "\6\36\1\0\1\36\1\0\1\60\2\0\5\36\4\0"+
    "\1\167\10\0\4\167\1\0\3\167\13\0\6\167\1\0"+
    "\1\167\1\0\1\167\2\0\5\167\21\0\2\170\42\0"+
    "\1\64\10\0\4\64\1\0\3\64\13\0\6\64\1\0"+
    "\1\64\1\0\1\64\2\0\5\64\4\0\1\65\2\0"+
    "\1\171\5\0\4\65\1\0\3\65\1\0\1\172\2\0"+
    "\1\173\6\0\6\65\1\0\1\65\1\0\1\65\2\0"+
    "\5\65\4\0\1\174\10\0\4\174\1\0\3\174\13\0"+
    "\6\174\1\0\1\174\1\0\1\174\2\0\5\174\4\0"+
    "\1\175\10\0\4\175\1\0\3\175\13\0\6\175\1\0"+
    "\1\175\1\0\1\175\2\0\5\175\4\0\1\77\10\0"+
    "\4\77\1\0\3\77\13\0\6\77\1\0\1\77\1\0"+
    "\1\77\2\0\5\77\4\0\1\77\10\0\4\77\1\0"+
    "\3\77\13\0\4\77\1\176\1\77\1\0\1\77\1\0"+
    "\1\77\2\0\5\77\4\0\1\77\10\0\4\77\1\0"+
    "\3\77\11\0\1\177\1\0\6\77\1\0\1\77\1\0"+
    "\1\112\2\0\5\77\4\0\1\77\10\0\4\77\1\0"+
    "\3\77\13\0\1\77\1\200\4\77\1\0\1\77\1\0"+
    "\1\77\2\0\5\77\4\0\1\77\10\0\4\77\1\0"+
    "\3\77\1\0\1\201\11\0\6\77\1\0\1\77\1\0"+
    "\1\112\2\0\5\77\4\0\1\202\10\0\4\202\1\0"+
    "\3\202\13\0\6\202\1\0\1\202\1\0\1\202\2\0"+
    "\5\202\3\0\2\115\2\0\57\115\2\0\1\116\54\115"+
    "\2\117\2\203\4\117\1\204\50\117\1\0\1\120\10\0"+
    "\4\120\1\0\3\120\1\0\1\120\11\0\6\120\1\0"+
    "\1\120\1\0\1\120\2\0\5\120\3\0\2\125\3\0"+
    "\20\125\1\0\3\125\1\0\27\125\2\205\2\0\1\154"+
    "\2\205\1\206\15\205\1\154\3\205\1\154\27\205\2\127"+
    "\3\142\3\127\1\207\14\127\1\142\3\127\1\142\27\127"+
    "\1\125\1\210\3\0\5\125\4\210\1\125\3\210\3\125"+
    "\1\0\3\125\1\0\3\125\6\210\1\125\1\210\1\125"+
    "\1\210\2\125\5\210\5\125\3\0\20\125\1\0\3\125"+
    "\1\0\7\125\1\211\21\125\3\0\20\125\1\0\3\125"+
    "\1\0\14\125\1\135\14\125\3\0\20\125\1\0\3\125"+
    "\1\0\4\125\1\212\24\125\3\0\16\125\1\213\1\125"+
    "\1\0\3\125\1\0\14\125\1\135\12\125\1\0\1\214"+
    "\10\0\4\214\1\0\3\214\13\0\6\214\1\0\1\214"+
    "\1\0\1\214\2\0\5\214\15\0\1\215\56\0\1\142"+
    "\51\0\1\144\2\0\1\216\5\0\1\145\3\144\1\0"+
    "\3\144\1\217\1\146\2\0\2\146\5\0\6\144\1\0"+
    "\1\144\1\0\1\144\2\0\5\144\4\0\1\144\2\0"+
    "\1\216\5\0\1\145\1\220\2\144\1\0\3\144\1\217"+
    "\1\146\2\0\2\146\5\0\6\144\1\0\1\144\1\0"+
    "\1\144\2\0\5\144\4\0\1\146\10\0\4\146\1\0"+
    "\3\146\1\0\1\146\2\0\2\146\5\0\6\146\1\0"+
    "\1\146\1\0\1\146\2\0\5\146\46\0\2\221\15\0"+
    "\1\17\10\0\4\17\1\0\3\17\13\0\6\17\1\221"+
    "\1\222\1\0\1\17\2\0\5\17\4\0\1\17\10\0"+
    "\4\17\1\0\3\17\13\0\6\17\1\0\1\17\1\0"+
    "\1\17\2\0\3\17\1\223\1\17\4\0\1\17\10\0"+
    "\4\17\1\0\3\17\13\0\6\17\1\0\1\17\1\0"+
    "\1\17\2\0\1\17\1\224\3\17\3\0\2\154\2\0"+
    "\3\154\1\225\51\154\7\0\1\226\52\0\1\36\10\0"+
    "\4\36\1\0\3\36\1\0\1\153\11\0\5\36\1\227"+
    "\1\0\1\36\1\0\1\36\2\0\5\36\46\0\2\230"+
    "\15\0\1\36\10\0\4\36\1\0\3\36\1\0\1\153"+
    "\11\0\6\36\1\230\1\231\1\0\1\36\2\0\5\36"+
    "\4\0\1\36\10\0\4\36\1\0\3\36\1\0\1\153"+
    "\11\0\2\36\1\232\3\36\1\0\1\36\1\0\1\36"+
    "\2\0\5\36\4\0\1\36\10\0\4\36\1\0\3\36"+
    "\1\0\1\153\11\0\6\36\1\0\1\36\1\0\1\36"+
    "\2\0\3\36\1\233\1\36\4\0\1\36\10\0\4\36"+
    "\1\0\3\36\1\0\1\153\11\0\6\36\1\0\1\36"+
    "\1\0\1\36\2\0\1\36\1\234\3\36\26\0\1\201"+
    "\22\0\1\165\13\0\1\36\10\0\4\36\1\0\3\36"+
    "\13\0\6\36\1\0\1\36\1\0\1\235\2\0\5\36"+
    "\23\0\1\236\44\0\1\171\21\0\1\173\33\0\1\65"+
    "\10\0\4\65\1\0\3\65\13\0\6\65\1\0\1\65"+
    "\1\0\1\65\2\0\5\65\4\0\1\77\10\0\4\77"+
    "\1\0\3\77\13\0\5\77\1\237\1\0\1\77\1\0"+
    "\1\77\2\0\5\77\4\0\1\77\10\0\4\77\1\0"+
    "\3\77\13\0\2\77\1\240\3\77\1\0\1\77\1\0"+
    "\1\77\2\0\5\77\51\0\1\241\13\0\1\202\10\0"+
    "\4\202\1\0\3\202\1\0\1\242\11\0\6\202\1\0"+
    "\1\202\1\0\1\202\2\0\5\202\1\243\2\0\10\203"+
    "\1\244\50\203\2\115\2\0\4\115\1\117\50\115\2\205"+
    "\2\0\1\154\2\205\1\245\15\205\1\154\3\205\1\154"+
    "\27\205\2\125\3\0\2\125\1\246\15\125\1\0\3\125"+
    "\1\0\31\125\3\0\3\125\1\127\14\125\1\0\3\125"+
    "\1\0\31\125\3\0\20\125\1\0\3\125\1\0\10\125"+
    "\1\247\20\125\3\0\20\125\1\0\3\125\1\0\5\125"+
    "\1\250\23\125\3\0\20\125\1\0\3\125\1\0\14\125"+
    "\1\251\12\125\13\0\1\252\51\0\1\216\15\0\1\217"+
    "\37\0\1\144\2\0\1\216\5\0\1\145\1\144\1\253"+
    "\1\144\1\0\3\144\1\217\1\146\2\0\2\146\5\0"+
    "\6\144\1\0\1\144\1\0\1\144\2\0\5\144\43\0"+
    "\1\254\21\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\3\17\1\255\2\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\4\0\1\17\10\0\1\17\1\256\2\17\1\0"+
    "\3\17\13\0\6\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\4\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\4\17\1\257\1\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\12\0\1\225\52\0\1\36\10\0\4\36\1\0"+
    "\3\36\1\0\1\153\11\0\6\36\1\260\1\232\1\0"+
    "\1\36\2\0\5\36\43\0\1\261\21\0\1\36\10\0"+
    "\4\36\1\0\3\36\1\0\1\153\11\0\3\36\1\262"+
    "\2\36\1\0\1\36\1\0\1\36\2\0\5\36\4\0"+
    "\1\36\10\0\4\36\1\0\3\36\1\0\1\153\11\0"+
    "\3\36\1\263\2\36\1\0\1\36\1\0\1\36\2\0"+
    "\5\36\4\0\1\36\10\0\1\36\1\264\2\36\1\0"+
    "\3\36\1\0\1\153\11\0\6\36\1\0\1\36\1\0"+
    "\1\36\2\0\5\36\4\0\1\36\10\0\4\36\1\0"+
    "\3\36\1\0\1\153\11\0\4\36\1\265\1\36\1\0"+
    "\1\36\1\0\1\36\2\0\5\36\4\0\1\36\10\0"+
    "\4\36\1\0\3\36\1\0\1\153\11\0\6\36\1\0"+
    "\1\36\1\0\1\235\2\0\5\36\17\0\1\266\45\0"+
    "\1\77\10\0\4\77\1\0\3\77\13\0\6\77\1\260"+
    "\1\240\1\0\1\77\2\0\5\77\4\0\1\77\10\0"+
    "\4\77\1\0\3\77\13\0\3\77\1\267\2\77\1\0"+
    "\1\77\1\0\1\77\2\0\5\77\4\0\1\270\10\0"+
    "\4\270\1\0\3\270\13\0\6\270\1\0\1\270\1\0"+
    "\1\270\2\0\5\270\13\0\1\203\50\0\2\125\3\0"+
    "\2\125\1\245\15\125\1\0\3\125\1\0\31\125\3\0"+
    "\20\125\1\0\3\125\1\0\11\125\2\250\16\125\3\0"+
    "\20\125\1\0\3\125\1\0\6\125\1\271\20\125\14\0"+
    "\1\272\45\0\1\144\2\0\1\216\5\0\1\145\2\144"+
    "\1\273\1\0\3\144\1\217\1\146\2\0\2\146\5\0"+
    "\6\144\1\0\1\144\1\0\1\144\2\0\5\144\41\0"+
    "\1\274\23\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\1\17\1\275\4\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\4\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\6\17\1\0\1\17\1\0\1\17\2\0\4\17\1\276"+
    "\4\0\1\17\10\0\4\17\1\0\3\17\13\0\1\277"+
    "\5\17\1\0\1\17\1\0\1\17\2\0\5\17\43\0"+
    "\1\300\56\0\1\301\23\0\1\36\10\0\4\36\1\0"+
    "\3\36\1\0\1\153\11\0\1\36\1\302\4\36\1\0"+
    "\1\36\1\0\1\36\2\0\5\36\4\0\1\36\10\0"+
    "\4\36\1\0\3\36\1\0\1\153\11\0\6\36\1\0"+
    "\1\36\1\0\1\36\2\0\4\36\1\303\4\0\1\36"+
    "\10\0\4\36\1\0\3\36\1\0\1\153\11\0\1\304"+
    "\5\36\1\0\1\36\1\0\1\36\2\0\5\36\16\0"+
    "\1\305\62\0\1\306\44\0\1\144\2\0\1\216\5\0"+
    "\1\145\3\144\1\307\3\144\1\217\1\146\2\0\2\146"+
    "\5\0\6\144\1\0\1\144\1\0\1\144\2\0\5\144"+
    "\40\0\1\310\24\0\1\17\10\0\4\17\1\0\3\17"+
    "\13\0\1\311\5\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\4\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\3\17\1\312\2\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\4\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\3\17\1\313\2\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\40\0\1\314\24\0\1\36\10\0\4\36\1\0"+
    "\3\36\1\0\1\153\11\0\1\315\5\36\1\0\1\36"+
    "\1\0\1\36\2\0\5\36\4\0\1\36\10\0\4\36"+
    "\1\0\3\36\1\0\1\153\11\0\3\36\1\316\2\36"+
    "\1\0\1\36\1\0\1\36\2\0\5\36\4\0\1\36"+
    "\10\0\4\36\1\0\3\36\1\0\1\153\11\0\3\36"+
    "\1\317\2\36\1\0\1\36\1\0\1\36\2\0\5\36"+
    "\41\0\1\320\40\0\2\321\61\0\1\322\113\0\1\323"+
    "\6\0\1\17\10\0\4\17\1\0\3\17\13\0\6\17"+
    "\1\0\1\17\1\0\1\17\2\0\2\17\1\324\2\17"+
    "\56\0\1\325\6\0\1\36\10\0\4\36\1\0\3\36"+
    "\1\0\1\153\11\0\6\36\1\0\1\36\1\0\1\36"+
    "\2\0\2\36\1\326\2\36\43\0\1\327\40\0\1\330"+
    "\61\0\1\331\76\0\1\332\22\0\1\17\10\0\4\17"+
    "\1\0\3\17\13\0\2\17\1\333\3\17\1\0\1\17"+
    "\1\0\1\17\2\0\5\17\42\0\1\334\22\0\1\36"+
    "\10\0\4\36\1\0\3\36\1\0\1\153\11\0\2\36"+
    "\1\335\3\36\1\0\1\36\1\0\1\36\2\0\5\36"+
    "\36\0\1\336\46\0\1\337\40\0\1\331\2\0\1\216"+
    "\5\0\1\340\3\331\1\0\3\331\1\217\12\0\6\331"+
    "\1\0\1\331\1\0\1\331\2\0\5\331\54\0\1\341"+
    "\10\0\1\17\10\0\4\17\1\0\3\17\13\0\6\17"+
    "\1\0\1\17\1\0\1\17\2\0\1\342\4\17\54\0"+
    "\1\343\10\0\1\36\10\0\4\36\1\0\3\36\1\0"+
    "\1\153\11\0\6\36\1\0\1\36\1\0\1\36\2\0"+
    "\1\344\4\36\4\0\1\331\2\0\1\216\5\0\1\340"+
    "\1\345\2\331\1\0\3\331\1\217\12\0\6\331\1\0"+
    "\1\331\1\0\1\331\2\0\5\331\55\0\1\346\7\0"+
    "\1\17\10\0\4\17\1\0\3\17\13\0\6\17\1\0"+
    "\1\17\1\0\1\17\2\0\1\17\1\347\3\17\55\0"+
    "\1\350\7\0\1\36\10\0\4\36\1\0\3\36\1\0"+
    "\1\153\11\0\6\36\1\0\1\36\1\0\1\36\2\0"+
    "\1\36\1\351\3\36\4\0\1\331\2\0\1\216\5\0"+
    "\1\340\1\331\1\352\1\331\1\0\3\331\1\217\12\0"+
    "\6\331\1\0\1\331\1\0\1\331\2\0\5\331\44\0"+
    "\1\353\20\0\1\17\10\0\4\17\1\0\3\17\13\0"+
    "\4\17\1\354\1\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\44\0\1\355\20\0\1\36\10\0\4\36\1\0"+
    "\3\36\1\0\1\153\11\0\4\36\1\356\1\36\1\0"+
    "\1\36\1\0\1\36\2\0\5\36\4\0\1\331\2\0"+
    "\1\216\5\0\1\340\2\331\1\357\1\0\3\331\1\217"+
    "\12\0\6\331\1\0\1\331\1\0\1\331\2\0\5\331"+
    "\40\0\1\360\24\0\1\17\10\0\4\17\1\0\3\17"+
    "\13\0\1\361\5\17\1\0\1\17\1\0\1\17\2\0"+
    "\5\17\40\0\1\362\24\0\1\36\10\0\4\36\1\0"+
    "\3\36\1\0\1\153\11\0\1\363\5\36\1\0\1\36"+
    "\1\0\1\36\2\0\5\36\4\0\1\331\2\0\1\216"+
    "\5\0\1\340\3\331\1\307\3\331\1\217\12\0\6\331"+
    "\1\0\1\331\1\0\1\331\2\0\5\331\43\0\1\364"+
    "\21\0\1\17\10\0\4\17\1\0\3\17\13\0\3\17"+
    "\1\365\2\17\1\0\1\17\1\0\1\17\2\0\5\17"+
    "\43\0\1\366\21\0\1\36\10\0\4\36\1\0\3\36"+
    "\1\0\1\153\11\0\3\36\1\367\2\36\1\0\1\36"+
    "\1\0\1\36\2\0\5\36\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9016];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\5\0\1\1\5\0\1\11\1\1\1\11"+
    "\7\1\1\11\4\1\1\11\11\1\5\11\7\1\1\11"+
    "\3\1\5\11\2\1\1\11\5\1\4\11\12\1\3\11"+
    "\6\1\1\11\3\1\1\11\1\1\1\11\1\0\4\1"+
    "\1\0\3\1\2\0\3\1\1\0\5\1\1\0\1\1"+
    "\3\0\1\11\3\1\1\11\1\1\3\0\11\1\2\0"+
    "\1\11\1\1\1\0\3\1\1\11\1\0\1\1\1\0"+
    "\5\1\1\0\3\1\2\0\6\1\1\0\1\1\1\0"+
    "\3\1\2\0\4\1\1\0\3\1\1\0\1\1\1\0"+
    "\3\1\1\11\1\0\3\1\3\0\10\1\4\0\1\1"+
    "\1\0\1\1\4\0\1\1\1\0\1\1\2\11\2\0"+
    "\1\1\1\0\1\1\2\0\1\1\1\0\1\1\2\0"+
    "\1\1\1\0\1\1\2\0\1\1\1\0\1\1\1\11"+
    "\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[247];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  ImpexLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ImpexTypes.COMMENT_BODY;
            }
          case 58: break;
          case 2: 
            { return ImpexTypes.BEAN_SHELL_BODY;
            }
          case 59: break;
          case 3: 
            { return TokenType.BAD_CHARACTER;
            }
          case 60: break;
          case 4: 
            { yybegin(FIELD_VALUE); return ImpexTypes.VALUE_SUBTYPE;
            }
          case 61: break;
          case 5: 
            { yybegin(YYINITIAL); return ImpexTypes.CRLF;
            }
          case 62: break;
          case 6: 
            { return TokenType.WHITE_SPACE;
            }
          case 63: break;
          case 7: 
            { yybegin(COMMENT); return ImpexTypes.COMMENT_MARKER;
            }
          case 64: break;
          case 8: 
            { yybegin(FIELD_VALUE); return ImpexTypes.FIELD_VALUE_SEPARATOR;
            }
          case 65: break;
          case 9: 
            { return ImpexTypes.MACRO_VALUE;
            }
          case 66: break;
          case 10: 
            { return ImpexTypes.LEFT_SQUARE_BRACKET;
            }
          case 67: break;
          case 11: 
            { return ImpexTypes.RIGHT_SQUARE_BRACKET;
            }
          case 68: break;
          case 12: 
            { return ImpexTypes.LEFT_ROUND_BRACKET;
            }
          case 69: break;
          case 13: 
            { return ImpexTypes.RIGHT_ROUND_BRACKET;
            }
          case 70: break;
          case 14: 
            { return ImpexTypes.COMMA;
            }
          case 71: break;
          case 15: 
            { return ImpexTypes.DIGIT;
            }
          case 72: break;
          case 16: 
            { yybegin(WAITING_MACRO_VALUE); return ImpexTypes.ASSIGN_VALUE;
            }
          case 73: break;
          case 17: 
            { yybegin(HEADER_LINE); return ImpexTypes.HEADER_TYPE;
            }
          case 74: break;
          case 18: 
            { return ImpexTypes.HEADER_PARAMETER_NAME;
            }
          case 75: break;
          case 19: 
            { yybegin(WAITING_ATTR_OR_PARAM_VALUE); return ImpexTypes.ASSIGN_VALUE;
            }
          case 76: break;
          case 20: 
            { return ImpexTypes.DOT;
            }
          case 77: break;
          case 21: 
            { yybegin(MODYFIERS_BLOCK); return ImpexTypes.LEFT_SQUARE_BRACKET;
            }
          case 78: break;
          case 22: 
            { return ImpexTypes.PARAMETERS_SEPARATOR;
            }
          case 79: break;
          case 23: 
            { return ImpexTypes.ALTERNATIVE_PATTERN;
            }
          case 80: break;
          case 24: 
            { return ImpexTypes.FIELD_VALUE;
            }
          case 81: break;
          case 25: 
            { return ImpexTypes.FIELD_VALUE_SEPARATOR;
            }
          case 82: break;
          case 26: 
            { return ImpexTypes.FIELD_LIST_ITEM_SEPARATOR;
            }
          case 83: break;
          case 27: 
            { return ImpexTypes.DEFAULT_PATH_DELIMITER;
            }
          case 84: break;
          case 28: 
            { return ImpexTypes.ALTERNATIVE_MAP_DELIMITER;
            }
          case 85: break;
          case 29: 
            { return ImpexTypes.ATTRIBUTE_NAME;
            }
          case 86: break;
          case 30: 
            { yybegin(HEADER_LINE); return ImpexTypes.RIGHT_SQUARE_BRACKET;
            }
          case 87: break;
          case 31: 
            { return ImpexTypes.ATTRIBUTE_SEPARATOR;
            }
          case 88: break;
          case 32: 
            { yybegin(MODYFIERS_BLOCK); return ImpexTypes.ALTERNATIVE_MAP_DELIMITER;
            }
          case 89: break;
          case 33: 
            { return ImpexTypes.ATTRIBUTE_VALUE;
            }
          case 90: break;
          case 34: 
            { yybegin(MODYFIERS_BLOCK); return ImpexTypes.ATTRIBUTE_SEPARATOR;
            }
          case 91: break;
          case 35: 
            { yypushback(yylength()); yybegin(MACRO_USAGE);
            }
          case 92: break;
          case 36: 
            { yybegin(BEAN_SHELL); return ImpexTypes.BEAN_SHELL_MARKER;
            }
          case 93: break;
          case 37: 
            { return ImpexTypes.DOUBLE_STRING;
            }
          case 94: break;
          case 38: 
            { return ImpexTypes.MACRO_USAGE;
            }
          case 95: break;
          case 39: 
            { return ImpexTypes.SINGLE_STRING;
            }
          case 96: break;
          case 40: 
            { yypushback(yylength()); yybegin(WAITING_MACRO_CONFIG_USAGE);
            }
          case 97: break;
          case 41: 
            { return ImpexTypes.HEADER_SPECIAL_PARAMETER_NAME;
            }
          case 98: break;
          case 42: 
            { yybegin(HEADER_LINE);
                                                              yypushback(1);
                                                              return ImpexTypes.FUNCTION;
            }
          case 99: break;
          case 43: 
            { return ImpexTypes.DOCUMENT_ID;
            }
          case 100: break;
          case 44: 
            { return ImpexTypes.DEFAULT_KEY_VALUE_DELIMITER;
            }
          case 101: break;
          case 45: 
            { yybegin(WAITING_MACRO_VALUE);
                                                                return ImpexTypes.MACRO_USAGE;
            }
          case 102: break;
          case 46: 
            { yybegin(MACRO_DECLARATION);
                                                              /* Push back '='. */
                                                              yypushback(1);
                                                              /* Push back spaces. */
                                                              yypushback(yylength() - yytext().toString().trim().length());
                                                              return ImpexTypes.MACRO_NAME_DECLARATION;
            }
          case 103: break;
          case 47: 
            { return ImpexTypes.BOOLEAN;
            }
          case 104: break;
          case 48: 
            { return ImpexTypes.FIELD_VALUE_URL;
            }
          case 105: break;
          case 49: 
            { yybegin(HEADER_TYPE); return ImpexTypes.HEADER_MODE_INSERT;
            }
          case 106: break;
          case 50: 
            { yybegin(HEADER_TYPE); return ImpexTypes.HEADER_MODE_REMOVE;
            }
          case 107: break;
          case 51: 
            { yybegin(HEADER_TYPE); return ImpexTypes.HEADER_MODE_UPDATE;
            }
          case 108: break;
          case 52: 
            { return ImpexTypes.HEADER_MODE_INSERT;
            }
          case 109: break;
          case 53: 
            { return ImpexTypes.HEADER_MODE_REMOVE;
            }
          case 110: break;
          case 54: 
            { return ImpexTypes.HEADER_MODE_UPDATE;
            }
          case 111: break;
          case 55: 
            { return ImpexTypes.FIELD_VALUE_IGNORE;
            }
          case 112: break;
          case 56: 
            { yybegin(HEADER_TYPE); return ImpexTypes.HEADER_MODE_INSERT_UPDATE;
            }
          case 113: break;
          case 57: 
            { return ImpexTypes.HEADER_MODE_INSERT_UPDATE;
            }
          case 114: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
