package info.lmendes.beermod;

import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class BeerModOrePlacement {
	
	 public static final Holder<PlacedFeature> ORE_RADIO = PlacementUtils.register("ore_radio", BeerModOreFeatures.ORE_RADIO, commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(15))));
	 public static final Holder<PlacedFeature> ORE_RADIO_LOWER = PlacementUtils.register("ore_radio_lower", BeerModOreFeatures.ORE_RADIO, commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));

	// these are copied functions from Vanilla Minecraft
	private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {                                                                                                                       
		return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());                                                                                                                                             
	} 
	
	private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {                                                                                                                               
		return orePlacement(CountPlacement.of(p_195344_), p_195345_);                                                                                                                                                                      
	} 
}