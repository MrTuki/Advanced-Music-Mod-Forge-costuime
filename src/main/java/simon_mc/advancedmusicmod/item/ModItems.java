package simon_mc.advancedmusicmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import simon_mc.advancedmusicmod.AdvancedMusicMod;
import simon_mc.advancedmusicmod.sounds.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedMusicMod.MOD_ID);

    public static final RegistryObject<Item> MUSIC_DISC_ALICE = ITEMS.register("music_disc_alice",
            () -> new RecordItem(8, ModSounds.MUSIC_DISC_ALICE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4940));

    public static final RegistryObject<Item> MUSIC_DISC_AUGUST = ITEMS.register("music_disc_august",
            () -> new RecordItem(8, ModSounds.MUSIC_DISC_AUGUST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3820));

    public static final RegistryObject<Item> MUSIC_DISC_AWAKE = ITEMS.register("music_disc_awake",
            () -> new RecordItem(8, ModSounds.MUSIC_DISC_AWAKE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3280));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
