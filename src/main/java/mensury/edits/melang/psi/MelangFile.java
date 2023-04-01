package mensury.edits.melang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import mensury.edits.melang.MelangFileType;
import mensury.edits.melang.MelangLanguage;
import org.jetbrains.annotations.NotNull;

public class MelangFile extends PsiFileBase {
    public MelangFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MelangLanguage.INSTANCE);
    }

    @NotNull @Override public FileType getFileType() {
        return MelangFileType.INSTANCE;
    }

    @Override public String toString() {
        return "Simple File";
    }
}