package kiwifails;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MiniCoal implements ModInitializer {
	public static final Item MINI_COAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item MINI_CHARCOAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	// TODO: Assets Change

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("minicoal", "mini_coal"), MINI_COAL);
		Registry.register(Registry.ITEM, new Identifier("minicoal", "mini_charcoal"), MINI_CHARCOAL);
		
		// Fuel Registry
		FuelRegistry.INSTANCE.add(MINI_COAL, 200);
		FuelRegistry.INSTANCE.add(MINI_CHARCOAL, 200);
	}
}
