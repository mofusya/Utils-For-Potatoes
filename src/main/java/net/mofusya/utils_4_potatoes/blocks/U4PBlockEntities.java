package net.mofusya.utils_4_potatoes.blocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.utils_4_potatoes.UtilsForPotatoes;
import net.mofusya.utils_4_potatoes.blocks.entity.NetherRackFurnaceBlockEntity;

public class U4PBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UtilsForPotatoes.MOD_ID);

    public static final RegistryObject<BlockEntityType<NetherRackFurnaceBlockEntity>> NETHER_RACK_FURNACE =
            BLOCK_ENTITIES.register("nether_rack_furnace", () ->
                    BlockEntityType.Builder.of(NetherRackFurnaceBlockEntity::new,
                            U4PBlocks.NETHER_RACK_FURNACE.get()).build(null));
}
