package org.dimdev.halflogs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

import java.util.function.Supplier;

public class HalfLogs implements BlockAdder, ItemAdder {

    private static Supplier<BlockStairs> LOG_STAIRS = () -> {
        Block block = Blocks.OAK_LOG;

        return new BlockStairs(block.getDefaultState(), Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD)) {
        };
    };

    //Slabs
    Block OAK_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block SPRUCE_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block BIRCH_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block JUNGLE_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block ACACIA_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block DARK_OAK_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    //Stripped
    Block STRIPPED_OAK_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block STRIPPED_SPRUCE_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block STRIPPED_BIRCH_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block STRIPPED_JUNGLE_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block STRIPPED_ACACIA_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));
    Block STRIPPED_DARK_OAK_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).soundType(SoundType.WOOD));

    //Stairs
    Block OAK_LOG_STAIRS = LOG_STAIRS.get();
    Block SPRUCE_LOG_STAIRS = LOG_STAIRS.get();
    Block BIRCH_LOG_STAIRS = LOG_STAIRS.get();
    Block JUNGLE_LOG_STAIRS = LOG_STAIRS.get();
    Block ACACIA_LOG_STAIRS = LOG_STAIRS.get();
    Block DARK_OAK_LOG_STAIRS = LOG_STAIRS.get();
    //Stripped
    Block STRIPPED_OAK_LOG_STAIRS = LOG_STAIRS.get();
    Block STRIPPED_SPRUCE_LOG_STAIRS = LOG_STAIRS.get();
    Block STRIPPED_BIRCH_LOG_STAIRS = LOG_STAIRS.get();
    Block STRIPPED_JUNGLE_LOG_STAIRS = LOG_STAIRS.get();
    Block STRIPPED_ACACIA_LOG_STAIRS = LOG_STAIRS.get();
    Block STRIPPED_DARK_OAK_LOG_STAIRS = LOG_STAIRS.get();

    @Override
    public void registerBlocks() {
        //Slabs
        Block.registerBlock(new ResourceLocation("halflogs:oak_log_slab"), OAK_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:spruce_log_slab"), SPRUCE_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:birch_log_slab"), BIRCH_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:jungle_log_slab"), JUNGLE_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:acacia_log_slab"), ACACIA_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:dark_oak_log_slab"), DARK_OAK_LOG_SLAB);
        //Stripped
        Block.registerBlock(new ResourceLocation("halflogs:stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB);

        //Stairs
        Block.registerBlock(new ResourceLocation("halflogs:oak_log_stairs"), OAK_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:spruce_log_stairs"), SPRUCE_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:birch_log_stairs"), BIRCH_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:jungle_log_stairs"), JUNGLE_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:acacia_log_stairs"), ACACIA_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:dark_oak_log_stairs"), DARK_OAK_LOG_STAIRS);
        //Stripped
        Block.registerBlock(new ResourceLocation("halflogs:stripped_oak_log_stairs"), STRIPPED_OAK_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_spruce_log_stairs"), STRIPPED_SPRUCE_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_birch_log_stairs"), STRIPPED_BIRCH_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_jungle_log_stairs"), STRIPPED_JUNGLE_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_acacia_log_stairs"), STRIPPED_ACACIA_LOG_STAIRS);
        Block.registerBlock(new ResourceLocation("halflogs:stripped_dark_oak_log_stairs"), STRIPPED_DARK_OAK_LOG_STAIRS);
    }

    @Override
    public void registerItems() {
        //Slabs
        Item.registerItemBlock(OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        //Stripped
        Item.registerItemBlock(STRIPPED_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);

        //Stairs
        Item.registerItemBlock(OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        //Stripped
        Item.registerItemBlock(STRIPPED_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(STRIPPED_DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
    }
}
