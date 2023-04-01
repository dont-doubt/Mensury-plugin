package mensury.edits.melang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import mensury.edits.melang.psi.MelangTypes;

%%

%public
%class MelangLexer
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
    ({WHITE_SPACE}|\R)+              { return MelangTypes.WHITE_SPACE; }
    =                                { yybegin(FINDING_VALUE); return MelangTypes.SEPARATOR; }
    {LINK_CHAR}+                     { return MelangTypes.KEY; }
    \[~\]\R                          { return MelangTypes.PREFIX; }
    (#|"//")[^\R]*                   { return MelangTypes.COMMENT; }
    "/**"                            { docComment = true; yybegin(BLOCK_COMMENT); return MelangTypes.DOC_COMMENT; }
    "/*"                             { docComment = false; yybegin(BLOCK_COMMENT); return MelangTypes.COMMENT; }
}

<FINDING_VALUE> {
    {WHITE_SPACE}+            { return MelangTypes.WHITE_SPACE; }
    {VALUE_CHAR}+             { return MelangTypes.VALUE; }
    \{~\}                     { return MelangTypes.ESCAPE; }
    \s*\R                     { yybegin(YYINITIAL); return MelangTypes.WHITE_SPACE; }
}

<BLOCK_COMMENT> {
    "*/"         { yybegin(YYINITIAL); return docComment ? MelangTypes.DOC_COMMENT : MelangTypes.COMMENT; }
    [^]          { return docComment ? MelangTypes.DOC_COMMENT : MelangTypes.COMMENT; }
}

[^] { return TokenType.BAD_CHARACTER; }