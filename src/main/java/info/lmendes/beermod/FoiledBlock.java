package info.lmendes.beermod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class FoiledBlock extends Block {

	public FoiledBlock(BlockBehaviour.Properties p_49795) {
		super(p_49795);
   }

   public boolean isFoil(ItemStack p_43138_) {
      return true;
   }
}
