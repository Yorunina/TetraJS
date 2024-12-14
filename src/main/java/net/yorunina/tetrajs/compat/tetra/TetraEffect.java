//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.yorunina.tetrajs.compat.tetra;

import java.util.Collection;
import javax.annotation.Nullable;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import se.mickelus.tetra.effect.ItemEffect;
import se.mickelus.tetra.items.modular.ModularItem;

public class TetraEffect {
    public TetraEffect() {
    }

    public static ItemEffect getEffectOrCreate(String key) {
        return ItemEffect.get(key);
    }

    @Nullable
    public static Collection<ItemEffect> getAllEffects(ItemStack stack) {
        Item item = stack.getItem();
        if (item instanceof ModularItem modular) {
            return modular.getEffects(stack);
        } else {
            return null;
        }
    }

    public static boolean hasItemEffect(ItemStack stack, ItemEffect effect) {
        Item item = stack.getItem();
        if (item instanceof ModularItem modular) {
            return modular.getEffectLevel(stack, effect) > 0;
        } else {
            return false;
        }
    }

    public static int getEffectLevel(ItemStack stack, ItemEffect effect) {
        Item item = stack.getItem();
        if (item instanceof ModularItem modular) {
            return modular.getEffectLevel(stack, effect);
        } else {
            return 0;
        }
    }

    public static double getEffectEfficiency(ItemStack stack, ItemEffect effect) {
        Item item = stack.getItem();
        if (item instanceof ModularItem modular) {
            return modular.getEffectEfficiency(stack, effect);
        } else {
            return 0.0;
        }
    }

    public static ItemEffect createItemEffect(ResourceLocation key) {
        return ItemEffect.get(key.toString());
    }

}
