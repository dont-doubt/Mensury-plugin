package mensury.edits.melang;

import com.intellij.lexer.FlexAdapter;

public class MelangLexerAdapter extends FlexAdapter {
    public MelangLexerAdapter() {
        super(new MelangLexer(null));
    }
}
