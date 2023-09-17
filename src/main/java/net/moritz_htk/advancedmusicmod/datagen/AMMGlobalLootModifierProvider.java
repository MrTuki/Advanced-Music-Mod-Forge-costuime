package net.moritz_htk.advancedmusicmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraftforge.registries.RegistryObject;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.item.AMMItems;
import net.moritz_htk.advancedmusicmod.loot.AddItemModifier;

public class AMMGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public AMMGlobalLootModifierProvider(PackOutput output) {
        super(output, AdvancedMusicMod.MOD_ID);
    }

    @Override
    protected void start() {
        addMusicDiscModifier(AMMItems.MUSIC_DISC_AUGUST, "chests/igloo_chest");
        addMusicDiscVillageModifier(AMMItems.MUSIC_DISC_CATTAILS, "plains");
        addMusicDiscVillageModifier(AMMItems.MUSIC_DISC_CATTAILS, "taiga");
        addMusicDiscVillageModifier(AMMItems.MUSIC_DISC_CATTAILS, "snowy");
        addMusicDiscVillageModifier(AMMItems.MUSIC_DISC_CATTAILS, "savanna");
        addMusicDiscVillageModifier(AMMItems.MUSIC_DISC_CATTAILS, "desert");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_CHERRY_BLOSSOM, "chests/woodland_mansion");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_DEATH_OF_KINGS, "chests/stronghold_corridor");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_HEDWIG, "chests/underwater_ruin_big");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_JUST_IN_TIME, "chests/shipwreck_treasure");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_LAPSE, "chests/ruined_portal");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_MIDNIGHT_TALE, "chests/pillager_outpost");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_PAIN, "chests/ancient_city");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_QUIET, "chests/buried_treasure");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_SCREEN_SAVER, "chests/jungle_temple");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_SLEEP, "chests/abandoned_mineshaft");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_TABUK, "chests/desert_pyramid");
        addMusicDiscModifier(AMMItems.MUSIC_DISC_WITH_REGARDS, "chests/simple_dungeon");
    }

    private void addMusicDiscModifier(RegistryObject<Item> musicDisc, String lootTable) {
        addMusicDiscModifier(musicDisc, "", lootTable);
    }

    private void addMusicDiscVillageModifier(RegistryObject<Item> musicDisc, String villageType) {
        String lootTable = "chests/village/village_" + villageType + "_house";
        addMusicDiscModifier(musicDisc, villageType, lootTable);
    }

    private void addMusicDiscModifier(RegistryObject<Item> musicDisc, String villageType, String lootTable) {
        LootItemCondition[] conditions = {
                new LootTableIdCondition.Builder(new ResourceLocation(lootTable)).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build()
        };
        String modifierName = musicDisc.get().toString();
        if (!villageType.isEmpty()) {
            modifierName += "_" + villageType;
        }
        add(modifierName + "_modifier", new AddItemModifier(conditions, musicDisc.get()));
    }
}