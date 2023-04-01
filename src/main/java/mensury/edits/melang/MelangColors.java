package mensury.edits.melang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.options.colors.AttributesDescriptor;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum MelangColors {
    DOC_COMMENT("Doc comment", MelangSyntaxHighlighter.DOC_COMMENT),
    COMMENT("Comment", MelangSyntaxHighlighter.COMMENT),
    PREFIX("Prefix", MelangSyntaxHighlighter.PREFIX),
    KEY("Key", MelangSyntaxHighlighter.KEY),
    VALUE("Value", MelangSyntaxHighlighter.VALUE),
    SEPARATOR("Separator", MelangSyntaxHighlighter.SEPARATOR),
    VALUE_ESCAPE("Value escape", MelangSyntaxHighlighter.ESCAPE);

    private final TextAttributesKey textAttributesKey;
    private final AttributesDescriptor descriptor;

    MelangColors(String name) {
        this(name, null);
    }
    MelangColors(String name, TextAttributesKey key) {
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
