package net.yorunina.tetrajs;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
        modid = "tetrajs",
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class TetraJSClient {
    public TetraJSClient() {
    }
}
