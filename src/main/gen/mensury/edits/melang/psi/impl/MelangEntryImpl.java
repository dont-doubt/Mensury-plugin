// This is a generated file. Not intended for manual editing.
package mensury.edits.melang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import mensury.edits.melang.psi.MelangEntry;
import mensury.edits.melang.psi.MelangVisitor;
import org.jetbrains.annotations.NotNull;

public class MelangEntryImpl extends ASTWrapperPsiElement implements MelangEntry {

  public MelangEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MelangVisitor visitor) {
    visitor.visitEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MelangVisitor) accept((MelangVisitor)visitor);
    else super.accept(visitor);
  }

}
