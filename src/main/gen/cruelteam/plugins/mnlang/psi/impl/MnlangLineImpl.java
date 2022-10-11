// This is a generated file. Not intended for manual editing.
package cruelteam.plugins.mnlang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import cruelteam.plugins.mnlang.psi.MnlangEntry;
import cruelteam.plugins.mnlang.psi.MnlangLine;
import cruelteam.plugins.mnlang.psi.MnlangVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MnlangLineImpl extends ASTWrapperPsiElement implements MnlangLine {

  public MnlangLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MnlangVisitor visitor) {
    visitor.visitLine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MnlangVisitor) accept((MnlangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MnlangEntry getEntry() {
    return findChildByClass(MnlangEntry.class);
  }

}
