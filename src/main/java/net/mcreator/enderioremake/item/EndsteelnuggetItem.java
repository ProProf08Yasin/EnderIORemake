
package net.mcreator.enderioremake.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.enderioremake.itemgroup.EnderIORemakeItemGroup;
import net.mcreator.enderioremake.EnderIoRemakeModElements;

@EnderIoRemakeModElements.ModElement.Tag
public class EndsteelnuggetItem extends EnderIoRemakeModElements.ModElement {
	@ObjectHolder("ender_io_remake:endsteelnugget")
	public static final Item block = null;

	public EndsteelnuggetItem(EnderIoRemakeModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EnderIORemakeItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("endsteelnugget");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
