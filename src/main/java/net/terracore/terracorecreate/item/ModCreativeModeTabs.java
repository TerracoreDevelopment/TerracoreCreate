package net.terracore.terracorecreate.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.terracore.terracorecreate.TCoreCreateMod;
import net.terracore.terracorecreate.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TCoreCreateMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TERRACORE_CREATE = CREATIVE_MODE_TABS.register("terracore_create",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LSDPAD.get()))
                    .title(Component.translatable("creativetab.terracore_create"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LSDPAD.get());
                        output.accept(ModItems.MUTTERKORN.get());
                        output.accept(ModBlocks.COCAINE_BLOCK.get());
                    })
                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
