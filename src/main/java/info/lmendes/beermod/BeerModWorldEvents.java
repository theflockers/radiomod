package info.lmendes.beermod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "beermod", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BeerModWorldEvents {
	
    private static final Logger LOGGER = LogUtils.getLogger();

	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
		LOGGER.info("****  GENERATING RADIO ORES ****");
		BeerModOreGeneration.generateOres(event);
	}
};