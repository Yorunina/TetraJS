package net.yorunina.tetrajs.compat;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.yorunina.tetrajs.compat.tetra.*;
import net.yorunina.tetrajs.model.ItemEffectResult;
import se.mickelus.tetra.gui.stats.StatsHelper;
import se.mickelus.tetra.gui.stats.getter.StatFormat;

public class TetraPlugin extends KubeJSPlugin {
    public TetraPlugin() {
    }

    public void registerBindings(BindingsEvent event) {
        if (FMLEnvironment.dist == Dist.CLIENT) {
            event.add("TetraGui", TetraGui.class);
        }
        event.add("TetraEffect", TetraEffect.class);
        event.add("ItemEffectResult", ItemEffectResult.class);
        event.add("TetraStatGetter", TetraStatGetter.class);
        event.add("TetraTooltipGetter", TetraTooltipGetter.class);
        event.add("TetraLabelGetter", TetraLabelGetter.class);
        event.add("TetraStatsHelper", StatsHelper.class);
        event.add("TetraStatFormat", StatFormat.class);
    }
}