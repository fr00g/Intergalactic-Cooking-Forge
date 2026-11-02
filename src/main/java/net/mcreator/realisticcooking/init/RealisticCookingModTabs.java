/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realisticcooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.realisticcooking.RealisticCookingMod;

public class RealisticCookingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RealisticCookingMod.MODID);
	public static final RegistryObject<CreativeModeTab> REALSISTIC_COOKING = REGISTRY.register("realsistic_cooking",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.realistic_cooking.realsistic_cooking")).icon(() -> new ItemStack(RealisticCookingModBlocks.COOKING_STATION.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RealisticCookingModBlocks.COOKING_STATION.get().asItem());
				tabData.accept(RealisticCookingModItems.MAGNET.get());
			}).build());
}