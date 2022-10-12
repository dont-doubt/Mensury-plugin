// This is a generated file. Not intended for manual editing.
package cruelteam.plugins.mnlang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import cruelteam.plugins.mnlang.psi.impl.MnlangEntryImpl;

public interface MnlangTypes {

  IElementType ENTRY = new MnlangElementType("ENTRY");

  IElementType CLOSE_PREFIX = new MnlangTokenType("CLOSE_PREFIX");
  IElementType COMMENT = new MnlangTokenType("COMMENT");
  IElementType ESCAPE = new MnlangTokenType("ESCAPE");
  IElementType KEY = new MnlangTokenType("KEY");
  IElementType OPEN_PREFIX = new MnlangTokenType("OPEN_PREFIX");
  IElementType PREFIX = new MnlangTokenType("PREFIX");
  IElementType SEPARATOR = new MnlangTokenType("SEPARATOR");
  IElementType VALUE = new MnlangTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ENTRY) {
        return new MnlangEntryImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
