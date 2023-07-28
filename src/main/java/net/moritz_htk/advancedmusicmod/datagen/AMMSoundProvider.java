package net.moritz_htk.advancedmusicmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.sounds.AMMSoundEvents;

public class AMMSoundProvider extends SoundDefinitionsProvider {
    protected AMMSoundProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, AdvancedMusicMod.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        add(AMMSoundEvents.MUSIC_DISC_AUGUST, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/august")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_AWAKE, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/awake")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_CATTAILS, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/cattails")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/cherry_blossom")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_CRUSH, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/crush")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/death_of_kings")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_HEDWIG, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/hedwig")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_HUMAN, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/human")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/just_in_time")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_LAPSE, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/lapse")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/midnight_tale")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_NOT_FAR_NOW, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/not_far_now")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_PAIN, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/pain")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_QUIET, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/quiet")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/screen_saver")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_SLEEP, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/sleep")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_TABUK, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/tabuk")).stream(true)));
        add(AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, "records/with_regards")).stream(true)));
    }
}