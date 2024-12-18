package net.yorunina.tetrajs.compat.tetra;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.common.ToolAction;
import se.mickelus.tetra.effect.ChargedAbilityEffect;
import se.mickelus.tetra.effect.ItemEffect;
import se.mickelus.tetra.gui.stats.getter.*;

public class TetraStatGetter {
    public TetraStatGetter() {
    }
    public static IStatGetter createStatGetterAbilityChargeTime(ChargedAbilityEffect ability) {
        return new StatGetterAbilityChargeTime(ability);
    }
    public static IStatGetter createStatGetterAbilityCooldown(ChargedAbilityEffect ability) {
        return new StatGetterAbilityCooldown(ability);
    }

    public static IStatGetter createStatGetterAbilityDamage(double offset, double multiplier) {
        return new StatGetterAbilityDamage(offset, multiplier);
    }
    public static IStatGetter createStatGetterAttribute(Attribute attribute) {
        return new StatGetterAttribute(attribute);
    }
    public static IStatGetter createStatGetterAttributeAddition(Attribute attribute) {
        return new StatGetterAttributeAddition(attribute);
    }
    public static IStatGetter createStatGetterAttributeMultiply(Attribute attribute) {
        return new StatGetterAttributeMultiply(attribute);
    }
    public static IStatGetter createStatGetterCooldown(double offset, double multiplier) {
        return new StatGetterCooldown(offset, multiplier);
    }
    public static IStatGetter createStatGetterDurability() {
        return new StatGetterDurability();
    }
    public static IStatGetter createStatGetterEffectEfficiency(ItemEffect effect, double multiplier) {
        return new StatGetterEffectEfficiency(effect, multiplier);
    }
    public static IStatGetter createStatGetterEffectLevel(ItemEffect itemEffect, int multiplier) {
        return new StatGetterEffectLevel(itemEffect, multiplier);
    }
    public static IStatGetter createStatGetterEnchantmentLevel(Enchantment enchantment, double multiplier, double base) {
        return new StatGetterEnchantmentLevel(enchantment, multiplier, base);
    }
    public static IStatGetter createStatGetterFocus() {
        return new StatGetterFocus();
    }
    public static IStatGetter createStatGetterIntegrity() {
        return new StatGetterIntegrity();
    }
    public static IStatGetter createStatGetterMagicCapacity() {
        return new StatGetterMagicCapacity();
    }
    public static IStatGetter createStatGetterMultiply(double multiplier, IStatGetter... statGetters) {
        return new StatGetterMultiply(multiplier, statGetters);
    }
    public static IStatGetter createStatGetterReaching() {
        return new StatGetterReaching();
    }
    public static IStatGetter createStatGetterSpread(ItemEffect effect) {
        return new StatGetterSpread(effect);
    }
    public static IStatGetter createStatGetterStability() {
        return new StatGetterStability();
    }
    public static IStatGetter createStatGetterSweepingRange() {
        return new StatGetterSweepingRange();
    }
    public static IStatGetter createStatGetterToolCompoundEfficiency(IStatGetter efficiencyGetter, IStatGetter attackSpeedGetter, IStatGetter enchantmentGetter) {
        return new StatGetterToolCompoundEfficiency(efficiencyGetter, attackSpeedGetter, enchantmentGetter);
    }
    public static IStatGetter createStatGetterToolEfficiency(ToolAction tool) {
        return new StatGetterToolEfficiency(tool);
    }
    public static IStatGetter createStatGetterToolLevel(ToolAction tool) {
        return new StatGetterToolLevel(tool);
    }
    public static IStatGetter createStatGetterUnbreaking(IStatGetter levelGetter) {
        return new StatGetterUnbreaking(levelGetter);
    }

}
