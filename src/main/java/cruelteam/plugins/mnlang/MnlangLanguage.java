package cruelteam.plugins.mnlang;

import com.intellij.lang.Language;

public class MnlangLanguage extends Language {
    public static final MnlangLanguage INSTANCE = new MnlangLanguage();

    private MnlangLanguage() {
        super("Mensury Locale");
    }
}
