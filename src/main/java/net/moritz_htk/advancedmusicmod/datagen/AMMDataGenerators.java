package net.moritz_htk.advancedmusicmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AdvancedMusicMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AMMDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new AMMGlobalLootModifierProvider(packOutput));
        generator.addProvider(true, new AMMItemModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new AMMItemTagsProvider(packOutput, lookupProvider, fileHelper));
        generator.addProvider(true, new AMMSoundProvider(packOutput, fileHelper));
    }
}