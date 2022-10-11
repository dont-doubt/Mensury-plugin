package cruelteam.plugins.mnlang;

import com.intellij.lexer.FlexAdapter;

public class MnlangLexerAdapter extends FlexAdapter {
    public MnlangLexerAdapter() {
        super(new MnlangLexer(null));
    }
}
