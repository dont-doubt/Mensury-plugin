package cruelteam.plugins.mnlang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import cruelteam.plugins.mnlang.psi.MnlangTypes;

%%

%public
%class MnlangLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%{
private boolean docComment;
%}

%s FINDING_VALUE
%s BLOCK_COMMENT

WHITE_SPACE = [\ \t\f]
VALUE_CHAR = "\\"\R | [^\R\f{]
LINK_CHAR = [a-zA-Z0-9_\- .\t\f]

%%

<YYINITIAL> {
    ({WHITE_SPACE}|\R)+              { return MnlangTypes.WHITE_SPACE; }
    =                                { yybegin(FINDING_VALUE); return MnlangTypes.SEPARATOR; }
    {LINK_CHAR}+                     { return MnlangTypes.KEY; }
    \[~\]\R                          { return MnlangTypes.PREFIX; }
    (#|"//")[^\R]*                   { return MnlangTypes.COMMENT; }
    "/**"                            { docComment = true; yybegin(BLOCK_COMMENT); return MnlangTypes.DOC_COMMENT; }
    "/*"                             { docComment = false; yybegin(BLOCK_COMMENT); return MnlangTypes.COMMENT; }
}

<FINDING_VALUE> {
    {WHITE_SPACE}+            { return MnlangTypes.WHITE_SPACE; }
    {VALUE_CHAR}+             { return MnlangTypes.VALUE; }
    \{~\}                     { return MnlangTypes.ESCAPE; }
    \s*\R                     { yybegin(YYINITIAL); return MnlangTypes.WHITE_SPACE; }
}

<BLOCK_COMMENT> {
    "*/"         { yybegin(YYINITIAL); return docComment ? MnlangTypes.DOC_COMMENT : MnlangTypes.COMMENT; }
    [^]          { return docComment ? MnlangTypes.DOC_COMMENT : MnlangTypes.COMMENT; }
}

[^] { return TokenType.BAD_CHARACTER; }