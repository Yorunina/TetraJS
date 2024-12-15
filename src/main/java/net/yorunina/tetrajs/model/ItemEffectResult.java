package net.yorunina.tetrajs.model;

import net.minecraft.world.item.ItemStack;
import se.mickelus.tetra.effect.ItemEffect;

public class ItemEffectResult {
    public ItemEffectResult() {
    }
    public ItemEffect itemEffect;
    public int level;
    public ItemStack item;
    public ItemEffect getItemEffect() {
        return this.itemEffect;
    }
    public int getLevel() {
        return this.level;
    }
    public ItemStack getItemStack() {
        return this.item;
    }
}