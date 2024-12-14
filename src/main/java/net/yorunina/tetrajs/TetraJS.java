package net.yorunina.tetrajs;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("tetrajs")
public class TetraJS {
    public static final String MODID = "tetrajs";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TetraJS() {
    }

    public static ResourceLocation loc(String s) {
        return new ResourceLocation("tetrajs", s);
    }
}
