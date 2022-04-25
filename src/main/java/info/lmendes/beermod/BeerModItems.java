package info.lmendes.beermod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class BeerModItems {
    public static final DeferredRegister<Item> ITEMS
        = DeferredRegister.create(ForgeRegistries.ITEMS, "beermod");
            
    public static final RegistryObject<Item> BEER_CAN = ITEMS.register("beer_can",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RADIO_SHARD = ITEMS.register("radio_shard",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RADIO_INGOT = ITEMS.register("radio_ingot",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
