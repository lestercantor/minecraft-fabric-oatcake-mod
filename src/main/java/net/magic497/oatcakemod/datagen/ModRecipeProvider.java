package net.magic497.oatcakemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.magic497.oatcakemod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> OATCAKE_SMELTABLES = List.of(ModItems.BATTER);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, OATCAKE_SMELTABLES, RecipeCategory.MISC, ModItems.OATCAKE,
                0.15f, 200, "oatcake");
        offerBlasting(exporter, OATCAKE_SMELTABLES, RecipeCategory.MISC, ModItems.OATCAKE,
                0.15f, 100, "oatcake");

    }
}
