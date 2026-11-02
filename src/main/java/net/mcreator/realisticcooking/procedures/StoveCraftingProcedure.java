package net.mcreator.realisticcooking.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.realisticcooking.init.RealisticCookingModMenus;
import net.mcreator.realisticcooking.init.RealisticCookingModItems;

public class StoveCraftingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String Ingredient1 = "";
		String Ingredient2 = "";
		String Ingredient3 = "";
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.BOWL) {
			if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
				if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
					if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack13 = new ItemStack(RealisticCookingModItems.POTATO_SOUP.get()).copy();
									_setstack13.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack13);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.COOKED_SALMON) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack19 = new ItemStack(RealisticCookingModItems.SALMON_SOUP.get()).copy();
									_setstack19.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack19);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COOKED_COD) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack25 = new ItemStack(RealisticCookingModItems.COD_SOUP.get()).copy();
									_setstack25.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack25);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.COOKED_CHICKEN) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu28 ? _menu28.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack31 = new ItemStack(RealisticCookingModItems.CHICKEN_SOUP.get()).copy();
									_setstack31.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack31);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.COOKED_RABBIT) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack37 = new ItemStack(RealisticCookingModItems.RABBIT_SOUP.get()).copy();
									_setstack37.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack37);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.COOKED_BEEF) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack43 = new ItemStack(RealisticCookingModItems.BEEF_SOUP.get()).copy();
									_setstack43.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack43);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.CARROT) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack49 = new ItemStack(RealisticCookingModItems.CARROT_SOUP.get()).copy();
									_setstack49.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack49);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.COOKED_PORKCHOP) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack55 = new ItemStack(RealisticCookingModItems.PORK_SOUP.get()).copy();
									_setstack55.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack55);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.COOKED_MUTTON) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack61 = new ItemStack(RealisticCookingModItems.MUTTON_SOUP.get()).copy();
									_setstack61.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack61);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu62 ? _menu62.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getItem() == Items.TOTEM_OF_UNDYING) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu64 ? _menu64.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
									ItemStack _setstack67 = new ItemStack(RealisticCookingModItems.UNDYING_SOUP.get()).copy();
									_setstack67.setCount(getAmountInGUISlot(entity, 4) + 1);
									_menu.getSlots().get(4).set(_setstack67);
									_player.containerMenu.broadcastChanges();
								}
							}
						}
						Ingredient1 = (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu68 ? _menu68.getSlots().get(0).getItem() : ItemStack.EMPTY).getDisplayName()
								.getString()).replace("[", "")).replace("]", "");
						Ingredient2 = (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu70 ? _menu70.getSlots().get(1).getItem() : ItemStack.EMPTY).getDisplayName()
								.getString()).replace("[", "")).replace("]", "");
						Ingredient3 = (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(2).getItem() : ItemStack.EMPTY).getDisplayName()
								.getString()).replace("[", "")).replace("]", "");
						if (!(((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu74 ? _menu74.getSlots().get(0).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("Desc"))
								.equals(""))) {
							Ingredient1 = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(0).getItem() : ItemStack.EMPTY).getOrCreateTag()
									.getString("Desc")).replace("\u00A76Ingredients:" + "\n", "");
						}
						if (!(((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(1).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("Desc"))
								.equals(""))) {
							Ingredient2 = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(1).getItem() : ItemStack.EMPTY).getOrCreateTag()
									.getString("Desc")).replace("\u00A76Ingredients:" + "\n", "");
						}
						if (!(((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(2).getItem() : ItemStack.EMPTY).getOrCreateTag().getString("Desc"))
								.equals(""))) {
							Ingredient3 = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(2).getItem() : ItemStack.EMPTY).getOrCreateTag()
									.getString("Desc")).replace("\u00A76Ingredients:" + "\n", "");
						}
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(4).getItem() : ItemStack.EMPTY).getOrCreateTag().putString("Desc",
								("\u00A76Ingredients:" + "\n" + "\u00A71" + Ingredient1 + "\n" + "\u00A71" + Ingredient2 + "\n" + "\u00A71" + Ingredient3));
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu94 ? _menu94.getSlots().get(4).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Food",
								(((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem().isEdible()
										? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()
												.getFoodProperties().getNutrition()
										: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu92 ? _menu92.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem().isEdible()
												? (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu92 ? _menu92.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()
														.getFoodProperties().getNutrition()
												: 0)));
						if (entity instanceof Player _player && _player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor _menu) {
							_menu.getSlots().get(0).remove(1);
							_menu.getSlots().get(1).remove(1);
							_menu.getSlots().get(2).remove(1);
							_menu.getSlots().get(3).remove(1);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof RealisticCookingModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}