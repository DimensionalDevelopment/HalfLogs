package org.dimdev.logslabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

public class LogSlabs implements BlockAdder, ItemAdder {
    Block OAK_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F));
    Block SPRUCE_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F));
    Block BIRCH_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F));
    Block JUNGLE_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F));
    Block ACACIA_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F));
    Block DARK_OAK_LOG_SLAB = new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F));

    @Override
    public void registerBlocks(BlockRegistrationReceiver receiver) {
        receiver.registerBlock(new ResourceLocation("logslabs:oak_log_slab"), OAK_LOG_SLAB);
        receiver.registerBlock(new ResourceLocation("logslabs:spruce_log_slab"),  SPRUCE_LOG_SLAB);
        receiver.registerBlock(new ResourceLocation("logslabs:birch_log_slab"), BIRCH_LOG_SLAB);
        receiver.registerBlock(new ResourceLocation("logslabs:jungle_log_slab"), JUNGLE_LOG_SLAB);
        receiver.registerBlock(new ResourceLocation("logslabs:acacia_log_slab"), ACACIA_LOG_SLAB);
        receiver.registerBlock(new ResourceLocation("logslabs:dark_oak_log_slab"), DARK_OAK_LOG_SLAB);
    }

    @Override
    public void registerItems(ItemRegistrationReceiver receiver) {
        receiver.registerItemBlock(OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        receiver.registerItemBlock(SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        receiver.registerItemBlock(BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        receiver.registerItemBlock(JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        receiver.registerItemBlock(ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        receiver.registerItemBlock(DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
    }
}
