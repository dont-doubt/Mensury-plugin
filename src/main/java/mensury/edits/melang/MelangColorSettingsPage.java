package mensury.edits.melang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import mensury.edits.Icons;
import mensury.edits.utils.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class MelangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = MelangColors.getDescriptors();
    private static final Map<String, TextAttributesKey> ANNOTATOR_TAGS = MelangColors.getTags();
    private static final String preview = FileUtils.getResourceFileAsString("/mensury/preview.melang");

    @Nullable @Override public Icon getIcon() {
        return Icons.MENSURY;
    }

    @NotNull @Override public SyntaxHighlighter getHighlighter() {
        return new MelangSyntaxHighlighter();
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
