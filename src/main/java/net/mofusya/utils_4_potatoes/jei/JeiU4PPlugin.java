package net.mofusya.utils_4_potatoes.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import net.minecraft.resources.ResourceLocation;
import net.mofusya.utils_4_potatoes.UtilsForPotatoes;
import net.mofusya.utils_4_potatoes.blocks.U4PBlocks;

@JeiPlugin
public class JeiU4PPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(UtilsForPotatoes.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalysts(RecipeTypes.SMELTING, U4PBlocks.NETHER_RACK_FURNACE.get());
    }
}
