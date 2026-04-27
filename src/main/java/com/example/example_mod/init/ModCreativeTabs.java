package com.example.example_mod.init;

import com.example.example_mod.creativetab.ModSections;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import com.example.example_mod.ExampleMod;
import com.example.example_mod.creativetab.Section;
import com.example.example_mod.creativetab.TabLayout;

import java.util.List;

public class ModCreativeTabs {
    public static CreativeModeTab CORE;

    public static void init() {
        List<Section> sections = ModSections.build();
        TabLayout.build(sections); // populates CACHED_ITEMS and SECTION_ROW

        CORE = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, "tab_name"),  // must change to YOUR id
                FabricCreativeModeTab.builder()
                        .icon(() -> new ItemStack(Items.DIAMOND)) // change item icon to what ever
                        .title(Component.translatable("itemGroup.mod_id.tab_name"))
                        .displayItems((params, output) -> {

                            // Intentionally empty — CreativeModeTabMixin overrides buildContents

                        })
                        .build());
    }
}