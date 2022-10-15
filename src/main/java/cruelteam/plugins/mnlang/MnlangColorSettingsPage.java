package cruelteam.plugins.mnlang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import cruelteam.plugins.Icons;
import cruelteam.plugins.utils.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import java.util.Map;

public class MnlangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = MnlangColors.getDescriptors();
    private static final Map<String, TextAttributesKey> ANNOTATOR_TAGS = MnlangColors.getTags();
    private static final String preview = FileUtils.getResourceFileAsString("/mensury/mnlang_preview.txt");

    @Nullable @Override public Icon getIcon() {
        return Icons.MENSURY;
    }

    @NotNull @Override public SyntaxHighlighter getHighlighter() {
        return new MnlangSyntaxHighlighter();
    }

    @NotNull @Override public String getDemoText() {
        return preview;
    }

    @Nullable @Override public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return ANNOTATOR_TAGS;
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
