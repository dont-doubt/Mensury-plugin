package cruelteam.plugins.mnlang.psi;

import com.intellij.psi.tree.TokenSet;

public interface MnlangTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(MnlangTypes.KEY);
    TokenSet COMMENTS = TokenSet.create(MnlangTypes.COMMENT);
}
