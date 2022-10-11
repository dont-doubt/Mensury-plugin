package cruelteam.plugins.mnlang;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import cruelteam.plugins.mnlang.parser.MnlangParser;
import cruelteam.plugins.mnlang.psi.MnlangFile;
import cruelteam.plugins.mnlang.psi.MnlangTokenSets;
import cruelteam.plugins.mnlang.psi.MnlangTypes;
import org.jetbrains.annotations.NotNull;

public class MnlangParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(MnlangLanguage.INSTANCE);

    @NotNull @Override public Lexer createLexer(Project project) {
        return new MnlangLexerAdapter();
    }

    @NotNull @Override public TokenSet getCommentTokens() {
        return MnlangTokenSets.COMMENTS;
    }

    @NotNull @Override public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull @Override public PsiParser createParser(final Project project) {
        return new MnlangParser();
    }

    @NotNull @Override public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull @Override public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new MnlangFile(viewProvider);
    }

    @NotNull @Override public PsiElement createElement(ASTNode node) {
        return MnlangTypes.Factory.createElement(node);
    }
}
