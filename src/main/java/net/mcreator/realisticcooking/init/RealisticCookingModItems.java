/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realisticcooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.realisticcooking.item.*;
import net.mcreator.realisticcooking.RealisticCookingMod;

public class RealisticCookingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RealisticCookingMod.MODID);
	public static final RegistryObject<Item> COOKING_STATION;
	public static final RegistryObject<Item> BEEF_SOUP;
	public static final RegistryObject<Item> CHICKEN_SOUP;
	public static final RegistryObject<Item> PORK_SOUP;
	public static final RegistryObject<Item> SALMON_SOUP;
	public static final RegistryObject<Item> COD_SOUP;
	public static final RegistryObject<Item> POTATO_SOUP;
	public static final RegistryObject<Item> CARROT_SOUP;
	public static final RegistryObject<Item> RABBIT_SOUP;
	public static final RegistryObject<Item> MUTTON_SOUP;
	public static final RegistryObject<Item> UNDYING_SOUP;
	public static final RegistryObject<Item> WHEAT_COOKIE;
	public static final RegistryObject<Item> APPLE_COOKIE;
	public static final RegistryObject<Item> CARROT_COOKIE;
	public static final RegistryObject<Item> CHORUS_FRUIT_COOKIE;
	public static final RegistryObject<Item> BEET_COOKIE;
	public static final RegistryObject<Item> KELP_COOKIE;
	public static final RegistryObject<Item> BAMBOO_COOKIE;
	public static final RegistryObject<Item> MAGNET;
	public static final RegistryObject<Item> THING;
	static {
		COOKING_STATION = block(RealisticCookingModBlocks.COOKING_STATION);
		BEEF_SOUP = REGISTRY.register("beef_soup", BeefSoupItem::new);
		CHICKEN_SOUP = REGISTRY.register("chicken_soup", ChickenSoupItem::new);
		PORK_SOUP = REGISTRY.register("pork_soup", PorkSoupItem::new);
		SALMON_SOUP = REGISTRY.register("salmon_soup", SalmonSoupItem::new);
		COD_SOUP = REGISTRY.register("cod_soup", CodSoupItem::new);
		POTATO_SOUP = REGISTRY.register("potato_soup", PotatoSoupbItem::new);
		CARROT_SOUP = REGISTRY.register("carrot_soup", CarrotSoupItem::new);
		RABBIT_SOUP = REGISTRY.register("rabbit_soup", RabbitSoupItem::new);
		MUTTON_SOUP = REGISTRY.register("mutton_soup", MuttonSoupItem::new);
		UNDYING_SOUP = REGISTRY.register("undying_soup", UndyingSoupItem::new);
		WHEAT_COOKIE = REGISTRY.register("wheat_cookie", WheatCookieItem::new);
		APPLE_COOKIE = REGISTRY.register("apple_cookie", AppleCookieItem::new);
		CARROT_COOKIE = REGISTRY.register("carrot_cookie", CarrotCookieItem::new);
		CHORUS_FRUIT_COOKIE = REGISTRY.register("chorus_fruit_cookie", ChorusFruitCookieItem::new);
		BEET_COOKIE = REGISTRY.register("beet_cookie", BeetCookieItem::new);
		KELP_COOKIE = REGISTRY.register("kelp_cookie", KelpCookieItem::new);
		BAMBOO_COOKIE = REGISTRY.register("bamboo_cookie", BambooCookieItem::new);
		MAGNET = REGISTRY.register("magnet", MagnetItem::new);
		THING = REGISTRY.register("thing", ThingItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}