package cruelteam.plugins.mnlang.psi;

import com.intellij.psi.tree.IElementType;
import cruelteam.plugins.mnlang.MnlangLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MnlangElementType extends IElementType {
    public MnlangElementType(@NotNull @NonNls String debugName) {
        super(debugName, MnlangLanguage.INSTANCE);
    }
}
