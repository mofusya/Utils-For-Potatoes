package net.mofusya.utils_4_potatoes.screens.screen;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.mofusya.utils_4_potatoes.recipes.book.NetherRackFurnaceRecipeBookComponent;
import net.mofusya.utils_4_potatoes.screens.menu.NetherRackFurnaceMenu;

public class NetherRackFurnaceScreen extends AbstractFurnaceScreen<NetherRackFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/furnace.png");

    public NetherRackFurnaceScreen(NetherRackFurnaceMenu menu, Inventory inventory, Component title) {
        super(menu, new NetherRackFurnaceRecipeBookComponent(), inventory, title, TEXTURE);
    }
}
