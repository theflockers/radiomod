package info.lmendes.beermod;


import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

public class BeerModOreFeatures {
	
 /* public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RADIO_ORES = List.of(
    		OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BeerModBlocks.RADIO_ORE.get().defaultBlockState()),
    		OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BeerModBlocks.DEEPSLATE_RADIO_ORE.get().defaultBlockState()));*/
    
	public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_RADIO = 
			FeatureUtils.register("radio_ore", Feature.ORE, new OreConfiguration(List.of(
					OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BeerModBlocks.RADIO_ORE.get().defaultBlockState()),
        			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BeerModBlocks.DEEPSLATE_RADIO_ORE.get().defaultBlockState())), 10));
	
} 
