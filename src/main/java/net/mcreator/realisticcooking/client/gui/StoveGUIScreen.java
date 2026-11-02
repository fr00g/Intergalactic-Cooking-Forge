package net.mcreator.realisticcooking.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.realisticcooking.world.inventory.StoveGUIMenu;
import net.mcreator.realisticcooking.procedures.SoupNameProcedure;
import net.mcreator.realisticcooking.procedures.SoupFoodPointsProcedure;
import net.mcreator.realisticcooking.procedures.Ingredient3Procedure;
import net.mcreator.realisticcooking.procedures.Ingredient2Procedure;
import net.mcreator.realisticcooking.procedures.Ingredient1Procedure;
import net.mcreator.realisticcooking.network.StoveGUIButtonMessage;
import net.mcreator.realisticcooking.init.RealisticCookingModScreens;
import net.mcreator.realisticcooking.RealisticCookingMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoveGUIScreen extends AbstractContainerScreen<StoveGUIMenu> implements RealisticCookingModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_craft;
	private Button button_empty1;
	private Button button_empty2;
	private Button button_empty3;
	private Button button_empty4;
	private Button button_empty5;
	private Button button_empty6;
	private Button button_empty;
	private static final ResourceLocation IMAGE_0 = new ResourceLocation("realistic_cooking:textures/screens/stove_gui.png");

	public StoveGUIScreen(StoveGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 428;
		this.imageHeight = 241;
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
		guiGraphics.blit(IMAGE_0, this.leftPos + 0, this.topPos + -1, 0, 0, 428, 241, 428, 241);
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
		guiGraphics.drawString(this.font, SoupNameProcedure.execute(entity), 24, 62, -12829636, false);
		guiGraphics.drawString(this.font, SoupFoodPointsProcedure.execute(entity), 24, 80, -12829636, false);
		guiGraphics.drawString(this.font, Ingredient1Procedure.execute(entity), 24, 116, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.realistic_cooking.soup_gui.label_ingredients"), 24, 98, -12829636, false);
		guiGraphics.drawString(this.font, Ingredient2Procedure.execute(entity), 24, 134, -12829636, false);
		guiGraphics.drawString(this.font, Ingredient3Procedure.execute(entity), 24, 152, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_craft = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_craft"), e -> {
			int x = StoveGUIScreen.this.x;
			int y = StoveGUIScreen.this.y;
			if (true) {
				RealisticCookingMod.PACKET_HANDLER.sendToServer(new StoveGUIButtonMessage(0, x, y, z));
				StoveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 179, 50, 20).build();
		this.addRenderableWidget(button_craft);
		button_empty1 = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty1"), e -> {
		}).bounds(this.leftPos + 201, this.topPos + 18, 19, 20).build();
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty2"), e -> {
		}).bounds(this.leftPos + 220, this.topPos + 18, 19, 20).build();
		this.addRenderableWidget(button_empty2);
		button_empty3 = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty3"), e -> {
		}).bounds(this.leftPos + 239, this.topPos + 18, 19, 20).build();
		this.addRenderableWidget(button_empty3);
		button_empty4 = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty4"), e -> {
		}).bounds(this.leftPos + 258, this.topPos + 18, 19, 20).build();
		this.addRenderableWidget(button_empty4);
		button_empty5 = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty5"), e -> {
		}).bounds(this.leftPos + 277, this.topPos + 18, 19, 20).build();
		this.addRenderableWidget(button_empty5);
		button_empty6 = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty6"), e -> {
		}).bounds(this.leftPos + 296, this.topPos + 18, 20, 20).build();
		this.addRenderableWidget(button_empty6);
		button_empty = Button.builder(Component.translatable("gui.realistic_cooking.soup_gui.button_empty"), e -> {
		}).bounds(this.leftPos + 182, this.topPos + 18, 19, 20).build();
		this.addRenderableWidget(button_empty);
	}
}