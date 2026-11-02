package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;

public class ToppingsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())
				&& !((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			return ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString()).replace("]", ""))
					.replace("[", "")) + " "
					+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).getDisplayName().getString()).replace("]",
							"")).replace("[", ""));
		}
		return "Nothing";
	}
}