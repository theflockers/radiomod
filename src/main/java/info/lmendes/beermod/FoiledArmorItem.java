package info.lmendes.beermod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ElytraItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class FoiledArmorItem extends ArmorItem {

   public FoiledArmorItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Item.Properties p_40388_) {   
	   super(p_40386_, p_40387_, p_40388_);   
   }

   public boolean isFoil(ItemStack p_43138_) {
      return true;
   }
}