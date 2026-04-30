package net.mofusya.utils_4_potatoes.screens;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.utils_4_potatoes.UtilsForPotatoes;
import net.mofusya.utils_4_potatoes.screens.menu.NetherRackFurnaceMenu;

public class U4PMenus {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, UtilsForPotatoes.MOD_ID);

    public static final RegistryObject<MenuType<NetherRackFurnaceMenu>> NETHER_RACK_FURNACE =
            register(NetherRackFurnaceMenu::new, "nether_rack_furnace");

    private static <TYPE extends AbstractContainerMenu> RegistryObject<MenuType<TYPE>> register(IContainerFactory<TYPE> factory, String name){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }
}
