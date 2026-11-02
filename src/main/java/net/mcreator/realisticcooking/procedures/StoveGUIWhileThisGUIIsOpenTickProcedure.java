package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;
import net.mcreator.realisticcooking.init.RealisticCookingModItems;

public class StoveGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_BEEF) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == RealisticCookingModItems.BEEF_SOUP
						.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack6 = new ItemStack(RealisticCookingModItems.BEEF_SOUP.get()).copy();
						_setstack6.setCount(1);
						_menu.getSlots().get(5).set(_setstack6);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.CHICKEN_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack11 = new ItemStack(RealisticCookingModItems.CHICKEN_SOUP.get()).copy();
						_setstack11.setCount(1);
						_menu.getSlots().get(5).set(_setstack11);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_PORKCHOP) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.PORK_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack16 = new ItemStack(RealisticCookingModItems.PORK_SOUP.get()).copy();
						_setstack16.setCount(1);
						_menu.getSlots().get(5).set(_setstack16);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_SALMON) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.SALMON_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack21 = new ItemStack(RealisticCookingModItems.SALMON_SOUP.get()).copy();
						_setstack21.setCount(1);
						_menu.getSlots().get(5).set(_setstack21);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_COD) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.COD_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack26 = new ItemStack(RealisticCookingModItems.COD_SOUP.get()).copy();
						_setstack26.setCount(1);
						_menu.getSlots().get(5).set(_setstack26);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.POTATO_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack31 = new ItemStack(RealisticCookingModItems.POTATO_SOUP.get()).copy();
						_setstack31.setCount(1);
						_menu.getSlots().get(5).set(_setstack31);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.CARROT) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.CARROT_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack36 = new ItemStack(RealisticCookingModItems.CARROT_SOUP.get()).copy();
						_setstack36.setCount(1);
						_menu.getSlots().get(5).set(_setstack36);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu37 ? _menu37.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_RABBIT) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu39 ? _menu39.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.RABBIT_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack41 = new ItemStack(RealisticCookingModItems.RABBIT_SOUP.get()).copy();
						_setstack41.setCount(1);
						_menu.getSlots().get(5).set(_setstack41);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu42 ? _menu42.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_MUTTON) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == RealisticCookingModItems.MUTTON_SOUP.get())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
						ItemStack _setstack46 = new ItemStack(RealisticCookingModItems.MUTTON_SOUP.get()).copy();
						_setstack46.setCount(1);
						_menu.getSlots().get(5).set(_setstack46);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
					ItemStack _setstack47 = new ItemStack(Blocks.AIR).copy();
					_setstack47.setCount(1);
					_menu.getSlots().get(5).set(_setstack47);
					_player.containerMenu.broadcastChanges();
				}
			}
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(5).getItem() : ItemStack.EMPTY).getOrCreateTag().putString("Desc",
					("\u00A76Ingredients:" + "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))
							+ "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))
							+ "\n" + "\u00A71"
							+ ((((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									.replace("[", "")).replace("]", ""))));
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
				ItemStack _setstack56 = new ItemStack(Blocks.AIR).copy();
				_setstack56.setCount(1);
				_menu.getSlots().get(5).set(_setstack56);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}