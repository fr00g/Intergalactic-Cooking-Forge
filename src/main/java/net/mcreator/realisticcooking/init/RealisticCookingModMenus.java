/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realisticcooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.realisticcooking.world.inventory.StoveGUIMenu;
import net.mcreator.realisticcooking.world.inventory.MainCookingMenu;
import net.mcreator.realisticcooking.world.inventory.CookiesGUIMenu;
import net.mcreator.realisticcooking.world.inventory.CookieGUIMenu;
import net.mcreator.realisticcooking.network.MenuStateUpdateMessage;
import net.mcreator.realisticcooking.RealisticCookingMod;

import java.util.Map;

public class RealisticCookingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RealisticCookingMod.MODID);
	public static final RegistryObject<MenuType<StoveGUIMenu>> SOUP_GUI = REGISTRY.register("soup_gui", () -> IForgeMenuType.create(StoveGUIMenu::new));
	public static final RegistryObject<MenuType<CookieGUIMenu>> COOKIE_GUI = REGISTRY.register("cookie_gui", () -> IForgeMenuType.create(CookieGUIMenu::new));
	public static final RegistryObject<MenuType<MainCookingMenu>> MAIN_COOKING = REGISTRY.register("main_cooking", () -> IForgeMenuType.create(MainCookingMenu::new));
	public static final RegistryObject<MenuType<CookiesGUIMenu>> COOKIES_GUI = REGISTRY.register("cookies_gui", () -> IForgeMenuType.create(CookiesGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				RealisticCookingMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof RealisticCookingModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				RealisticCookingMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}