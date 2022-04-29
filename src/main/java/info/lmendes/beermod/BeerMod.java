package info.lmendes.beermod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;


@Mod("beermod")
public class BeerMod {
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BeerMod()
    {
    	IEventBus eb = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.info("*** Registering ITEMS ***");
        BeerModItems.ITEMS.register(eb);
        LOGGER.info("*** Registering BLOCKS ***");
        BeerModBlocks.register(eb);
        BeerModBlocks.ITEMS.register(eb);
        
        MinecraftForge.EVENT_BUS.register(this);

        
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Item> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from Register Item");
        }
    }
}
