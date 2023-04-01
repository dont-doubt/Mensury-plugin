package mensury.edits.melang;

import com.intellij.lang.Language;

public class MelangLanguage extends Language {
    public static final MelangLanguage INSTANCE = new MelangLanguage();

    private MelangLanguage() {
        super("Mensury Locale");
    }
}
