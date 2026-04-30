package net.mofusya.utils_4_potatoes.screens;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.mofusya.utils_4_potatoes.UtilsForPotatoes;
import net.mofusya.utils_4_potatoes.screens.menu.NetherRackFurnaceMenu;
import net.mofusya.utils_4_potatoes.screens.screen.NetherRackFurnaceScreen;

@Mod.EventBusSubscriber(modid = UtilsForPotatoes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Screen2MenuConnector {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(U4PMenus.NETHER_RACK_FURNACE.get(), NetherRackFurnaceScreen::new);
        });
    }
}
