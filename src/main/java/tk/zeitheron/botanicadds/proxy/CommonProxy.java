package tk.zeitheron.botanicadds.proxy;

import net.minecraft.item.Item;
import tk.zeitheron.botanicadds.init.BlocksBA;

public class CommonProxy
{
	public void preInit()
	{
	}

	public void init()
	{
		Item tesseractItem = Item.getItemFromBlock(BlocksBA.MANA_TESSERACT);
		if (tesseractItem != null && tesseractItem != net.minecraft.init.Items.AIR) {
			tesseractItem.setMaxStackSize(1);
		}
	}
}