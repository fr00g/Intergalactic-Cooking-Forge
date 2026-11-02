package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.item.ItemStack;

public class DescriptionOfSoupProcedure {
	public static String execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getString("Desc");
	}
}