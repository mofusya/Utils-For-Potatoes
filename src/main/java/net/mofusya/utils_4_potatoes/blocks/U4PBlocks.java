package net.mofusya.utils_4_potatoes.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.ornatelib.registries.OrnateBlockDeferredRegister;
import net.mofusya.utils_4_potatoes.UtilsForPotatoes;
import net.mofusya.utils_4_potatoes.blocks.block.NetherRackFurnaceBlock;

public class U4PBlocks {
    public static final OrnateBlockDeferredRegister BLOCKS = OrnateBlockDeferredRegister.create(UtilsForPotatoes.MOD_ID);

    public static final RegistryObject<Block> NETHER_RACK_FURNACE = BLOCKS.register("nether_rack_furnace", new OrnateBlockDeferredRegister.Builder()
            .blockBuildRef(Blocks.FURNACE)
            .blockFunc(NetherRackFurnaceBlock::new)
    );
}
