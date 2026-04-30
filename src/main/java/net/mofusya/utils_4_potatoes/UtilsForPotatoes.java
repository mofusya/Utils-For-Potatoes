package net.mofusya.utils_4_potatoes;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mofusya.utils_4_potatoes.blocks.U4PBlockEntities;
import net.mofusya.utils_4_potatoes.blocks.U4PBlocks;
import net.mofusya.utils_4_potatoes.items.U4PItems;
import net.mofusya.utils_4_potatoes.screens.U4PMenus;
import org.slf4j.Logger;

@Mod(UtilsForPotatoes.MOD_ID)
public class UtilsForPotatoes {
    public static final String MOD_ID = "utils_4_potatoes";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UtilsForPotatoes() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        U4PItems.ITEMS.register(modEventBus);
        U4PBlocks.BLOCKS.register(modEventBus);
        U4PBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        U4PMenus.MENUS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(U4PBlocks.NETHER_RACK_FURNACE);
        } else if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(U4PBlocks.NETHER_RACK_FURNACE);
        }
    }
}
