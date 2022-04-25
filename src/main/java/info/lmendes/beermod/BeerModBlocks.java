package info.lmendes.beermod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Item; 
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class BeerModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, "beermod");

    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, "beermod");

    /// register 
            
    public static final RegistryObject<Block> MARS_BLOCK =
        BLOCKS.register("mars_block", () -> 
                new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2, 6).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RADIO_ORE =
        BLOCKS.register("radio_ore", () -> 
                new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2, 6)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 9 )));

    public static final RegistryObject<Block> RADIO_BLOCK =
        BLOCKS.register("radio_block", () -> 
                new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2, 6)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 16)));

    /// Itemize Blocks
    public static final RegistryObject<BlockItem> MARS_BLOCK_ITEM =
        ITEMS.register("mars_block", () ->
                new BlockItem(MARS_BLOCK.get(), 
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));

    public static final RegistryObject<BlockItem> RADIO_ORE_ITEM =
        ITEMS.register("radio_ore", () ->
                new BlockItem(RADIO_ORE.get(), 
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));

    public static final RegistryObject<BlockItem> RADIO_BLOCK_ITEM =
        ITEMS.register("radio_block", () ->
                new BlockItem(RADIO_BLOCK.get(), 
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));

}
