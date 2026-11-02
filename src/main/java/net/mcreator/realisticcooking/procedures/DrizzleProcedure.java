package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;

public class DrizzleProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			return "Drizzled With:"
					+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(4).getItem() : ItemStack.EMPTY).getDisplayName().getString()).replace("]",
							"")).replace("[", ""));
		}
		return "Nothing";
	}
}