package net.moritz_htk.advancedmusicmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.item.AMMItems;

public class AMMItemModelProvider extends ItemModelProvider {
    public AMMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdvancedMusicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(AMMItems.MUSIC_DISC_AUGUST.get());
        basicItem(AMMItems.MUSIC_DISC_AWAKE.get());
        basicItem(AMMItems.MUSIC_DISC_CRUSH.get());
        basicItem(AMMItems.MUSIC_DISC_HEDWIG.get());
        basicItem(AMMItems.MUSIC_DISC_HUMAN.get());
        basicItem(AMMItems.MUSIC_DISC_JUST_IN_TIME.get());
        basicItem(AMMItems.MUSIC_DISC_LAPSE.get());
        basicItem(AMMItems.MUSIC_DISC_NOT_FAR_NOW.get());
        basicItem(AMMItems.MUSIC_DISC_PAIN.get());
        basicItem(AMMItems.MUSIC_DISC_QUIET.get());
        basicItem(AMMItems.MUSIC_DISC_SLEEP.get());
    }
}
