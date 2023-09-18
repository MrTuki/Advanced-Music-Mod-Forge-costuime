package net.moritz_htk.advancedmusicmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.item.AMMItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class AMMItemTagsProvider extends TagsProvider<Item> {
    public AMMItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.ITEM, registries, AdvancedMusicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.MUSIC_DISCS).replace(false)
                .add(AMMItems.MUSIC_DISC_AUGUST.getKey())
                .add(AMMItems.MUSIC_DISC_CATTAILS.getKey())
                .add(AMMItems.MUSIC_DISC_CHERRY_BLOSSOM.getKey())
                .add(AMMItems.MUSIC_DISC_DEATH_OF_KINGS.getKey())
                .add(AMMItems.MUSIC_DISC_HEDWIG.getKey())
                .add(AMMItems.MUSIC_DISC_JUST_IN_TIME.getKey())
                .add(AMMItems.MUSIC_DISC_LAPSE.getKey())
                .add(AMMItems.MUSIC_DISC_MIDNIGHT_TALE.getKey())
                .add(AMMItems.MUSIC_DISC_PAIN.getKey())
                .add(AMMItems.MUSIC_DISC_QUIET.getKey())
                .add(AMMItems.MUSIC_DISC_SCREEN_SAVER.getKey())
                .add(AMMItems.MUSIC_DISC_SLEEP.getKey())
                .add(AMMItems.MUSIC_DISC_TABUK.getKey())
                .add(AMMItems.MUSIC_DISC_WITH_REGARDS.getKey());
    }
}