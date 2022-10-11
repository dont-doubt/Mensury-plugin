package cruelteam.plugins.mnlang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import cruelteam.plugins.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class MnlangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Prefix", MnlangSyntaxHighlighter.PREFIX),
            new AttributesDescriptor("Key", MnlangSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", MnlangSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", MnlangSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", MnlangSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable @Override public Icon getIcon() {
        return Icons.MENSURY;
    }

    @NotNull @Override public SyntaxHighlighter getHighlighter() {
        return new MnlangSyntaxHighlighter();
    }

    @NotNull @Override public String getDemoText() {
        return    "# Comment line\n"
                + "\n"
                + "[property.prefix]\n"
                + "property = Value\n"
                + "colored.property = {#4}Red {#L}Bold {\\n}New line\n"
                + "multiline.property = First line\\\n"
                + "Second line\\\n"
                + "Third line"
        ;
    }

    @Nullable @Override public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull @Override public String getDisplayName() {
        return "Mensury Locale";
    }
}
