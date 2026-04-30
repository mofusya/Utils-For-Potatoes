package net.mofusya.utils_4_potatoes.mixin;

import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.mofusya.utils_4_potatoes.mixin_accessor.AbstractFurnaceBlockEntityAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({AbstractFurnaceBlockEntity.class})
public class AbstractFurnaceBlockEntityMixin implements AbstractFurnaceBlockEntityAccessor {
    @Shadow
    int litTime;


    @Override
    public int getLitTime$U4P() {
        return this.litTime;
    }

    @Override
    public void setLitTime$U4P(int litTime) {
        this.litTime = litTime;
    }
}
