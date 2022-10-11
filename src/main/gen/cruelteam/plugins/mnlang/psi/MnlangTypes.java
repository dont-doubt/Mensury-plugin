// This is a generated file. Not intended for manual editing.
package cruelteam.plugins.mnlang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import cruelteam.plugins.mnlang.psi.impl.MnlangEntryImpl;
import cruelteam.plugins.mnlang.psi.impl.MnlangLineImpl;

public interface MnlangTypes {

  IElementType ENTRY = new MnlangElementType("ENTRY");
  IElementType LINE = new MnlangElementType("LINE");

  IElementType COMMENT = new MnlangTokenType("COMMENT");
  IElementType KEY = new MnlangTokenType("KEY");
  IElementType PREFIX = new MnlangTokenType("PREFIX");
  IElementType SEPARATOR = new MnlangTokenType("SEPARATOR");
  IElementType VALUE = new MnlangTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ENTRY) {
        return new MnlangEntryImpl(node);
      }
      else if (type == LINE) {
        return new MnlangLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
