package com.example.example_mod.init;

import com.example.example_mod.ExampleMod;
import com.example.example_mod.item.ExampleItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static Item EXAMPLE_ITEM;

    public static void init() {
        EXAMPLE_ITEM = createItem("example_item", properties -> new ExampleItem(properties.stacksTo(64)));
    }

    private static Item createItem(String name, Function<Item.Properties, Item> function) {
        Identifier id = Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(BuiltInRegistries.ITEM.key(), id);
        return Registry.register(
                BuiltInRegistries.ITEM,
                id,
                function.apply(new Item.Properties().setId(key))
        );
    }
}
