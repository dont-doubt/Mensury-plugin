// This is a generated file. Not intended for manual editing.
package cruelteam.plugins.mnlang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static cruelteam.plugins.mnlang.psi.MnlangTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MnlangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // KEY SEPARATOR value
  public static boolean ENTRY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENTRY")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY, SEPARATOR);
    r = r && value(b, l + 1);
    exit_section_(b, m, ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // line*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ENTRY | prefix | COMMENT
  static boolean line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line")) return false;
    boolean r;
    r = ENTRY(b, l + 1);
    if (!r) r = prefix(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PREFIX PREFIX CLOSE_PREFIX
  static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    if (!nextTokenIs(b, OPEN_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PREFIX, PREFIX, CLOSE_PREFIX);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (VALUE | ESCAPE)+
  static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "", ESCAPE, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!value_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE | ESCAPE
  private static boolean value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_0")) return false;
    boolean r;
    r = consumeToken(b, VALUE);
    if (!r) r = consumeToken(b, ESCAPE);
    return r;
  }

}
