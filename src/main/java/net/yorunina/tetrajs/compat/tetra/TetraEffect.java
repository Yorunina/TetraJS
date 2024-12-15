package net.yorunina.tetrajs.compat.tetra;

import javax.annotation.Nullable;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.yorunina.tetrajs.model.ItemEffectResult;
import se.mickelus.tetra.effect.ItemEffect;
import se.mickelus.tetra.items.modular.ModularItem;

public class TetraEffect {
    public TetraEffect() {
    }

    public static ItemEffect getEffectOrCreate(String key) {
        return ItemEffect.get(key);
    }

    @Nullable
    public static ItemEffect[] getAllItemEffects(ItemStack stack) {
        Item item = stack.getItem();
        if (item instanceof ModularItem modular) {
            return modular.getEffects(stack).toArray(ItemEffect[]::new);
        } else {
            return null;
        }
    }
    @Nullable
    public static ItemEffectResult[] getAllItemEffectResults(ItemStack stack) {
        Item item = stack.getItem();
        if (item instanceof ModularItem modular) {
            return modular.getEffects(stack).stream().map(effect -> {
                ItemEffectResult result = new ItemEffectResult();
                result.itemEffect = effect;
                result.level = modular.getEffectLevel(stack, effect);
                result.item = stack;
                return result;
            }).toArray(ItemEffectResult[]::new);
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
