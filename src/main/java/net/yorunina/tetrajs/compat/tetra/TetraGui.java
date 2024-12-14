package net.yorunina.tetrajs.compat.tetra;

import se.mickelus.tetra.blocks.workbench.gui.WorkbenchStatsGui;
import se.mickelus.tetra.gui.stats.bar.GuiStatBar;
import se.mickelus.tetra.gui.stats.getter.ILabelGetter;
import se.mickelus.tetra.gui.stats.getter.IStatGetter;
import se.mickelus.tetra.gui.stats.getter.ITooltipGetter;
import se.mickelus.tetra.items.modular.impl.holo.gui.craft.HoloStatsGui;

public class TetraGui {
    public TetraGui() {
    }

    public static void addGuiStatBar(GuiStatBar effectBar) {
        WorkbenchStatsGui.addBar(effectBar);
        HoloStatsGui.addBar(effectBar);
    }

    public static GuiStatBar createGuiStatBar(int x, int y, int barLength, String labelKey, double min, double max, boolean segmented, boolean split, boolean inverted, IStatGetter statGetter, ILabelGetter labelGetter, ITooltipGetter tooltipGetter) {
        return new GuiStatBar(x, y, barLength, labelKey, min, max, segmented, false, false, statGetter, labelGetter, tooltipGetter);
    }
}
