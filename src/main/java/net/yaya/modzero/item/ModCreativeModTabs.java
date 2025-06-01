package net.yaya.modzero.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yaya.modzero.ModZero;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModZero.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("modzero_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VIBRANIUM.get()))
                    .title(Component.translatable("creativetab.modzero_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VIBRANIUM.get());
                        pOutput.accept(ModItems.RAW_VIBRANIUM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
