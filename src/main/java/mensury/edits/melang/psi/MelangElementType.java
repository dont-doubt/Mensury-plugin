package mensury.edits.melang.psi;

import com.intellij.psi.tree.IElementType;
import mensury.edits.melang.MelangLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MelangElementType extends IElementType {
    public MelangElementType(@NotNull @NonNls String debugName) {
        super(debugName, MelangLanguage.INSTANCE);
    }
}
