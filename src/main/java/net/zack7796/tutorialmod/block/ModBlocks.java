package net.zack7796.tutorialmod.block;

import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Matrix3f;
import net.zack7796.tutorialmod.TutorialMod;
import net.minecraft.util.registry.Registry;
import net.zack7796.tutorialmod.block.custom.ModStairsBlock;
import net.zack7796.tutorialmod.item.ModItemGroup;

public class ModBlocks {

    //Full Blocks
    public static final Block CUT_ANDESITE = registerBlock("cut_andesite",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.MYTHRIL);
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.MYTHRIL);
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.8F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.MYTHRIL);


    //Pillar Blocks
    public static final Block STONE_BRICK_PILLAR = registerBlock("stone_brick_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.MYTHRIL);
    public static final Block WORN_POLISHED_ANDESITE = registerBlock("worn_polished_andesite",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.MYTHRIL);
    public static final Block RUSTED_PILLAR = registerBlock("rusted_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(1.5F).requiresTool().sounds(BlockSoundGroup.BONE)), ModItemGroup.MYTHRIL);
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(50F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.MYTHRIL);

    //Light Blocks
    public static final Block JEDI_HOLOCRON = registerBlock("jedi_holocron",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(1F).breakByHand(true).sounds(BlockSoundGroup.GLASS).luminance((int) 16F)), ModItemGroup.MYTHRIL);

    //Slab Blocks
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.8F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.MYTHRIL);

    //Stair Blocks
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new ModStairsBlock(ModBlocks.CALCITE_SLAB.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(0.8F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.MYTHRIL);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for "+ TutorialMod.MOD_ID);
    }
}
