package com.xiaolianganmuchen.flavorimmersedcropaddons;

import com.nsukcropapi.CropAddons;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

/**
 * Flavor Immersed Crop Addons —— 薄壳附属：作物定义在 jar 内，作业逻辑由 nsukcropapi 共用作业库提供。
 */
@Mod("flavorimmersedcropaddons")
public class FlavorImmersedCropAddons {

    public static final String MODID = "flavorimmersedcropaddons";

    public FlavorImmersedCropAddons(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> CropAddons.bootstrap(FlavorImmersedCropAddons.class, MODID, "kaleidoscope_crops"));
    }
}
