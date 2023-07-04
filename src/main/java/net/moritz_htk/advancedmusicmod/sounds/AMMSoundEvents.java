package net.moritz_htk.advancedmusicmod.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;

public class AMMSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AdvancedMusicMod.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_AUGUST = registerSoundEvent("music_disc.august");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_AWAKE = registerSoundEvent("music_disc.awake");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CRUSH = registerSoundEvent("music_disc.crush");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HEDWIG = registerSoundEvent("music_disc.hedwig");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HUMAN = registerSoundEvent("music_disc.human");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_JUST_IN_TIME = registerSoundEvent("music_disc.just_in_time");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_LAPSE = registerSoundEvent("music_disc.lapse");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_QUIET = registerSoundEvent("music_disc.quiet");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(AdvancedMusicMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
