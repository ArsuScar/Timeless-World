
package net.mcreator.timelessworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.timelessworld.itemgroup.TimelessWorldItemGroup;
import net.mcreator.timelessworld.TimelessWorldModElements;

@TimelessWorldModElements.ModElement.Tag
public class CalibrumIngotItem extends TimelessWorldModElements.ModElement {
	@ObjectHolder("timeless_world:calibrum_ingot")
	public static final Item block = null;
	public CalibrumIngotItem(TimelessWorldModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TimelessWorldItemGroup.tab).maxStackSize(64));
			setRegistryName("calibrum_ingot");
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
