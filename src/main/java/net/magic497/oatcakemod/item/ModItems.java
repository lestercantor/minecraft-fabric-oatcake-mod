package net.magic497.oatcakemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.magic497.oatcakemod.OatcakeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OATCAKE = registerItem("oatcake", new Item(new Item.Settings()
            .food(ModFoodComponents.OATCAKE)));
    public static final Item BATTER = registerItem("oatcake_batter", new Item(new Item.Settings()
            .food(ModFoodComponents.OATCAKE_BATTER)));
    public static final Item CHEESY_OATCAKE = registerItem("cheesy_oatcake", new Item(new Item.Settings()
            .food(ModFoodComponents.CHEESY_OATCAKE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(OATCAKE);
        entries.add(BATTER);
        entries.add(CHEESY_OATCAKE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OatcakeMod.MOD_ID, name), item);

    }

    public static void registerModItems()
    {
        OatcakeMod.LOGGER.info("Registering Mod Items for " + OatcakeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientItemGroup);
    }
}
