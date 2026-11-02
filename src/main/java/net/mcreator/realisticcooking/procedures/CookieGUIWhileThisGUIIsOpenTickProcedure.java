package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;
import net.mcreator.realisticcooking.init.RealisticCookingModItems;

public class CookieGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.WHEAT) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.WHEAT_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack6 = new ItemStack(RealisticCookingModItems.WHEAT_COOKIE.get()).copy();
						_setstack6.setCount(1);
						_menu.getSlots().get(6).set(_setstack6);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.APPLE) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.APPLE_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack11 = new ItemStack(RealisticCookingModItems.APPLE_COOKIE.get()).copy();
						_setstack11.setCount(1);
						_menu.getSlots().get(6).set(_setstack11);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.CARROT) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.CARROT_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack16 = new ItemStack(RealisticCookingModItems.CARROT_COOKIE.get()).copy();
						_setstack16.setCount(1);
						_menu.getSlots().get(6).set(_setstack16);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.CHORUS_FRUIT) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.CHORUS_FRUIT_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack21 = new ItemStack(RealisticCookingModItems.CHORUS_FRUIT_COOKIE.get()).copy();
						_setstack21.setCount(1);
						_menu.getSlots().get(6).set(_setstack21);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.BEET_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack26 = new ItemStack(RealisticCookingModItems.BEET_COOKIE.get()).copy();
						_setstack26.setCount(1);
						_menu.getSlots().get(6).set(_setstack26);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.DRIED_KELP) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.KELP_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack31 = new ItemStack(RealisticCookingModItems.KELP_COOKIE.get()).copy();
						_setstack31.setCount(1);
						_menu.getSlots().get(6).set(_setstack31);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.BAMBOO.asItem()) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(6).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.BAMBOO_COOKIE.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack36 = new ItemStack(RealisticCookingModItems.BAMBOO_COOKIE.get()).copy();
						_setstack36.setCount(1);
						_menu.getSlots().get(6).set(_setstack36);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
					ItemStack _setstack37 = new ItemStack(Blocks.AIR).copy();
					_setstack37.setCount(1);
					_menu.getSlots().get(6).set(_setstack37);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(5).getItem() : ItemStack.EMPTY).getOrCreateTag().putString("Desc",
					("\u00A76Ingredients:" + "\n" + "\u00A72Dough:" + "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))
							+ "\n" + "\u00A72Sweetener:" + "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))
							+ "\n" + "\u00A72Toppings:" + "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu42 ? _menu42.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))
							+ "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(3).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))
							+ "\n" + "\u00A72Drizzle:" + "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(4).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))));
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
				ItemStack _setstack50 = new ItemStack(Blocks.AIR).copy();
				_setstack50.setCount(1);
				_menu.getSlots().get(6).set(_setstack50);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}