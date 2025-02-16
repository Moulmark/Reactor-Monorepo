/*
* Autogenerated file. Please don't touch :)
* Class generator: ink.reactor.dataparser.registry.biome.BiomeParser (module data-parser)
* Date: Year: 2025. Month: 01. Day: 14. Time: 23:36:31
*/
package ink.reactor.api.world.data;
import java.util.Collection;

import ink.reactor.util.collection.CopyOnWriteCollection;

public record Biome(
    String name,
    boolean hasPrecipitation,
    double temperature,
    String temperatureModifier,
    double downFall,
    Effects effects
) {
    public static final Collection<Biome> ALL = new CopyOnWriteCollection<>(65);

    public static Biome add(final Biome biome) {
        ALL.add(biome);
        return biome;
    } 

    public static record Effects(
        int fogColor,
        Integer foliageColor,
        Integer grassColor,
        String grassColorModifier,
        String ambientSound,
        int skyColor,
        int waterColor,
        int waterFogColor,
        MoodSound moodSound,
        Music music,
        AdditionSound additionSound,
        Particle particle
    ){

        public static record MoodSound(
            String sound,
            int tickDelay,
            int blockSearchExtent,
            double offSet
        ){}

        public static record Music(
            int maxDelay,
            int minDelay,
            boolean replaceCurrentMusic,
            String sound
        ){}

        public static record AdditionSound(
            String sound,
            double tickChance
        ){}

        public static record Particle(
            String type,
            double probability
        ){}
    }

    public static final Biome 
        BADLANDS = add(new Biome("badlands",false,2.0,"none",0.0,new Effects(12638463,10387789,9470285,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        BAMBOO_JUNGLE = add(new Biome("bamboo_jungle",true,0.95,"none",0.9,new Effects(12638463,null,null,null,null,7842047,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        BASALT_DELTAS = add(new Biome("basalt_deltas",false,2.0,"none",0.0,new Effects(6840176,null,null,null,"minecraft:ambient.basalt_deltas.loop",7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.basalt_deltas.mood",6000,2,8),null,new Effects.AdditionSound("minecraft:ambient.basalt_deltas.additions",0.0111),new Effects.Particle("minecraft:white_ash",0.118093334)))),
        BEACH = add(new Biome("beach",true,0.8,"none",0.4,new Effects(12638463,null,null,null,null,7907327,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        BIRCH_FOREST = add(new Biome("birch_forest",true,0.6,"none",0.6,new Effects(12638463,null,null,null,null,8037887,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        CHERRY_GROVE = add(new Biome("cherry_grove",true,0.5,"none",0.8,new Effects(12638463,11983713,11983713,null,null,8103167,6141935,6141935,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        COLD_OCEAN = add(new Biome("cold_ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4020182,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        CRIMSON_FOREST = add(new Biome("crimson_forest",false,2.0,"none",0.0,new Effects(3343107,null,null,null,"minecraft:ambient.crimson_forest.loop",7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.crimson_forest.mood",6000,2,8),null,new Effects.AdditionSound("minecraft:ambient.crimson_forest.additions",0.0111),new Effects.Particle("minecraft:crimson_spore",0.025)))),
        DARK_FOREST = add(new Biome("dark_forest",true,0.7,"none",0.8,new Effects(12638463,null,null,"dark_forest",null,7972607,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DEEP_COLD_OCEAN = add(new Biome("deep_cold_ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4020182,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DEEP_DARK = add(new Biome("deep_dark",true,0.8,"none",0.4,new Effects(12638463,null,null,null,null,7907327,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DEEP_FROZEN_OCEAN = add(new Biome("deep_frozen_ocean",true,0.5,"frozen",0.5,new Effects(12638463,null,null,null,null,8103167,3750089,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DEEP_LUKEWARM_OCEAN = add(new Biome("deep_lukewarm_ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4566514,267827,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DEEP_OCEAN = add(new Biome("deep_ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DESERT = add(new Biome("desert",false,2.0,"none",0.0,new Effects(12638463,null,null,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        DRIPSTONE_CAVES = add(new Biome("dripstone_caves",true,0.8,"none",0.4,new Effects(12638463,null,null,null,null,7907327,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        END_BARRENS = add(new Biome("end_barrens",false,0.5,"none",0.5,new Effects(10518688,null,null,null,null,0,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        END_HIGHLANDS = add(new Biome("end_highlands",false,0.5,"none",0.5,new Effects(10518688,null,null,null,null,0,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        END_MIDLANDS = add(new Biome("end_midlands",false,0.5,"none",0.5,new Effects(10518688,null,null,null,null,0,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        ERODED_BADLANDS = add(new Biome("eroded_badlands",false,2.0,"none",0.0,new Effects(12638463,10387789,9470285,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        FLOWER_FOREST = add(new Biome("flower_forest",true,0.7,"none",0.8,new Effects(12638463,null,null,null,null,7972607,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        FOREST = add(new Biome("forest",true,0.7,"none",0.8,new Effects(12638463,null,null,null,null,7972607,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        FROZEN_OCEAN = add(new Biome("frozen_ocean",true,0.0,"frozen",0.5,new Effects(12638463,null,null,null,null,8364543,3750089,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        FROZEN_PEAKS = add(new Biome("frozen_peaks",true,-0.7,"none",0.9,new Effects(12638463,null,null,null,null,8756735,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        FROZEN_RIVER = add(new Biome("frozen_river",true,0.0,"none",0.5,new Effects(12638463,null,null,null,null,8364543,3750089,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        GROVE = add(new Biome("grove",true,-0.2,"none",0.8,new Effects(12638463,null,null,null,null,8495359,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        ICE_SPIKES = add(new Biome("ice_spikes",true,0.0,"none",0.5,new Effects(12638463,null,null,null,null,8364543,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        JAGGED_PEAKS = add(new Biome("jagged_peaks",true,-0.7,"none",0.9,new Effects(12638463,null,null,null,null,8756735,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        JUNGLE = add(new Biome("jungle",true,0.95,"none",0.9,new Effects(12638463,null,null,null,null,7842047,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        LUKEWARM_OCEAN = add(new Biome("lukewarm_ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4566514,267827,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        LUSH_CAVES = add(new Biome("lush_caves",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        MANGROVE_SWAMP = add(new Biome("mangrove_swamp",true,0.8,"none",0.9,new Effects(12638463,9285927,null,"swamp",null,7907327,3832426,5077600,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        MEADOW = add(new Biome("meadow",true,0.5,"none",0.8,new Effects(12638463,null,null,null,null,8103167,937679,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        MUSHROOM_FIELDS = add(new Biome("mushroom_fields",true,0.9,"none",1.0,new Effects(12638463,null,null,null,null,7842047,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        NETHER_WASTES = add(new Biome("nether_wastes",false,2.0,"none",0.0,new Effects(3344392,null,null,null,"minecraft:ambient.nether_wastes.loop",7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.nether_wastes.mood",6000,2,8),null,new Effects.AdditionSound("minecraft:ambient.nether_wastes.additions",0.0111),null))),
        OCEAN = add(new Biome("ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        OLD_GROWTH_BIRCH_FOREST = add(new Biome("old_growth_birch_forest",true,0.6,"none",0.6,new Effects(12638463,null,null,null,null,8037887,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        OLD_GROWTH_PINE_TAIGA = add(new Biome("old_growth_pine_taiga",true,0.3,"none",0.8,new Effects(12638463,null,null,null,null,8168447,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        OLD_GROWTH_SPRUCE_TAIGA = add(new Biome("old_growth_spruce_taiga",true,0.25,"none",0.8,new Effects(12638463,null,null,null,null,8233983,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        PALE_GARDEN = add(new Biome("pale_garden",true,0.7,"none",0.8,new Effects(8484720,8883574,7832178,null,null,12171705,7768221,5597568,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        PLAINS = add(new Biome("plains",true,0.8,"none",0.4,new Effects(12638463,null,null,null,null,7907327,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        RIVER = add(new Biome("river",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SAVANNA = add(new Biome("savanna",false,2.0,"none",0.0,new Effects(12638463,null,null,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SAVANNA_PLATEAU = add(new Biome("savanna_plateau",false,2.0,"none",0.0,new Effects(12638463,null,null,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SMALL_END_ISLANDS = add(new Biome("small_end_islands",false,0.5,"none",0.5,new Effects(10518688,null,null,null,null,0,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SNOWY_BEACH = add(new Biome("snowy_beach",true,0.05,"none",0.3,new Effects(12638463,null,null,null,null,8364543,4020182,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SNOWY_PLAINS = add(new Biome("snowy_plains",true,0.0,"none",0.5,new Effects(12638463,null,null,null,null,8364543,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SNOWY_SLOPES = add(new Biome("snowy_slopes",true,-0.3,"none",0.9,new Effects(12638463,null,null,null,null,8560639,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SNOWY_TAIGA = add(new Biome("snowy_taiga",true,-0.5,"none",0.4,new Effects(12638463,null,null,null,null,8625919,4020182,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SOUL_SAND_VALLEY = add(new Biome("soul_sand_valley",false,2.0,"none",0.0,new Effects(1787717,null,null,null,"minecraft:ambient.soul_sand_valley.loop",7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.soul_sand_valley.mood",6000,2,8),null,new Effects.AdditionSound("minecraft:ambient.soul_sand_valley.additions",0.0111),new Effects.Particle("minecraft:ash",0.00625)))),
        SPARSE_JUNGLE = add(new Biome("sparse_jungle",true,0.95,"none",0.8,new Effects(12638463,null,null,null,null,7842047,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        STONY_PEAKS = add(new Biome("stony_peaks",true,1.0,"none",0.3,new Effects(12638463,null,null,null,null,7776511,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        STONY_SHORE = add(new Biome("stony_shore",true,0.2,"none",0.3,new Effects(12638463,null,null,null,null,8233727,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SUNFLOWER_PLAINS = add(new Biome("sunflower_plains",true,0.8,"none",0.4,new Effects(12638463,null,null,null,null,7907327,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        SWAMP = add(new Biome("swamp",true,0.8,"none",0.9,new Effects(12638463,6975545,null,"swamp",null,7907327,6388580,2302743,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        TAIGA = add(new Biome("taiga",true,0.25,"none",0.8,new Effects(12638463,null,null,null,null,8233983,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        THE_END = add(new Biome("the_end",false,0.5,"none",0.5,new Effects(10518688,null,null,null,null,0,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        THE_VOID = add(new Biome("the_void",false,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        WARM_OCEAN = add(new Biome("warm_ocean",true,0.5,"none",0.5,new Effects(12638463,null,null,null,null,8103167,4445678,270131,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        WARPED_FOREST = add(new Biome("warped_forest",false,2.0,"none",0.0,new Effects(1705242,null,null,null,"minecraft:ambient.warped_forest.loop",7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.warped_forest.mood",6000,2,8),null,new Effects.AdditionSound("minecraft:ambient.warped_forest.additions",0.0111),new Effects.Particle("minecraft:warped_spore",0.01428)))),
        WINDSWEPT_FOREST = add(new Biome("windswept_forest",true,0.2,"none",0.3,new Effects(12638463,null,null,null,null,8233727,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        WINDSWEPT_GRAVELLY_HILLS = add(new Biome("windswept_gravelly_hills",true,0.2,"none",0.3,new Effects(12638463,null,null,null,null,8233727,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        WINDSWEPT_HILLS = add(new Biome("windswept_hills",true,0.2,"none",0.3,new Effects(12638463,null,null,null,null,8233727,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        WINDSWEPT_SAVANNA = add(new Biome("windswept_savanna",false,2.0,"none",0.0,new Effects(12638463,null,null,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null))),
        WOODED_BADLANDS = add(new Biome("wooded_badlands",false,2.0,"none",0.0,new Effects(12638463,10387789,9470285,null,null,7254527,4159204,329011,new Effects.MoodSound("minecraft:ambient.cave",6000,2,8),null,null,null)));
}