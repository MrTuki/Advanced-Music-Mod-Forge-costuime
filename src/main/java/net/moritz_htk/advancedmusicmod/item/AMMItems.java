package net.moritz_htk.advancedmusicmod.item;

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
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedMusicMod.MOD_ID);

    public static final RegistryObject<Item> MUSIC_DISC_AUGUST = ITEMS.register("music_disc_august", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_AUGUST, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3820));
    public static final RegistryObject<Item> MUSIC_DISC_CATTAILS = ITEMS.register("music_disc_cattails", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_CATTAILS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3120));
    public static final RegistryObject<Item> MUSIC_DISC_CHERRY_BLOSSOM = ITEMS.register("music_disc_cherry_blossom", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2540));
    public static final RegistryObject<Item> MUSIC_DISC_DEATH_OF_KINGS = ITEMS.register("music_disc_death_of_kings", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2860));
    public static final RegistryObject<Item> MUSIC_DISC_HEDWIG = ITEMS.register("music_disc_hedwig", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_HEDWIG, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3500));
    public static final RegistryObject<Item> MUSIC_DISC_JUST_IN_TIME = ITEMS.register("music_disc_just_in_time", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4040));
    public static final RegistryObject<Item> MUSIC_DISC_LAPSE = ITEMS.register("music_disc_lapse", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_LAPSE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2340));
    public static final RegistryObject<Item> MUSIC_DISC_MIDNIGHT_TALE = ITEMS.register("music_disc_midnight_tale", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3060));
    public static final RegistryObject<Item> MUSIC_DISC_PAIN = ITEMS.register("music_disc_pain", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_PAIN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3480));
    public static final RegistryObject<Item> MUSIC_DISC_QUIET = ITEMS.register("music_disc_quiet", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_QUIET, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2960));
    public static final RegistryObject<Item> MUSIC_DISC_SCREEN_SAVER = ITEMS.register("music_disc_screen_saver", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3520));
    public static final RegistryObject<Item> MUSIC_DISC_SLEEP = ITEMS.register("music_disc_sleep", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_SLEEP, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4060));
    public static final RegistryObject<Item> MUSIC_DISC_TABUK = ITEMS.register("music_disc_tabuk", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_TABUK, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3120));
    public static final RegistryObject<Item> MUSIC_DISC_WITH_REGARDS = ITEMS.register("music_disc_with_regards", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3500));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
