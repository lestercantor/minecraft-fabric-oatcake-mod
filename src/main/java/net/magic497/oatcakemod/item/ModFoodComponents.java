package net.magic497.oatcakemod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent OATCAKE_BATTER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.85f).build();

    public static final FoodComponent OATCAKE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2f)
            .build();

    public static final FoodComponent CHEESY_OATCAKE = new FoodComponent.Builder().nutrition(7).saturationModifier(1.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 70), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 140), 1.0f).build();
}
