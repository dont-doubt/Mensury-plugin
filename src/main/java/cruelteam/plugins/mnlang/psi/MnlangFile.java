package cruelteam.plugins.mnlang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import cruelteam.plugins.mnlang.MnlangFileType;
import cruelteam.plugins.mnlang.MnlangLanguage;
import org.jetbrains.annotations.NotNull;

public class MnlangFile extends PsiFileBase {
    public MnlangFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MnlangLanguage.INSTANCE);
    }

    @NotNull @Override public FileType getFileType() {
        return MnlangFileType.INSTANCE;
    }

    @Override public String toString() {
        return "Simple File";
    }
}