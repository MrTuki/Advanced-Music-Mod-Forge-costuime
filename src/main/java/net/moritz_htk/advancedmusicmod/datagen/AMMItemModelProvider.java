package net.moritz_htk.advancedmusicmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.item.AMMItems;

public class AMMItemModelProvider extends ItemModelProvider {
    public AMMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdvancedMusicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(AMMItems.MUSIC_DISC_ALICE);
        simpleItem(AMMItems.MUSIC_DISC_AUGUST);
        simpleItem(AMMItems.MUSIC_DISC_AWAKE);
    }

    private void simpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AdvancedMusicMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
