package com.example.example_mod.init;

import com.example.example_mod.ExampleMod;
import com.example.example_mod.block.ExampleBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {

    public static Block EXAMPLE_BLOCK;

    public static void init() {

        EXAMPLE_BLOCK = createBlock("example_block",
                properties -> new ExampleBlock(properties.destroyTime(1.0F)));

    }

    private static Block createBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Identifier id = Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(BuiltInRegistries.BLOCK.key(), id);
        ResourceKey<Item> itemKey = ResourceKey.create(BuiltInRegistries.ITEM.key(), id);

        Block block = Registry.register(
                BuiltInRegistries.BLOCK,
                id,
                function.apply(BlockBehaviour.Properties.of().setId(blockKey))
        );

        Registry.register(
                BuiltInRegistries.ITEM,
                id,
                new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix())
        );

        return block;
    }

    private static Block createBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Identifier id = Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(BuiltInRegistries.BLOCK.key(), id);

        return Registry.register(
                BuiltInRegistries.BLOCK,
                id,
                function.apply(BlockBehaviour.Properties.of().setId(key))
        );
    }
}
