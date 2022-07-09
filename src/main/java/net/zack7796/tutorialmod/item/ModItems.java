package net.zack7796.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zack7796.tutorialmod.TutorialMod;
import net.zack7796.tutorialmod.fluid.ModFluids;

import static software.bernie.example.registry.RegistryUtils.registerItem;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item WARDEN_HELMET = registerItem("warden_helmet",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group((ModItemGroup.MYTHRIL))));

    public static final Item DARK_SABER = registerItem("dark_saber",
            new SwordItem((ToolMaterial) ModToolMaterials.MYTHRIL, 4, -2.4f,
            new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item DARK_SABER_TEMPORARY = registerItem("dark_saber_temporary",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item CLEAR_WATER_BUCKET = registerItem("clear_water_bucket",
            new BucketItem(ModFluids.CLEAR_WATER_STILL, new FabricItemSettings().group(ModItemGroup.MYTHRIL).maxCount(1)));


private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
}

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for "+ TutorialMod.MOD_ID);
    }
}
