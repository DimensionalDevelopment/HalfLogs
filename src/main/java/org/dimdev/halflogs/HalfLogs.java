package org.dimdev.halflogs;

import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HalfLogs implements BlockAdder, ItemAdder {
	public static final EnumProperty<EnumFacing.Axis> AXIS = EnumProperty.create("axis", EnumFacing.Axis.class);

	private static BlockStairs createLogStairs() {
		Block block = Blocks.OAK_LOG;

		return new BlockStairs(block.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.WOOD)
				.hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)) {
			@Override
			protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> p_Builder) {
				super.fillStateContainer(p_Builder);
				p_Builder.add(AXIS);
			}

			@Override
			public IBlockState getStateForPlacement(BlockItemUseContext p_getBlockToPlaceOnUse_1_) {
				IBlockState iblockstate = super.getStateForPlacement(p_getBlockToPlaceOnUse_1_);
				iblockstate = iblockstate.with(AXIS, p_getBlockToPlaceOnUse_1_.getFace().getAxis());
				return iblockstate;
			}

			@Override
			public boolean onBlockActivated(IBlockState p_blockState, World p_world, BlockPos p_blockPos,
					EntityPlayer p_player, EnumHand p_hand, EnumFacing p_facing, float hitX, float hitY, float hitZ) {
				ItemStack stack = p_hand == EnumHand.MAIN_HAND ? p_player.getHeldItemMainhand()
						: p_player.getHeldItemOffhand();
				Item item = stack.getItem();
				if (item instanceof ItemAxe) {
					Block strippedBlock;
					if (this == OAK_LOG_STAIRS) {
						strippedBlock = STRIPPED_OAK_LOG_STAIRS;
					} else if (this == SPRUCE_LOG_STAIRS) {
						strippedBlock = STRIPPED_SPRUCE_LOG_STAIRS;
					} else if (this == BIRCH_LOG_STAIRS) {
						strippedBlock = STRIPPED_BIRCH_LOG_STAIRS;
					} else if (this == JUNGLE_LOG_STAIRS) {
						strippedBlock = STRIPPED_JUNGLE_LOG_STAIRS;
					} else if (this == ACACIA_LOG_STAIRS) {
						strippedBlock = STRIPPED_ACACIA_LOG_STAIRS;
					} else if (this == DARK_OAK_LOG_STAIRS) {
						strippedBlock = STRIPPED_DARK_OAK_LOG_STAIRS;
					} else {
						return false;
					}

					p_world.setBlockState(p_blockPos,
							strippedBlock.getDefaultState().with(AXIS, p_blockState.get(AXIS))
									.with(BlockStairs.FACING, p_blockState.get(BlockStairs.FACING))
									.with(BlockStairs.HALF, p_blockState.get(BlockStairs.HALF))
									.with(BlockStairs.SHAPE, p_blockState.get(BlockStairs.SHAPE)));
					p_world.playSound(p_player, p_blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F,
							1.0F);
					stack.damageItem(1, p_player);
					return true;
				}
				return false;
			}
		};
	}

	private static BlockSlab createLogSlab() {
		return new BlockSlab(Block.Properties.create(Material.WOOD, MaterialColor.WOOD)
				.hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)) {
			@Override
			protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> p_Builder) {
				super.fillStateContainer(p_Builder);
				p_Builder.add(AXIS);
			}

			@Override
			public IBlockState getStateForPlacement(BlockItemUseContext p_getBlockToPlaceOnUse_1_) {
				IBlockState iblockstate = super.getStateForPlacement(p_getBlockToPlaceOnUse_1_);
				iblockstate = iblockstate.with(AXIS, p_getBlockToPlaceOnUse_1_.getFace().getAxis());
				return iblockstate;
			}

			@Override
			public boolean onBlockActivated(IBlockState p_blockState, World p_world, BlockPos p_blockPos,
					EntityPlayer p_player, EnumHand p_hand, EnumFacing p_facing, float hitX, float hitY, float hitZ) {
				ItemStack stack = p_hand == EnumHand.MAIN_HAND ? p_player.getHeldItemMainhand()
						: p_player.getHeldItemOffhand();
				Item item = stack.getItem();
				if (item instanceof ItemAxe) {
					Block strippedBlock;
					if (this == OAK_LOG_SLAB) {
						strippedBlock = STRIPPED_OAK_LOG_SLAB;
					} else if (this == SPRUCE_LOG_SLAB) {
						strippedBlock = STRIPPED_SPRUCE_LOG_SLAB;
					} else if (this == BIRCH_LOG_SLAB) {
						strippedBlock = STRIPPED_BIRCH_LOG_SLAB;
					} else if (this == JUNGLE_LOG_SLAB) {
						strippedBlock = STRIPPED_JUNGLE_LOG_SLAB;
					} else if (this == ACACIA_LOG_SLAB) {
						strippedBlock = STRIPPED_ACACIA_LOG_SLAB;
					} else if (this == DARK_OAK_LOG_SLAB) {
						strippedBlock = STRIPPED_DARK_OAK_LOG_SLAB;
					} else {
						return false;
					}

					SlabType slabType = p_blockState.get(BlockSlab.TYPE);
					p_world.setBlockState(p_blockPos, strippedBlock.getDefaultState().with(AXIS, p_blockState.get(AXIS))
							.with(BlockSlab.TYPE, slabType));
					p_world.playSound(p_player, p_blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F,
							1.0F);
					stack.damageItem(slabType == SlabType.DOUBLE ? (p_world.rand.nextBoolean() ? 2 : 1) : 1, p_player); // just
																														// because
					return true;
				}
				return false;
			}
		};
	}

	// Slabs
	public final static Block OAK_LOG_SLAB = createLogSlab();
	public final static Block SPRUCE_LOG_SLAB = createLogSlab();
	public final static Block BIRCH_LOG_SLAB = createLogSlab();
	public final static Block JUNGLE_LOG_SLAB = createLogSlab();
	public final static Block ACACIA_LOG_SLAB = createLogSlab();
	public final static Block DARK_OAK_LOG_SLAB = createLogSlab();
	// Stripped
	public final static Block STRIPPED_OAK_LOG_SLAB = createLogSlab();
	public final static Block STRIPPED_SPRUCE_LOG_SLAB = createLogSlab();
	public final static Block STRIPPED_BIRCH_LOG_SLAB = createLogSlab();
	public final static Block STRIPPED_JUNGLE_LOG_SLAB = createLogSlab();
	public final static Block STRIPPED_ACACIA_LOG_SLAB = createLogSlab();
	public final static Block STRIPPED_DARK_OAK_LOG_SLAB = createLogSlab();

	// Stairs
	public final static Block OAK_LOG_STAIRS = createLogStairs();
	public final static Block SPRUCE_LOG_STAIRS = createLogStairs();
	public final static Block BIRCH_LOG_STAIRS = createLogStairs();
	public final static Block JUNGLE_LOG_STAIRS = createLogStairs();
	public final static Block ACACIA_LOG_STAIRS = createLogStairs();
	public final static Block DARK_OAK_LOG_STAIRS = createLogStairs();
	// Stripped
	public final static Block STRIPPED_OAK_LOG_STAIRS = createLogStairs();
	public final static Block STRIPPED_SPRUCE_LOG_STAIRS = createLogStairs();
	public final static Block STRIPPED_BIRCH_LOG_STAIRS = createLogStairs();
	public final static Block STRIPPED_JUNGLE_LOG_STAIRS = createLogStairs();
	public final static Block STRIPPED_ACACIA_LOG_STAIRS = createLogStairs();
	public final static Block STRIPPED_DARK_OAK_LOG_STAIRS = createLogStairs();

	@Override
	public void registerBlocks() {
		// Slabs
		Block.register(new ResourceLocation("halflogs:oak_log_slab"), OAK_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:spruce_log_slab"), SPRUCE_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:birch_log_slab"), BIRCH_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:jungle_log_slab"), JUNGLE_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:acacia_log_slab"), ACACIA_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:dark_oak_log_slab"), DARK_OAK_LOG_SLAB);
		// Stripped
		Block.register(new ResourceLocation("halflogs:stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB);
		Block.register(new ResourceLocation("halflogs:stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB);

		// Stairs
		Block.register(new ResourceLocation("halflogs:oak_log_stairs"), OAK_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:spruce_log_stairs"), SPRUCE_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:birch_log_stairs"), BIRCH_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:jungle_log_stairs"), JUNGLE_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:acacia_log_stairs"), ACACIA_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:dark_oak_log_stairs"), DARK_OAK_LOG_STAIRS);
		// Stripped
		Block.register(new ResourceLocation("halflogs:stripped_oak_log_stairs"), STRIPPED_OAK_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:stripped_spruce_log_stairs"), STRIPPED_SPRUCE_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:stripped_birch_log_stairs"), STRIPPED_BIRCH_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:stripped_jungle_log_stairs"), STRIPPED_JUNGLE_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:stripped_acacia_log_stairs"), STRIPPED_ACACIA_LOG_STAIRS);
		Block.register(new ResourceLocation("halflogs:stripped_dark_oak_log_stairs"), STRIPPED_DARK_OAK_LOG_STAIRS);
	}

	@Override
	public void registerItems() {
		// Slabs
		Item.register(OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		// Stripped
		Item.register(STRIPPED_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_SPRUCE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_BIRCH_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_JUNGLE_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_ACACIA_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_DARK_OAK_LOG_SLAB, ItemGroup.BUILDING_BLOCKS);

		// Stairs
		Item.register(OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		// Stripped
		Item.register(STRIPPED_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_SPRUCE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_BIRCH_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_JUNGLE_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_ACACIA_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
		Item.register(STRIPPED_DARK_OAK_LOG_STAIRS, ItemGroup.BUILDING_BLOCKS);
	}
}
