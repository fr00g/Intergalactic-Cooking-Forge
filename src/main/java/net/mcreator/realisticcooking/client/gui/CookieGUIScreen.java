package net.mcreator.realisticcooking.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.realisticcooking.world.inventory.CookieGUIMenu;
import net.mcreator.realisticcooking.procedures.ToppingsProcedure;
import net.mcreator.realisticcooking.procedures.SweetenerProcedure;
import net.mcreator.realisticcooking.procedures.DrizzleProcedure;
import net.mcreator.realisticcooking.procedures.CookieNameProcedure;
import net.mcreator.realisticcooking.init.RealisticCookingModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class CookieGUIScreen extends AbstractContainerScreen<CookieGUIMenu> implements RealisticCookingModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_craft;
	private static final ResourceLocation IMAGE_0 = new ResourceLocation("realistic_cooking:textures/screens/cookie_gui.png");

	public CookieGUIScreen(CookieGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 430;
		this.imageHeight = 243;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(IMAGE_0, this.leftPos + 0, this.topPos + 0, 0, 0, 430, 243, 430, 243);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_dough"), 97, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_sweetener"), 97, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_topping_1"), 97, 99, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_topping_2"), 97, 126, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_drizzle"), 97, 153, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_cookie"), 97, 180, -12829636, false);
		guiGraphics.drawString(this.font, CookieNameProcedure.execute(entity), 187, 27, -12829636, false);
		guiGraphics.drawString(this.font, SweetenerProcedure.execute(entity), 187, 45, -12829636, false);
		guiGraphics.drawString(this.font, ToppingsProcedure.execute(entity), 187, 81, -12829636, false);
		guiGraphics.drawString(this.font, DrizzleProcedure.execute(entity), 187, 99, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.cookie_gui.label_toppings1"), 187, 63, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_craft = Button.builder(Component.translatable("gui.realistic_cooking.cookie_gui.button_craft"), e -> {
		}).bounds(this.leftPos + 88, this.topPos + 207, 50, 20).build();
		this.addRenderableWidget(button_craft);
	}
}