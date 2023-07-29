package net.moritz_htk.advancedmusicmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.moritz_htk.advancedmusicmod.item.AMMCreativeModeTabs;
import net.moritz_htk.advancedmusicmod.item.AMMItems;
import net.moritz_htk.advancedmusicmod.sounds.AMMSoundEvents;

@Mod(net.moritz_htk.advancedmusicmod.AdvancedMusicMod.MOD_ID)
public class AdvancedMusicMod {

    public static final String MOD_ID = "advancedmusicmod";

    public AdvancedMusicMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AMMItems.register(modEventBus);
        AMMSoundEvents.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == AMMCreativeModeTabs.ADVANCED_MUSIC_MOD_TAB) {
            event.accept(AMMItems.MUSIC_DISC_AUGUST);
            event.accept(AMMItems.MUSIC_DISC_CATTAILS);
            event.accept(AMMItems.MUSIC_DISC_CHERRY_BLOSSOM);
            event.accept(AMMItems.MUSIC_DISC_DEATH_OF_KINGS);
            event.accept(AMMItems.MUSIC_DISC_HEDWIG);
            event.accept(AMMItems.MUSIC_DISC_JUST_IN_TIME);
            event.accept(AMMItems.MUSIC_DISC_LAPSE);
            event.accept(AMMItems.MUSIC_DISC_MIDNIGHT_TALE);
            event.accept(AMMItems.MUSIC_DISC_PAIN);
            event.accept(AMMItems.MUSIC_DISC_QUIET);
            event.accept(AMMItems.MUSIC_DISC_SCREEN_SAVER);
            event.accept(AMMItems.MUSIC_DISC_SLEEP);
            event.accept(AMMItems.MUSIC_DISC_TABUK);
            event.accept(AMMItems.MUSIC_DISC_WITH_REGARDS);
        }
    }
}
