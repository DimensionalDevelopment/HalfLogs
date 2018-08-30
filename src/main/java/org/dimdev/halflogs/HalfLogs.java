package org.dimdev.halflogs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

import java.util.function.Supplier;

public class HalfLogs implements BlockAdder, ItemAdder {
    public static final EnumProperty<EnumFacing.Axis> AXIS = EnumProperty.<EnumFacing.Axis>create("axis", EnumFacing.Axis.class);

    private static Supplier<BlockStairs> LOG_STAIRS = () -> {
        Block block = Blocks.OAK_LOG;

        return new BlockStairs(block.getDefaultState(), Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)) {
            @Override
            protected void fillStateContainer(StateContainer.Builder<Block,IBlockState> p_Builder) {
                super.fillStateContainer(p_Builder);
                p_Builder.add(AXIS);
            }

            @Override
            public IBlockState getStateForPlacement(BlockItemUseContext p_getBlockToPlaceOnUse_1_)
            {
                IBlockState iblockstate = super.getStateForPlacement(p_getBlockToPlaceOnUse_1_);
                iblockstate = iblockstate.withProperty(AXIS, p_getBlockToPlaceOnUse_1_.func_196010_d().getAxis());
                return iblockstate;
            }
        };
    };

    private static Supplier<BlockSlab> LOG_SLABS = () -> {

        return new BlockSlab(Block.Builder.create(Material.WOOD, MapColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)) {
            @Override
            protected void fillStateContainer(StateContainer.Builder<Block,IBlockState> p_Builder) {
                super.fillStateContainer(p_Builder);
                p_Builder.add(AXIS);
            }

            @Override
            public IBlockState getStateForPlacement(BlockItemUseContext p_getBlockToPlaceOnUse_1_)
            {
                IBlockState iblockstate = super.getStateForPlacement(p_getBlockToPlaceOnUse_1_);
                iblockstate = iblockstate.withProperty(AXIS, p_getBlockToPlaceOnUse_1_.func_196010_d().getAxis());
                return iblockstate;
            }
        };
    };

    //Slabs
    Block OAK_LOG_SLAB = LOG_SLABS.get();
    Block SPRUCE_LOG_SLAB = LOG_SLABS.get();
    Block BIRCH_LOG_SLAB = LOG_SLABS.get();
    Block JUNGLE_LOG_SLAB = LOG_SLABS.get();
    Block ACACIA_LOG_SLAB = LOG_SLABS.get();
    Block DARK_OAK_LOG_SLAB = LOG_SLABS.get();
    //Stripped
    Block STRIPPED_OAK_LOG_SLAB = LOG_SLABS.get();
    Block STRIPPED_SPRUCE_LOG_SLAB = LOG_SLABS.get();
    Block STRIPPED_BIRCH_LOG_SLAB = LOG_SLABS.get();
    Block STRIPPED_JUNGLE_LOG_SLAB = LOG_SLABS.get();
    Block STRIPPED_ACACIA_LOG_SLAB = LOG_SLABS.get();
    Block STRIPPED_DARK_OAK_LOG_SLAB = LOG_SLABS.get();

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
        Block.register(new ResourceLocation("halflogs:oak_log_slab"), OAK_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:spruce_log_slab"), SPRUCE_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:birch_log_slab"), BIRCH_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:jungle_log_slab"), JUNGLE_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:acacia_log_slab"), ACACIA_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:dark_oak_log_slab"), DARK_OAK_LOG_SLAB);
        //Stripped
        Block.register(new ResourceLocation("halflogs:stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB);
        Block.register(new ResourceLocation("halflogs:stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB);

        //Stairs
        Block.register(new ResourceLocation("halflogs:oak_log_stairs"), OAK_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:spruce_log_stairs"), SPRUCE_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:birch_log_stairs"), BIRCH_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:jungle_log_stairs"), JUNGLE_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:acacia_log_stairs"), ACACIA_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:dark_oak_log_stairs"), DARK_OAK_LOG_STAIRS);
        //Stripped
        Block.register(new ResourceLocation("halflogs:stripped_oak_log_stairs"), STRIPPED_OAK_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:stripped_spruce_log_stairs"), STRIPPED_SPRUCE_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:stripped_birch_log_stairs"), STRIPPED_BIRCH_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:stripped_jungle_log_stairs"), STRIPPED_JUNGLE_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:stripped_acacia_log_stairs"), STRIPPED_ACACIA_LOG_STAIRS);
        Block.register(new ResourceLocation("halflogs:stripped_dark_oak_log_stairs"), STRIPPED_DARK_OAK_LOG_STAIRS);
    }

    @Override
    public void registerItems() {
        //Slabs
        Item.register(OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        //Stripped
        Item.register(STRIPPED_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);

        //Stairs
        Item.register(OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        //Stripped
        Item.register(STRIPPED_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
        Item.register(STRIPPED_DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
    }
}
