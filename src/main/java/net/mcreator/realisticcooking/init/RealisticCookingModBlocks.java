/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realisticcooking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.realisticcooking.block.CookingStationBlock;
import net.mcreator.realisticcooking.RealisticCookingMod;

public class RealisticCookingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RealisticCookingMod.MODID);
	public static final RegistryObject<Block> COOKING_STATION;
	static {
		COOKING_STATION = REGISTRY.register("cooking_station", CookingStationBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}