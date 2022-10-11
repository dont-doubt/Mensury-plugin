package cruelteam.plugins.mnlang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import cruelteam.plugins.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MnlangFileType extends LanguageFileType {
    public static final MnlangFileType INSTANCE = new MnlangFileType();

    private MnlangFileType() {
        super(MnlangLanguage.INSTANCE);
    }

    @NotNull @Override public String getName() {
        return "Mensury Locale";
    }

    @NotNull @Override public String getDescription() {
        return "An extension for Mensury client locales";
    }

    @NotNull @Override public String getDefaultExtension() {
        return "mnlang";
    }

    @Nullable @Override public Icon getIcon() {
        return Icons.MENSURY;
    }
}
