package com.weaird.item;

import com.weaird.WeirdMods;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SYnNTHETIC_JADE = registerItems("synthetic_jade",new Item(new Item.Settings()));

    private static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM,Identifier.of(WeirdMods.MOD_ID,id),item);
    }
    public static void registerModItems(){
        WeirdMods.LOGGER.info("1");
    }
}
