package net.zack7796.tutorialmod.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zack7796.tutorialmod.TutorialMod;

public class ModFluids {
    public static final FlowableFluid CLEAR_WATER_STILL = register("clear_water_still", new ClearWater.Still());
    public static final FlowableFluid CLEAR_WATER_FLOWING = register("clear_water_flowing", new ClearWater.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(TutorialMod.MOD_ID, name), flowableFluid);
    }
}
