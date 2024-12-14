package net.yorunina.tetrajs.compat.tetra;

import net.minecraftforge.common.ToolAction;
import se.mickelus.tetra.gui.stats.getter.*;

public class TetraTooltipGetter {
    public TetraTooltipGetter() {
    }
    public static ITooltipGetter createTooltipGetterArthropod() {
        return new TooltipGetterArthropod();
    }
    public static ITooltipGetter createTooltipGetterAttackSpeed(IStatGetter statGetter) {
        return new TooltipGetterAttackSpeed(statGetter);
    }
    public static ITooltipGetter createTooltipGetterBashing() {
        return new TooltipGetterBashing();
    }
    public static ITooltipGetter createTooltipGetterBlockingDuration(IStatGetter durationGetter, IStatGetter cooldownGetter) {
        return new TooltipGetterBlockingDuration(durationGetter, cooldownGetter);
    }
    public static ITooltipGetter createTooltipGetterBlockingReflect() {
        return new TooltipGetterBlockingReflect();
    }
    public static ITooltipGetter createTooltipGetterCounterweight() {
        return new TooltipGetterCounterweight();
    }
    public static ITooltipGetter createTooltipGetterCriticalStrike() {
        return new TooltipGetterCriticalStrike();
    }
    public static ITooltipGetter createTooltipGetterDecimal(String localizationKey, IStatGetter statGetter) {
        return new TooltipGetterDecimal(localizationKey, statGetter);
    }
    public static ITooltipGetter createTooltipGetterDecimalSingle(String localizationKey, IStatGetter statGetter) {
        return new TooltipGetterDecimalSingle(localizationKey, statGetter);
    }
    public static ITooltipGetter createTooltipGetterDrawStrength(IStatGetter damageGetter) {
        return new TooltipGetterDrawStrength(damageGetter);
    }
    public static ITooltipGetter createTooltipGetterFierySelf() {
        return new TooltipGetterFierySelf();
    }
    public static ITooltipGetter createTooltipGetterHowling() {
        return new TooltipGetterHowling();
    }
    public static ITooltipGetter createTooltipGetterInteger(String localizationKey, IStatGetter statGetter, boolean absolute) {
        return new TooltipGetterInteger(localizationKey, statGetter, absolute);
    }
    public static ITooltipGetter createTooltipGetterMultishot() {
        return new TooltipGetterMultishot();
    }
    public static ITooltipGetter createTooltipGetterMultiValue(String localizationKey, IStatGetter[] statGetters, StatFormat[] formatters) {
        return new TooltipGetterMultiValue(localizationKey, statGetters, formatters);
    }
    public static ITooltipGetter createTooltipGetterNone(String localizationKey) {
        return new TooltipGetterNone(localizationKey);
    }
    public static ITooltipGetter createTooltipGetterPercentage(String localizationKey, IStatGetter statGetter) {
        return new TooltipGetterPercentage(localizationKey, statGetter);
    }
    public static ITooltipGetter createTooltipGetterPercentageDecimal(String localizationKey, IStatGetter statGetter) {
        return new TooltipGetterPercentageDecimal(localizationKey, statGetter);
    }
    public static ITooltipGetter createTooltipGetterReaching() {
        return new TooltipGetterReaching();
    }
    public static ITooltipGetter createTooltipGetterScannerHorizontalRange(IStatGetter levelGetter) {
        return new TooltipGetterScannerHorizontalRange(levelGetter);
    }
    public static ITooltipGetter createTooltipGetterSweeping(IStatGetter levelGetter) {
        return new TooltipGetterSweeping(levelGetter);
    }
    public static ITooltipGetter createTooltipGetterTool(ToolAction tool, boolean includeSpeedModifier) {
        return new TooltipGetterTool(tool, includeSpeedModifier);
    }
    public static ITooltipGetter createTooltipGetterUnbreaking(IStatGetter levelGetter) {
        return new TooltipGetterUnbreaking(levelGetter);
    }
    public static ITooltipGetter createTooltipGetterVelocity() {
        return new TooltipGetterVelocity();
    }
}
