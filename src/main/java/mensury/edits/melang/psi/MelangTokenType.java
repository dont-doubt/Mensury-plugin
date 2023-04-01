package mensury.edits.melang.psi;

import com.intellij.psi.tree.IElementType;
import mensury.edits.melang.MelangLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MelangTokenType extends IElementType {
    public MelangTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MelangLanguage.INSTANCE);
    }

    @Override public String toString() {
        return "MelangTokenType." + super.toString();
    }
}