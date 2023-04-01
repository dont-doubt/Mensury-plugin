// This is a generated file. Not intended for manual editing.
package mensury.edits.melang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import mensury.edits.melang.psi.impl.MelangEntryImpl;

public interface MelangTypes {

  IElementType ENTRY = new MelangElementType("ENTRY");

  IElementType COMMENT = new MelangTokenType("COMMENT");
  IElementType DOC_COMMENT = new MelangTokenType("DOC_COMMENT");
  IElementType ESCAPE = new MelangTokenType("ESCAPE");
  IElementType KEY = new MelangTokenType("KEY");
  IElementType PREFIX = new MelangTokenType("PREFIX");
  IElementType SEPARATOR = new MelangTokenType("SEPARATOR");
  IElementType VALUE = new MelangTokenType("VALUE");
  IElementType WHITE_SPACE = new MelangTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ENTRY) {
        return new MelangEntryImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
