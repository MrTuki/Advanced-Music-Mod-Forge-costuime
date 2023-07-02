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
    public static final RegistryObject<Item> MUSIC_DISC_AWAKE = ITEMS.register("music_disc_awake", () -> new RecordItem(8, AMMSoundEvents.MUSIC_DISC_AWAKE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3280));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
