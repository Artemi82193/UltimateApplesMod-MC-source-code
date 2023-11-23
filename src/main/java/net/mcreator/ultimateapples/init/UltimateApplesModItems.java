
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateapples.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.ultimateapples.item.RubyappleItem;
import net.mcreator.ultimateapples.item.RubyItem;
import net.mcreator.ultimateapples.item.EmeraldappleItem;
import net.mcreator.ultimateapples.item.DiamondappleItem;
import net.mcreator.ultimateapples.item.AmethystappleItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UltimateApplesModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item DIAMONDAPPLE = register(new DiamondappleItem());
	public static final Item EMERALDAPPLE = register(new EmeraldappleItem());
	public static final Item AMETHYST_APPLE = register(new AmethystappleItem());
	public static final Item RUBYAPPLE = register(new RubyappleItem());
	public static final Item RUBY = register(new RubyItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
