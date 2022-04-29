package info.lmendes.beermod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class FoiledBlockItem extends BlockItem {

	
   public FoiledBlockItem(Block p_40565_, Item.Properties p_40566_) { 
	   super(p_40565_, p_40566_);
   }

   public boolean isFoil(ItemStack p_43138_) {
      return true;
   }
}