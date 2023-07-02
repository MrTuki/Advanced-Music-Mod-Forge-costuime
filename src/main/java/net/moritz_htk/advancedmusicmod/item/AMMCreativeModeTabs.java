package net.moritz_htk.advancedmusicmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;


@Mod.EventBusSubscriber(modid = AdvancedMusicMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AMMCreativeModeTabs {
    public static CreativeModeTab ADVANCED_MUSIC_MOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ADVANCED_MUSIC_MOD_TAB = event.registerCreativeModeTab(new ResourceLocation(AdvancedMusicMod.MOD_ID, "advanced_music_mod_tab"),
                builder -> builder.icon(() -> new ItemStack(AMMItems.MUSIC_DISC_AUGUST.get()))
                        .title(Component.literal("Advanced Music Mod")));
    }
}
