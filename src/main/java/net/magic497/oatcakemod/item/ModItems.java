package net.magic497.oatcakemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.magic497.oatcakemod.OatcakeMod;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class ModItems {

    public static final Item OATCAKE = registerItem("oatcake", new Item(new Item.Settings()
            .food(ModFoodComponents.OATCAKE)));
    public static final Item BATTER = registerItem("oatcake_batter", new Item(new Item.Settings()
            .food(ModFoodComponents.OATCAKE_BATTER)));
    public static final Item CHEESY_OATCAKE = registerItem("cheesy_oatcake", new Item(new Item.Settings()
            .food(ModFoodComponents.CHEESY_OATCAKE)));

    public static final CustomCakeBlock CHALLENGER = registerCakeBlock("challenger",
            new CustomCakeBlock(Block.Settings.copy(Blocks.CAKE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(OATCAKE);
        entries.add(BATTER);
        entries.add(CHEESY_OATCAKE);
        entries.add(CHALLENGER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OatcakeMod.MOD_ID, name), item);

    }

    private static CustomCakeBlock registerCakeBlock(String name, CustomCakeBlock cakeBlock) {
        registerBlockItem(name, cakeBlock);

        return Registry.register(Registries.BLOCK, Identifier.of(OatcakeMod.MOD_ID, name), cakeBlock);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(OatcakeMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().maxCount(1)));
    }

    public static void registerModItems()
    {
        OatcakeMod.LOGGER.info("Registering Mod Items for " + OatcakeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientItemGroup);
    }
}
