package net.mofusya.utils_4_potatoes.mixin_accessor;

import java.util.function.Function;

public interface AbstractFurnaceBlockEntityAccessor {
    int getLitTime$U4P();

    void setLitTime$U4P(int litTime);

    default void modifyLitTime$U4P(Function<Integer, Integer> modifyFunc) {
        this.setLitTime$U4P(modifyFunc.apply(this.getLitTime$U4P()));
    }
}