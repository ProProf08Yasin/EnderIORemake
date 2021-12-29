
package net.mcreator.enderioremake.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.enderioremake.item.YetawrenchItem;
import net.mcreator.enderioremake.EnderIoRemakeModElements;

@EnderIoRemakeModElements.ModElement.Tag
public class EnderIORemakeItemGroup extends EnderIoRemakeModElements.ModElement {
	public EnderIORemakeItemGroup(EnderIoRemakeModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabender_io_remake") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(YetawrenchItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
