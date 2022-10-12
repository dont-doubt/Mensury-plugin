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
//%eof{
//   return;
//%eof}

%state FINDING_VALUE

VALUE_CHARACTER = [^\n\f\\] | "\\"\R
WHITE_SPACE = [\ \t\f]+
WHITE_SPACE_OR_LINE = [\ \t\f\R]+
LINK_CHARS = [a-zA-Z0-9. \t\f\R]
COMMENT_CHARS = [^\[a-zA-Z0-9.= \t\f\R]

%%

<YYINITIAL> {
//    ^{WHITE_SPACE}[^\R]*             { return MnlangTypes.COMMENT; }
//    {WHITE_SPACE_OR_LINE}[^\R]*      { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE_OR_LINE}[^\R]*      { return TokenType.WHITE_SPACE; }
    =                                { yybegin(FINDING_VALUE); return MnlangTypes.SEPARATOR; }
    {LINK_CHARS}+                    { return MnlangTypes.KEY; }
    \[\S*\]                          { return MnlangTypes.PREFIX; }
//    {COMMENT_CHARS}[^\R]*            { return MnlangTypes.COMMENT; }
}

<FINDING_VALUE> {
//    \{.*\} | \\{CRLF}         { return MnlangTypes.ESCAPE; }
    {WHITE_SPACE_OR_LINE}     { return TokenType.WHITE_SPACE; }
    {VALUE_CHARACTER}+        { yybegin(YYINITIAL); return MnlangTypes.VALUE; }
}

[^] { return TokenType.BAD_CHARACTER; }

//CRLF=\R
//WHITE_SPACE=[\ \n\t\f]
//FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
//VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
//END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
//SEPARATOR=[:=]
//KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
//
//%state WAITING_VALUE
//
//%%
//<YYINITIAL> {
//    {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return MnlangTypes.COMMENT; }
//
//    {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return MnlangTypes.KEY; }
//
//    {SEPARATOR}                                     { yybegin(WAITING_VALUE); return MnlangTypes.SEPARATOR; }
//}
//
//<WAITING_VALUE> {
//    {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
//
//    {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
//
//    {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return MnlangTypes.VALUE; }
//
//}
//
//({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
//
//[^]                                                         { return TokenType.BAD_CHARACTER; }