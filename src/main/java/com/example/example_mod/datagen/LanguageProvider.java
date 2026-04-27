package com.example.example_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import com.example.example_mod.init.*;

import java.util.concurrent.CompletableFuture;

public class LanguageProvider extends FabricLanguageProvider {
    public LanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {

        translationBuilder.add("itemGroup.mod_id.tab_name", "Example Tab");
        translationBuilder.add("itemGroup.mod_id.section_1", "Tab Section 1");
        translationBuilder.add("itemGroup.mod_id.section_2", "Tab Section 2");
        translationBuilder.add("itemGroup.mod_id.section_3", "Tab Section 3");

        translationBuilder.add(ModItems.EXAMPLE_ITEM, "Example Item");
        translationBuilder.add(ModBlocks.EXAMPLE_BLOCK, "Example Block");
    }
}
