package net.mofusya.utils_4_potatoes.blocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import net.mofusya.utils_4_potatoes.blocks.U4PBlockEntities;
import net.mofusya.utils_4_potatoes.blocks.entity.NetherRackFurnaceBlockEntity;
import org.jetbrains.annotations.Nullable;

public class NetherRackFurnaceBlock extends AbstractFurnaceBlock {
    public NetherRackFurnaceBlock(Properties build) {
        super(build);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {

        return super.use(state, level, pos, player, hand, result);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof NetherRackFurnaceBlockEntity) {
            NetworkHooks.openScreen((ServerPlayer) player, (MenuProvider) blockEntity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new NetherRackFurnaceBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (level.isClientSide) {
            return null;
        }
        return createTickerHelper(type, U4PBlockEntities.NETHER_RACK_FURNACE.get(),
                (sLevel, sPos, sState, sBlockEntity) -> sBlockEntity.tick(sLevel, sPos, sState));
    }
}
