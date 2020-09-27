
package net.mcreator.timelessworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.timelessworld.item.CalibrumIngotItem;
import net.mcreator.timelessworld.TimelessWorldModElements;

@TimelessWorldModElements.ModElement.Tag
public class TimelessWorldItemGroup extends TimelessWorldModElements.ModElement {
	public TimelessWorldItemGroup(TimelessWorldModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtimeless_world") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CalibrumIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
