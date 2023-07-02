package net.moritz_htk.advancedmusicmod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.moritz_htk.advancedmusicmod.item.ModCreativeModeTabs;
import net.moritz_htk.advancedmusicmod.item.ModItems;
import net.moritz_htk.advancedmusicmod.sounds.ModSounds;
import org.slf4j.Logger;

@Mod(net.moritz_htk.advancedmusicmod.AdvancedMusicMod.MOD_ID)
public class AdvancedMusicMod {

    public static final String MOD_ID = "advancedmusicmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedMusicMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTabs.ADVANCED_MUSIC_MOD_TAB) {
            event.accept(ModItems.MUSIC_DISC_ALICE);
            event.accept(ModItems.MUSIC_DISC_AUGUST);
            event.accept(ModItems.MUSIC_DISC_AWAKE);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
