package cruelteam.plugins.mnlang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.options.colors.AttributesDescriptor;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum MnlangColors {
    DOC_COMMENT("Doc comment", MnlangSyntaxHighlighter.DOC_COMMENT),
    COMMENT("Comment", MnlangSyntaxHighlighter.COMMENT),
    PREFIX("Prefix", MnlangSyntaxHighlighter.PREFIX),
    KEY("Key", MnlangSyntaxHighlighter.KEY),
    VALUE("Value", MnlangSyntaxHighlighter.VALUE),
    SEPARATOR("Separator", MnlangSyntaxHighlighter.SEPARATOR),
    VALUE_ESCAPE("Value escape", MnlangSyntaxHighlighter.ESCAPE);

    private final TextAttributesKey textAttributesKey;
    private final AttributesDescriptor descriptor;

    MnlangColors(String name) {
        this(name, null);
    }
    MnlangColors(String name, TextAttributesKey key) {
        this.textAttributesKey = TextAttributesKey.createTextAttributesKey(name(), key);
        this.descriptor = new AttributesDescriptor(name, key);
    }

    public static AttributesDescriptor[] getDescriptors() {
        return Arrays.stream(values()).map(it -> it.descriptor).toArray(AttributesDescriptor[]::new);
    }

    public static Map<String, TextAttributesKey> getTags() {
        return Arrays.stream(values()).collect(Collectors.toMap(it -> it.name(), it -> it.textAttributesKey));
    }
}
