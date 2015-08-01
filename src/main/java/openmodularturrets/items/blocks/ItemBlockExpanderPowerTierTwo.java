package openmodularturrets.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import openmodularturrets.handler.ConfigHandler;

import java.util.List;

public class ItemBlockExpanderPowerTierTwo extends ItemBlock {
    public ItemBlockExpanderPowerTierTwo(Block p_i45328_1_) {
        super(p_i45328_1_);
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.GOLD + StatCollector.translateToLocal("tooltip.expander.power1"));
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(
                "tooltip.expander.power2") + " " + ConfigHandler.getExpanderPowerTierTwoCapacity() + " " + StatCollector.translateToLocal(
                "tooltip.expander.power3"));
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal("flavour.expander.power.2"));
    }
}
