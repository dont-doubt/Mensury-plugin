package mensury.edits.melang;

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
import mensury.edits.melang.parser.MelangParser;
import mensury.edits.melang.psi.MelangFile;
import mensury.edits.melang.psi.MelangTokenSets;
import mensury.edits.melang.psi.MelangTypes;
import org.jetbrains.annotations.NotNull;

public class MelangParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(MelangLanguage.INSTANCE);

    @NotNull @Override public Lexer createLexer(Project project) {
        return new MelangLexerAdapter();
    }

    @NotNull @Override public TokenSet getCommentTokens() {
        return MelangTokenSets.COMMENTS;
    }

    @NotNull @Override public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull @Override public PsiParser createParser(final Project project) {
        return new MelangParser();
    }

    @NotNull @Override public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull @Override public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new MelangFile(viewProvider);
    }

    @NotNull @Override public PsiElement createElement(ASTNode node) {
        return MelangTypes.Factory.createElement(node);
    }
}
