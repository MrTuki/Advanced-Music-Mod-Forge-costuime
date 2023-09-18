package net.moritz_htk.advancedmusicmod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.sounds.AMMSoundEvents;

public class AMMItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedMusicMod.MOD_ID);

    public static final RegistryObject<Item> MUSIC_DISC_AUGUST = registerRecordItem("music_disc_august", AMMSoundEvents.MUSIC_DISC_AUGUST, 191);
    public static final RegistryObject<Item> MUSIC_DISC_CATTAILS = registerRecordItem("music_disc_cattails", AMMSoundEvents.MUSIC_DISC_CATTAILS, 156);
    public static final RegistryObject<Item> MUSIC_DISC_CHERRY_BLOSSOM = registerRecordItem("music_disc_cherry_blossom", AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, 127);
    public static final RegistryObject<Item> MUSIC_DISC_DEATH_OF_KINGS = registerRecordItem("music_disc_death_of_kings", AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, 143);
    public static final RegistryObject<Item> MUSIC_DISC_HEDWIG = registerRecordItem("music_disc_hedwig", AMMSoundEvents.MUSIC_DISC_HEDWIG, 175);
    public static final RegistryObject<Item> MUSIC_DISC_JUST_IN_TIME = registerRecordItem("music_disc_just_in_time", AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, 202);
    public static final RegistryObject<Item> MUSIC_DISC_LAPSE = registerRecordItem("music_disc_lapse", AMMSoundEvents.MUSIC_DISC_LAPSE, 117);
    public static final RegistryObject<Item> MUSIC_DISC_MIDNIGHT_TALE = registerRecordItem("music_disc_midnight_tale", AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, 153);
    public static final RegistryObject<Item> MUSIC_DISC_PAIN = registerRecordItem("music_disc_pain", AMMSoundEvents.MUSIC_DISC_PAIN, 174);
    public static final RegistryObject<Item> MUSIC_DISC_QUIET = registerRecordItem("music_disc_quiet", AMMSoundEvents.MUSIC_DISC_QUIET, 148);
    public static final RegistryObject<Item> MUSIC_DISC_SCREEN_SAVER = registerRecordItem("music_disc_screen_saver", AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, 176);
    public static final RegistryObject<Item> MUSIC_DISC_SLEEP = registerRecordItem("music_disc_sleep", AMMSoundEvents.MUSIC_DISC_SLEEP, 203);
    public static final RegistryObject<Item> MUSIC_DISC_TABUK = registerRecordItem("music_disc_tabuk", AMMSoundEvents.MUSIC_DISC_TABUK, 156);
    public static final RegistryObject<Item> MUSIC_DISC_WITH_REGARDS = registerRecordItem("music_disc_with_regards", AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, 175);

    private static RegistryObject<Item> registerRecordItem(String name, RegistryObject<SoundEvent> event, int lengthInSeconds) {
        int lengthInTicks = (int) (lengthInSeconds / 0.05);
        return ITEMS.register(name, () -> new RecordItem(9, event, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), lengthInTicks));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}