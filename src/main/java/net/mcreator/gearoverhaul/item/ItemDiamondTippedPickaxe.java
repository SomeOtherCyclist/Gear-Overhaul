
package net.mcreator.gearoverhaul.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.gearoverhaul.ElementsGearOverhaul;

import java.util.Set;
import java.util.HashMap;

@ElementsGearOverhaul.ModElement.Tag
public class ItemDiamondTippedPickaxe extends ElementsGearOverhaul.ModElement {
	@GameRegistry.ObjectHolder("gearoverhaul:diamondtippedpickaxe")
	public static final Item block = null;
	public ItemDiamondTippedPickaxe(ElementsGearOverhaul instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("DIAMONDTIPPEDPICKAXE", 4, 954, 13.5f, 3f, 22)) {
			{
				this.attackSpeed = -2.8f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("diamondtippedpickaxe").setRegistryName("diamondtippedpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("gearoverhaul:diamondtippedpickaxe", "inventory"));
	}
}
