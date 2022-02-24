package net.zack7796.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zack7796.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
}

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for "+ TutorialMod.MOD_ID);
    }
}
