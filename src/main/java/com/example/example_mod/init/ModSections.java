package com.example.example_mod.init;

import com.example.example_mod.creativetab.Section;
import com.example.example_mod.creativetab.SectionColored;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Items;

import java.util.List;

public class ModSections {

    public static List<Section> ALL = List.of();

    public static List<Section> build() {
        ALL = List.of(
                new SectionColored(
                        "section_1",
                        Component.translatable("itemGroup.mod_id.section_1"),
                        0xFF1a1a2e,   // ARGB banner background
                        0xFFFFFFFF, // Text Color
                        List.of(
                                Items.DIAMOND
                        )
                ),
                new SectionColored(
                        "section_2",
                        Component.translatable("itemGroup.mod_id.section_2"),
                        0xFF1a2e1a,
                        0xFFFFFFFF,
                        List.of(
                                Items.END_PORTAL_FRAME
                        )
                ),
                new SectionColored(
                        "section_3",
                        Component.translatable("itemGroup.mod_id.section_3"),
                        0xFFcc6600,
                        0xFFFFFFFF,
                        List.of(
                                Items.COPPER_HELMET,
                                Items.COPPER_CHESTPLATE,
                                Items.COPPER_LEGGINGS,
                                Items.COPPER_BOOTS,

                                Items.COPPER_INGOT,
                                Items.COPPER_NUGGET,

                                Items.COPPER_SWORD,
                                Items.COPPER_AXE,
                                Items.COPPER_PICKAXE,
                                Items.COPPER_SHOVEL,
                                Items.COPPER_HOE
                        )
                )
//              Example of a textured section
//                SectionTextured.of(
//                        YourMod.MOD_ID, "name",
//                        Component.translatable("itemgroup.mod_id.name"),
//                        0xFFFFAAAA,
//                        List.of(
//
//                        )
//                )
        );
        return ALL;
    }
}