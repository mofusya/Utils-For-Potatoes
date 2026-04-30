package net.mofusya.utils_4_potatoes.screens.menu;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.mofusya.utils_4_potatoes.screens.U4PMenus;

public class NetherRackFurnaceMenu extends AbstractFurnaceMenu {
    public NetherRackFurnaceMenu(int containerId, Inventory inventory, FriendlyByteBuf buf) {
        this(containerId, inventory);
    }

    public NetherRackFurnaceMenu(int containerId, Inventory inventory, Container container, ContainerData data) {
        super(U4PMenus.NETHER_RACK_FURNACE.get(), RecipeType.SMELTING, RecipeBookType.FURNACE, containerId, inventory, container, data);
    }

    public NetherRackFurnaceMenu(int containerId, Inventory inventory) {
        super(U4PMenus.NETHER_RACK_FURNACE.get(), RecipeType.SMELTING, RecipeBookType.FURNACE, containerId, inventory);
    }

    @Override
    protected boolean isFuel(ItemStack itemStack) {
        return false;
    }
}
