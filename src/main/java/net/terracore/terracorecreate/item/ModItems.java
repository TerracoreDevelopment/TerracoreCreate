package net.terracore.terracorecreate.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.terracore.terracorecreate.TCoreCreateMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TCoreCreateMod.MOD_ID);

    public static final RegistryObject<Item> MUTTERKORN = ITEMS.register("mutterkorn",
            () -> new Item(new Item.Properties()));
            //Mutterkorn, auch Wolfsklaue genannt, ist ein Pilz, der Roggen befällt und zur Herstellung von LSD benutzt wird
    public static final RegistryObject<Item> LSDPAD = ITEMS.register("lsdpad",
                    () -> new Item(new Item.Properties()))


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
