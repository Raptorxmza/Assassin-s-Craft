
package net.mcreator.assassins_creed.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.assassins_creed.creativetab.TabAssassinsCreedProps;
import net.mcreator.assassins_creed.ElementsAssassinsCraftMod;

@ElementsAssassinsCraftMod.ModElement.Tag
public class ItemRifleBullet extends ElementsAssassinsCraftMod.ModElement {
	@GameRegistry.ObjectHolder("assassins_craft:riflebullet")
	public static final Item block = null;
	public ItemRifleBullet(ElementsAssassinsCraftMod instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("assassins_craft:riflebullet", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("riflebullet");
			setRegistryName("riflebullet");
			setCreativeTab(TabAssassinsCreedProps.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}