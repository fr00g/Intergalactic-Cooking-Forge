/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realisticcooking.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.realisticcooking.client.gui.StoveGUIScreen;
import net.mcreator.realisticcooking.client.gui.MainCookingScreen;
import net.mcreator.realisticcooking.client.gui.CookiesGUIScreen;
import net.mcreator.realisticcooking.client.gui.CookieGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RealisticCookingModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RealisticCookingModMenus.SOUP_GUI.get(), StoveGUIScreen::new);
			MenuScreens.register(RealisticCookingModMenus.COOKIE_GUI.get(), CookieGUIScreen::new);
			MenuScreens.register(RealisticCookingModMenus.MAIN_COOKING.get(), MainCookingScreen::new);
			MenuScreens.register(RealisticCookingModMenus.COOKIES_GUI.get(), CookiesGUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}