package info.lmendes.beermod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ElytraItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class BeerModItems {
    public static final DeferredRegister<Item> ITEMS
        = DeferredRegister.create(ForgeRegistries.ITEMS, "beermod");
            
    public static final RegistryObject<Item> BEER_CAN = ITEMS.register("beer_can",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    // RADIO ITEMS
    public static final RegistryObject<Item> RADIO_SHARD = ITEMS.register("radio_shard",
        () -> new SimpleFoiledItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RADIO_INGOT = ITEMS.register("radio_ingot",
        () -> new SimpleFoiledItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    // RADIO TOOLS/WEAPONS
    public static final RegistryObject<Item> RADIO_PICKAXE = ITEMS.register("radio_pickaxe",
        () -> new PickaxeItem(BeerModItemTier.RADIO, 1, -1.0F, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_AXE = ITEMS.register("radio_axe",
        () -> new AxeItem(BeerModItemTier.RADIO, 6, -3.4F, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_SHOVEL = ITEMS.register("radio_shovel",
        () -> new ShovelItem(BeerModItemTier.RADIO, 1, -1.0F, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_SWORD = ITEMS.register("radio_sword",
        () -> new SwordItem(BeerModItemTier.RADIO, 3, -2.4F, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    // RADIO ARMOR
    public static final RegistryObject<Item> RADIO_HELMET =
    		ITEMS.register("radio_helmet",
        () -> new FoiledArmorItem(BeerModArmorMaterial.RADIO, EquipmentSlot.HEAD, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_CHESTPLATE = 
    		ITEMS.register("radio_chestplate",
        () -> new FoiledArmorItem(BeerModArmorMaterial.RADIO, EquipmentSlot.CHEST, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_LEGGINGS = 
    		ITEMS.register("radio_leggings",
        () -> new FoiledArmorItem(BeerModArmorMaterial.RADIO, EquipmentSlot.LEGS, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_BOOTS = 
    		ITEMS.register("radio_boots",
        () -> new FoiledArmorItem(BeerModArmorMaterial.RADIO, EquipmentSlot.FEET, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RADIO_ELYTRA = 
    		ITEMS.register("radio_elytra",
        () -> new FoiledArmorItem(BeerModArmorMaterial.RADIO, EquipmentSlot.CHEST, 
        		new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

}
