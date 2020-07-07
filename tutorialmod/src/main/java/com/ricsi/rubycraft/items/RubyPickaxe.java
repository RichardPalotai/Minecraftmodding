package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.items.RicskoModItemTier;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;


public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe() {
        super(
                RicskoModItemTier.RubyTier(),
                2,
                -2.8f,
                new Properties()
                        .group(rubycraft.TAB)
        );
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
