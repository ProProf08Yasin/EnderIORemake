
package net.mcreator.enderioremake.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.enderioremake.itemgroup.EnderIORemakeItemGroup;
import net.mcreator.enderioremake.EnderIoRemakeModElements;

import java.util.List;
import java.util.Collections;

@EnderIoRemakeModElements.ModElement.Tag
public class SimplemachinechasisBlock extends EnderIoRemakeModElements.ModElement {
	@ObjectHolder("ender_io_remake:simplemachinechasis")
	public static final Block block = null;

	public SimplemachinechasisBlock(EnderIoRemakeModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(EnderIORemakeItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(4f, 6f).setLightLevel(s -> 0));
			setRegistryName("simplemachinechasis");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
