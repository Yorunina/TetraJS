//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.yorunina.tetrajs.compat.tetra;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import se.mickelus.tetra.blocks.workbench.gui.WorkbenchStatsGui;
import se.mickelus.tetra.effect.ItemEffect;
import se.mickelus.tetra.gui.stats.bar.GuiStatBar;
import se.mickelus.tetra.gui.stats.getter.*;
import se.mickelus.tetra.items.modular.ModularItem;
import se.mickelus.tetra.items.modular.impl.holo.gui.craft.HoloStatsGui;

import javax.annotation.Nullable;
import java.util.Collection;

import static se.mickelus.tetra.gui.stats.StatsHelper.barLength;

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
