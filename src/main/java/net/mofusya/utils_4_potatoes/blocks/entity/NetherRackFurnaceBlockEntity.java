package net.mofusya.utils_4_potatoes.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.mofusya.utils_4_potatoes.blocks.U4PBlockEntities;
import net.mofusya.utils_4_potatoes.mixin_accessor.AbstractFurnaceBlockEntityAccessor;
import net.mofusya.utils_4_potatoes.screens.menu.NetherRackFurnaceMenu;

public class NetherRackFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public NetherRackFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(U4PBlockEntities.NETHER_RACK_FURNACE.get(), pos, state, RecipeType.SMELTING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.utils_4_potatoes.nether_rack_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new NetherRackFurnaceMenu(containerId, inventory, this, this.dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack itemStack) {
        return 0;
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        ((AbstractFurnaceBlockEntityAccessor) this).setLitTime$U4P(200);
        serverTick(level, pos, state, this);
    }
}
