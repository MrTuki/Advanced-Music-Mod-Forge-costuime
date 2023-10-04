package net.moritz_htk.advancedmusicmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;

public class AMMCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedMusicMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ADVANCED_MUSIC_MOD_TAB = CREATIVE_MODE_TABS.register("advanced_music_mod_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(AMMItems.MUSIC_DISC_AUGUST.get())).title(Component.literal("Advanced Music Mod")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}