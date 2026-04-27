package com.example.example_mod;

import com.example.example_mod.init.ModBlocks;
import com.example.example_mod.init.ModItems;
import net.fabricmc.api.ModInitializer;

import com.example.example_mod.init.ModCreativeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "example_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.init();
        ModBlocks.init();
        ModCreativeTabs.init();

	}
}