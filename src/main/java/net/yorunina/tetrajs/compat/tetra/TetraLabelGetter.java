package net.yorunina.tetrajs.compat.tetra;

import se.mickelus.tetra.gui.stats.getter.ILabelGetter;
import se.mickelus.tetra.gui.stats.getter.LabelGetterBasic;

public class TetraLabelGetter {
    public TetraLabelGetter() {
    }
    public static final ILabelGetter integerLabel = new LabelGetterBasic("%.0f", "%+.0f");
    public static final ILabelGetter integerLabelInverted = new LabelGetterBasic("%.0f", "%+.0f", true);
    public static final ILabelGetter decimalLabel = new LabelGetterBasic("%.02f", "%+.02f");
    public static final ILabelGetter singleDecimalLabel = new LabelGetterBasic("%.01f", "%+.01f");
    public static final ILabelGetter decimalLabelInverted = new LabelGetterBasic("%.02f", "%+.02f", true);
    public static final ILabelGetter percentageLabel = new LabelGetterBasic("%.0f%%", "%+.0f%%");
    public static final ILabelGetter percentageLabelInverted = new LabelGetterBasic("%.0f%%", "%+.0f%%", true);
    public static final ILabelGetter percentageLabelDecimal = new LabelGetterBasic("%.01f%%", "%+.01f%%");
    public static final ILabelGetter percentageLabelDecimalInverted = new LabelGetterBasic("%.01f%%", "%+.01f%%", true);
    public static final ILabelGetter noLabel = new ILabelGetter() {
        public String getLabel(double value, double diffValue, boolean flipped) {
            return "";
        }
        public String getLabelMerged(double value, double diffValue) {
            return "";
        }
    };
    public static ILabelGetter createLabelGetterBasic(String format) {
        return new LabelGetterBasic(format);
    }
    public static ILabelGetter createLabelGetterBasic(String format, String formatDiff) {
        return new LabelGetterBasic(format, formatDiff);
    }
    public static ILabelGetter createLabelGetterBasic(String format, String formatDiff, boolean inverted) {
        return new LabelGetterBasic(format, formatDiff, inverted);
    }
}
