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
            event.accept(AMMItems.MUSIC_DISC_AWAKE);
            event.accept(AMMItems.MUSIC_DISC_CRUSH);
            event.accept(AMMItems.MUSIC_DISC_HEDWIG);
            event.accept(AMMItems.MUSIC_DISC_HUMAN);
            event.accept(AMMItems.MUSIC_DISC_JUST_IN_TIME);
            event.accept(AMMItems.MUSIC_DISC_LAPSE);
            event.accept(AMMItems.MUSIC_DISC_QUIET);
        }
    }
}
