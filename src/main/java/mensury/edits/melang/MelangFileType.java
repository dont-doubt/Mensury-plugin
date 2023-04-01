package mensury.edits.melang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import mensury.edits.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MelangFileType extends LanguageFileType {
    public static final MelangFileType INSTANCE = new MelangFileType();

    private MelangFileType() {
        super(MelangLanguage.INSTANCE);
    }

    @NotNull @Override public String getName() {
        return "Mensury Locale";
    }

    @NotNull @Override public String getDescription() {
        return "An extension for Mensury client locales";
    }

    @NotNull @Override public String getDefaultExtension() {
        return "melang";
    }

    @Nullable @Override public Icon getIcon() {
        return Icons.MENSURY;
    }
}
