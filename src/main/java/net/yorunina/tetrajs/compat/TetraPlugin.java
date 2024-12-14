//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.yorunina.tetrajs.compat;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;
import net.yorunina.tetrajs.compat.tetra.TetraEffect;
import net.yorunina.tetrajs.compat.tetra.TetraGui;
import se.mickelus.tetra.gui.stats.StatsHelper;
import se.mickelus.tetra.gui.stats.getter.LabelGetterBasic;
import se.mickelus.tetra.gui.stats.getter.StatFormat;

public class TetraPlugin extends KubeJSPlugin {
    public TetraPlugin() {
    }

    public void registerBindings(BindingsEvent event) {
        event.add("TetraEffect", TetraEffect.class);
        event.add("TetraGui", TetraGui.class);
        event.add("TetraLabelGetterBasic", LabelGetterBasic.class);
        event.add("TetraStatsHelper", StatsHelper.class);
        event.add("TetraStatFormat", StatFormat.class);
    }
}