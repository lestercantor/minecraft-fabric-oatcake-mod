package net.magic497.oatcakemod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent OATCAKE_BATTER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.75f).build();

    public static final FoodComponent OATCAKE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2f)
            .build();

    public static final FoodComponent CHEESY_OATCAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 100), 0.05f).build();
}
