/*
* Autogenerated file. Please don't touch :)
* Class generator: ink.reactor.dataparser.registry.block.BlockParser (module data-parser)
* Date: Year: 2025. Month: 02. Day: 23. Time: 02:16:35
*/
package ink.reactor.world.block;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
@Getter
public final class Block {
    public static final char[] NONE_DROPS = new char[0];

    public static final List<Block> ALL = new ArrayList<>(1095);

	public final char id;
    private final float resistance;
    private final char[] drops;

    public Block(int id, double resistance, char[] drops) {
        this.id = (char)id;
        this.resistance = (short) (resistance >= 10000 ? -1 : resistance);
        this.drops = drops;
    }

    private static Block of(final int id, final double resistance, final int drop) {
        final Block block = new Block(id, resistance, new char[] { (char)drop });
        ALL.add(block);
        return block;
    }

    private static Block of(final int id, final double resistance, final char[] drops) {
        final Block block = new Block(id, resistance, drops);
        ALL.add(block);
        return block;
    }

    private static Block of(final int id, final double resistance) {
        final Block block = new Block(id, resistance, NONE_DROPS);
        ALL.add(block);
        return block;
    }

    public boolean hasDrops() {
        return drops.length != 0;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(final Object object) {
        return object == this || (object instanceof Block block && block.id == this.id);
    }

    public static final Block 
	AIR=of(0,0.0),
	STONE=of(1,6.0,35),
	GRANITE=of(2,6.0,2),
	POLISHED_GRANITE=of(3,6.0,3),
	DIORITE=of(4,6.0,4),
	POLISHED_DIORITE=of(5,6.0,5),
	ANDESITE=of(6,6.0,6),
	POLISHED_ANDESITE=of(7,6.0,7),
	GRASS_BLOCK=of(8,0.6,28),
	DIRT=of(9,0.5,28),
	COARSE_DIRT=of(10,0.5,29),
	PODZOL=of(11,0.5,28),
	COBBLESTONE=of(12,6.0,35),
	OAK_PLANKS=of(13,3.0,36),
	SPRUCE_PLANKS=of(14,3.0,37),
	BIRCH_PLANKS=of(15,3.0,38),
	JUNGLE_PLANKS=of(16,3.0,39),
	ACACIA_PLANKS=of(17,3.0,40),
	CHERRY_PLANKS=of(18,3.0,41),
	DARK_OAK_PLANKS=of(19,3.0,42),
	PALE_OAK_WOOD=of(20,2.0,177),
	PALE_OAK_PLANKS=of(21,3.0,43),
	MANGROVE_PLANKS=of(22,3.0,44),
	BAMBOO_PLANKS=of(23,3.0,45),
	BAMBOO_MOSAIC=of(24,3.0,48),
	OAK_SAPLING=of(25,0.0,49),
	SPRUCE_SAPLING=of(26,0.0,50),
	BIRCH_SAPLING=of(27,0.0,51),
	JUNGLE_SAPLING=of(28,0.0,52),
	ACACIA_SAPLING=of(29,0.0,53),
	CHERRY_SAPLING=of(30,0.0,54),
	DARK_OAK_SAPLING=of(31,0.0,55),
	PALE_OAK_SAPLING=of(32,0.0,56),
	MANGROVE_PROPAGULE=of(33,0.0),
	BEDROCK=of(34,3600000.0),
	WATER=of(35,100.0),
	LAVA=of(36,100.0),
	SAND=of(37,0.5,59),
	SUSPICIOUS_SAND=of(38,0.25),
	RED_SAND=of(39,0.5,62),
	GRAVEL=of(40,0.6,63),
	SUSPICIOUS_GRAVEL=of(41,0.25),
	GOLD_ORE=of(42,3.0,845),
	DEEPSLATE_GOLD_ORE=of(43,3.0,845),
	IRON_ORE=of(44,3.0,841),
	DEEPSLATE_IRON_ORE=of(45,3.0,841),
	COAL_ORE=of(46,3.0,834),
	DEEPSLATE_COAL_ORE=of(47,3.0,834),
	NETHER_GOLD_ORE=of(48,3.0,1045),
	OAK_LOG=of(49,2.0,134),
	SPRUCE_LOG=of(50,2.0,135),
	BIRCH_LOG=of(51,2.0,136),
	JUNGLE_LOG=of(52,2.0,137),
	ACACIA_LOG=of(53,2.0,138),
	CHERRY_LOG=of(54,2.0,139),
	DARK_OAK_LOG=of(55,2.0,141),
	PALE_OAK_LOG=of(56,2.0,140),
	MANGROVE_LOG=of(57,2.0,142),
	MANGROVE_ROOTS=of(58,0.7,143),
	MUDDY_MANGROVE_ROOTS=of(59,0.7,144),
	BAMBOO_BLOCK=of(60,2.0,147),
	STRIPPED_SPRUCE_LOG=of(61,2.0,149),
	STRIPPED_BIRCH_LOG=of(62,2.0,150),
	STRIPPED_JUNGLE_LOG=of(63,2.0,151),
	STRIPPED_ACACIA_LOG=of(64,2.0,152),
	STRIPPED_CHERRY_LOG=of(65,2.0,153),
	STRIPPED_DARK_OAK_LOG=of(66,2.0,154),
	STRIPPED_PALE_OAK_LOG=of(67,2.0,155),
	STRIPPED_OAK_LOG=of(68,2.0,148),
	STRIPPED_MANGROVE_LOG=of(69,2.0,156),
	STRIPPED_BAMBOO_BLOCK=of(70,2.0,170),
	OAK_WOOD=of(71,2.0,171),
	SPRUCE_WOOD=of(72,2.0,172),
	BIRCH_WOOD=of(73,2.0,173),
	JUNGLE_WOOD=of(74,2.0,174),
	ACACIA_WOOD=of(75,2.0,175),
	CHERRY_WOOD=of(76,2.0,176),
	DARK_OAK_WOOD=of(77,2.0,178),
	MANGROVE_WOOD=of(78,2.0,179),
	STRIPPED_OAK_WOOD=of(79,2.0,159),
	STRIPPED_SPRUCE_WOOD=of(80,2.0,160),
	STRIPPED_BIRCH_WOOD=of(81,2.0,161),
	STRIPPED_JUNGLE_WOOD=of(82,2.0,162),
	STRIPPED_ACACIA_WOOD=of(83,2.0,163),
	STRIPPED_CHERRY_WOOD=of(84,2.0,164),
	STRIPPED_DARK_OAK_WOOD=of(85,2.0,165),
	STRIPPED_PALE_OAK_WOOD=of(86,2.0,166),
	STRIPPED_MANGROVE_WOOD=of(87,2.0,167),
	OAK_LEAVES=of(88,0.2),
	SPRUCE_LEAVES=of(89,0.2),
	BIRCH_LEAVES=of(90,0.2),
	JUNGLE_LEAVES=of(91,0.2),
	ACACIA_LEAVES=of(92,0.2),
	CHERRY_LEAVES=of(93,0.2),
	DARK_OAK_LEAVES=of(94,0.2),
	PALE_OAK_LEAVES=of(95,0.2),
	MANGROVE_LEAVES=of(96,0.2),
	AZALEA_LEAVES=of(97,0.2),
	FLOWERING_AZALEA_LEAVES=of(98,0.2),
	SPONGE=of(99,0.6,193),
	WET_SPONGE=of(100,0.6,194),
	GLASS=of(101,0.3),
	LAPIS_ORE=of(102,3.0,838),
	DEEPSLATE_LAPIS_ORE=of(103,3.0,838),
	LAPIS_BLOCK=of(104,3.0,197),
	DISPENSER=of(105,3.5,691),
	SANDSTONE=of(106,0.8,198),
	CHISELED_SANDSTONE=of(107,0.8,199),
	CUT_SANDSTONE=of(108,0.8,200),
	NOTE_BLOCK=of(109,0.8,704),
	WHITE_BED=of(110,0.2),
	ORANGE_BED=of(111,0.2),
	MAGENTA_BED=of(112,0.2),
	LIGHT_BLUE_BED=of(113,0.2),
	YELLOW_BED=of(114,0.2),
	LIME_BED=of(115,0.2),
	PINK_BED=of(116,0.2),
	GRAY_BED=of(117,0.2),
	LIGHT_GRAY_BED=of(118,0.2),
	CYAN_BED=of(119,0.2),
	PURPLE_BED=of(120,0.2),
	BLUE_BED=of(121,0.2),
	BROWN_BED=of(122,0.2),
	GREEN_BED=of(123,0.2),
	RED_BED=of(124,0.2),
	BLACK_BED=of(125,0.2),
	POWERED_RAIL=of(126,0.7,789),
	DETECTOR_RAIL=of(127,0.7,790),
	STICKY_PISTON=of(128,1.5,686),
	COBWEB=of(129,4.0,881),
	SHORT_GRASS=of(130,0.0),
	FERN=of(131,0.0),
	DEAD_BUSH=of(132,0.0,879),
	SEAGRASS=of(133,0.0),
	TALL_SEAGRASS=of(134,0.0),
	PISTON=of(135,1.5,685),
	PISTON_HEAD=of(136,1.5),
	WHITE_WOOL=of(137,0.8,209),
	ORANGE_WOOL=of(138,0.8,210),
	MAGENTA_WOOL=of(139,0.8,211),
	LIGHT_BLUE_WOOL=of(140,0.8,212),
	YELLOW_WOOL=of(141,0.8,213),
	LIME_WOOL=of(142,0.8,214),
	PINK_WOOL=of(143,0.8,215),
	GRAY_WOOL=of(144,0.8,216),
	LIGHT_GRAY_WOOL=of(145,0.8,217),
	CYAN_WOOL=of(146,0.8,218),
	PURPLE_WOOL=of(147,0.8,219),
	BLUE_WOOL=of(148,0.8,220),
	BROWN_WOOL=of(149,0.8,221),
	GREEN_WOOL=of(150,0.8,222),
	RED_WOOL=of(151,0.8,223),
	BLACK_WOOL=of(152,0.8,224),
	MOVING_PISTON=of(153,0.0),
	DANDELION=of(154,0.0,225),
	TORCHFLOWER=of(155,0.0,240),
	POPPY=of(156,0.0,228),
	BLUE_ORCHID=of(157,0.0,229),
	ALLIUM=of(158,0.0,230),
	AZURE_BLUET=of(159,0.0,231),
	RED_TULIP=of(160,0.0,232),
	ORANGE_TULIP=of(161,0.0,233),
	WHITE_TULIP=of(162,0.0,234),
	PINK_TULIP=of(163,0.0,235),
	OXEYE_DAISY=of(164,0.0,236),
	CORNFLOWER=of(165,0.0,237),
	WITHER_ROSE=of(166,0.0,239),
	LILY_OF_THE_VALLEY=of(167,0.0,238),
	BROWN_MUSHROOM=of(168,0.0,243),
	RED_MUSHROOM=of(169,0.0,244),
	GOLD_BLOCK=of(170,6.0,92),
	IRON_BLOCK=of(171,6.0,90),
	BRICKS=of(172,6.0,298),
	TNT=of(173,0.0,702),
	BOOKSHELF=of(174,1.5,958),
	CHISELED_BOOKSHELF=of(175,1.5),
	MOSSY_COBBLESTONE=of(176,6.0,302),
	OBSIDIAN=of(177,1200.0,303),
	TORCH=of(178,0.0,304),
	WALL_TORCH=of(179,0.0,304),
	FIRE=of(180,0.0),
	SOUL_FIRE=of(181,0.0),
	SPAWNER=of(182,5.0),
	CREAKING_HEART=of(183,10.0,376),
	OAK_STAIRS=of(184,3.0,405),
	CHEST=of(185,2.5,313),
	REDSTONE_WIRE=of(186,0.0,680),
	DIAMOND_ORE=of(187,3.0,836),
	DEEPSLATE_DIAMOND_ORE=of(188,3.0,836),
	DIAMOND_BLOCK=of(189,6.0,93),
	CRAFTING_TABLE=of(190,2.5,314),
	WHEAT=of(191,0.0,884),
	FARMLAND=of(192,0.6,28),
	FURNACE=of(193,3.5,316),
	OAK_SIGN=of(194,1.0,917),
	SPRUCE_SIGN=of(195,1.0,918),
	BIRCH_SIGN=of(196,1.0,919),
	ACACIA_SIGN=of(197,1.0,921),
	CHERRY_SIGN=of(198,1.0,922),
	JUNGLE_SIGN=of(199,1.0,920),
	DARK_OAK_SIGN=of(200,1.0,923),
	PALE_OAK_SIGN=of(201,1.0,924),
	MANGROVE_SIGN=of(202,1.0,925),
	BAMBOO_SIGN=of(203,1.0,926),
	OAK_DOOR=of(204,3.0,736),
	LADDER=of(205,0.4,317),
	RAIL=of(206,0.7,791),
	COBBLESTONE_STAIRS=of(207,6.0,318),
	OAK_WALL_SIGN=of(208,1.0,917),
	SPRUCE_WALL_SIGN=of(209,1.0,918),
	BIRCH_WALL_SIGN=of(210,1.0,919),
	ACACIA_WALL_SIGN=of(211,1.0,921),
	CHERRY_WALL_SIGN=of(212,1.0,922),
	JUNGLE_WALL_SIGN=of(213,1.0,920),
	DARK_OAK_WALL_SIGN=of(214,1.0,923),
	PALE_OAK_WALL_SIGN=of(215,1.0,924),
	MANGROVE_WALL_SIGN=of(216,1.0,925),
	BAMBOO_WALL_SIGN=of(217,1.0,926),
	OAK_HANGING_SIGN=of(218,1.0,929),
	SPRUCE_HANGING_SIGN=of(219,1.0,930),
	BIRCH_HANGING_SIGN=of(220,1.0,931),
	ACACIA_HANGING_SIGN=of(221,1.0,933),
	CHERRY_HANGING_SIGN=of(222,1.0,934),
	JUNGLE_HANGING_SIGN=of(223,1.0,932),
	DARK_OAK_HANGING_SIGN=of(224,1.0,935),
	PALE_OAK_HANGING_SIGN=of(225,1.0,936),
	CRIMSON_HANGING_SIGN=of(226,1.0,939),
	WARPED_HANGING_SIGN=of(227,1.0,940),
	MANGROVE_HANGING_SIGN=of(228,1.0,937),
	BAMBOO_HANGING_SIGN=of(229,1.0,938),
	OAK_WALL_HANGING_SIGN=of(230,1.0,929),
	SPRUCE_WALL_HANGING_SIGN=of(231,1.0,930),
	BIRCH_WALL_HANGING_SIGN=of(232,1.0,931),
	ACACIA_WALL_HANGING_SIGN=of(233,1.0,933),
	CHERRY_WALL_HANGING_SIGN=of(234,1.0,934),
	JUNGLE_WALL_HANGING_SIGN=of(235,1.0,932),
	DARK_OAK_WALL_HANGING_SIGN=of(236,1.0,935),
	PALE_OAK_WALL_HANGING_SIGN=of(237,1.0,936),
	MANGROVE_WALL_HANGING_SIGN=of(238,1.0,937),
	CRIMSON_WALL_HANGING_SIGN=of(239,1.0,939),
	WARPED_WALL_HANGING_SIGN=of(240,1.0,940),
	BAMBOO_WALL_HANGING_SIGN=of(241,1.0,938),
	LEVER=of(242,0.5,695),
	STONE_PRESSURE_PLATE=of(243,0.5,719),
	IRON_DOOR=of(244,5.0,735),
	OAK_PRESSURE_PLATE=of(245,0.5,723),
	SPRUCE_PRESSURE_PLATE=of(246,0.5,724),
	BIRCH_PRESSURE_PLATE=of(247,0.5,725),
	JUNGLE_PRESSURE_PLATE=of(248,0.5,726),
	ACACIA_PRESSURE_PLATE=of(249,0.5,727),
	CHERRY_PRESSURE_PLATE=of(250,0.5,728),
	DARK_OAK_PRESSURE_PLATE=of(251,0.5,729),
	PALE_OAK_PRESSURE_PLATE=of(252,0.5,730),
	MANGROVE_PRESSURE_PLATE=of(253,0.5,731),
	BAMBOO_PRESSURE_PLATE=of(254,0.5,732),
	REDSTONE_ORE=of(255,3.0,680),
	DEEPSLATE_REDSTONE_ORE=of(256,3.0,680),
	REDSTONE_TORCH=of(257,0.0,681),
	REDSTONE_WALL_TORCH=of(258,0.0,681),
	STONE_BUTTON=of(259,0.5,705),
	SNOW=of(260,0.1),
	ICE=of(261,0.5),
	SNOW_BLOCK=of(262,0.2,945),
	CACTUS=of(263,0.4,322),
	CLAY=of(264,0.6,955),
	SUGAR_CANE=of(265,0.0,252),
	JUKEBOX=of(266,6.0,324),
	OAK_FENCE=of(267,3.0,325),
	NETHERRACK=of(268,0.4,340),
	SOUL_SAND=of(269,0.5,341),
	SOUL_SOIL=of(270,0.5,342),
	BASALT=of(271,4.2,343),
	POLISHED_BASALT=of(272,4.2,344),
	SOUL_TORCH=of(273,0.0,346),
	SOUL_WALL_TORCH=of(274,0.0,346),
	GLOWSTONE=of(275,0.3,983),
	NETHER_PORTAL=of(276,0.0),
	CARVED_PUMPKIN=of(277,1.0,338),
	JACK_O_LANTERN=of(278,1.0,339),
	CAKE=of(279,0.5),
	REPEATER=of(280,0.0,683),
	WHITE_STAINED_GLASS=of(281,0.3),
	ORANGE_STAINED_GLASS=of(282,0.3),
	MAGENTA_STAINED_GLASS=of(283,0.3),
	LIGHT_BLUE_STAINED_GLASS=of(284,0.3),
	YELLOW_STAINED_GLASS=of(285,0.3),
	LIME_STAINED_GLASS=of(286,0.3),
	PINK_STAINED_GLASS=of(287,0.3),
	GRAY_STAINED_GLASS=of(288,0.3),
	LIGHT_GRAY_STAINED_GLASS=of(289,0.3),
	CYAN_STAINED_GLASS=of(290,0.3),
	PURPLE_STAINED_GLASS=of(291,0.3),
	BLUE_STAINED_GLASS=of(292,0.3),
	BROWN_STAINED_GLASS=of(293,0.3),
	GREEN_STAINED_GLASS=of(294,0.3),
	RED_STAINED_GLASS=of(295,0.3),
	BLACK_STAINED_GLASS=of(296,0.3),
	OAK_TRAPDOOR=of(297,3.0,757),
	SPRUCE_TRAPDOOR=of(298,3.0,758),
	BIRCH_TRAPDOOR=of(299,3.0,759),
	JUNGLE_TRAPDOOR=of(300,3.0,760),
	ACACIA_TRAPDOOR=of(301,3.0,761),
	CHERRY_TRAPDOOR=of(302,3.0,762),
	DARK_OAK_TRAPDOOR=of(303,3.0,763),
	PALE_OAK_TRAPDOOR=of(304,3.0,764),
	MANGROVE_TRAPDOOR=of(305,3.0,765),
	BAMBOO_TRAPDOOR=of(306,3.0,766),
	STONE_BRICKS=of(307,6.0,355),
	MOSSY_STONE_BRICKS=of(308,6.0,356),
	CRACKED_STONE_BRICKS=of(309,6.0,357),
	CHISELED_STONE_BRICKS=of(310,6.0,358),
	PACKED_MUD=of(311,3.0,359),
	MUD_BRICKS=of(312,3.0,360),
	INFESTED_STONE=of(313,0.75),
	INFESTED_COBBLESTONE=of(314,0.75),
	INFESTED_STONE_BRICKS=of(315,0.75),
	INFESTED_MOSSY_STONE_BRICKS=of(316,0.75),
	INFESTED_CRACKED_STONE_BRICKS=of(317,0.75),
	INFESTED_CHISELED_STONE_BRICKS=of(318,0.75),
	BROWN_MUSHROOM_BLOCK=of(319,0.2,0),
	RED_MUSHROOM_BLOCK=of(320,0.2,0),
	MUSHROOM_STEM=of(321,0.2),
	IRON_BARS=of(322,6.0,370),
	CHAIN=of(323,6.0,371),
	GLASS_PANE=of(324,0.3),
	PUMPKIN=of(325,1.0,337),
	MELON=of(326,1.0,1033),
	ATTACHED_PUMPKIN_STEM=of(327,0.0,1035),
	ATTACHED_MELON_STEM=of(328,0.0,1036),
	PUMPKIN_STEM=of(329,0.0,0),
	MELON_STEM=of(330,0.0,1036),
	VINE=of(331,0.2),
	GLOW_LICHEN=of(332,0.2),
	RESIN_CLUMP=of(333,0.0,0),
	OAK_FENCE_GATE=of(334,3.0,777),
	BRICK_STAIRS=of(335,6.0,383),
	STONE_BRICK_STAIRS=of(336,6.0,384),
	MUD_BRICK_STAIRS=of(337,3.0,385),
	MYCELIUM=of(338,0.6,28),
	LILY_PAD=of(339,0.0,387),
	RESIN_BLOCK=of(340,0.0,377),
	RESIN_BRICKS=of(341,6.0,378),
	RESIN_BRICK_STAIRS=of(342,6.0,379),
	RESIN_BRICK_SLAB=of(343,6.0,380),
	RESIN_BRICK_WALL=of(344,6.0,381),
	CHISELED_RESIN_BRICKS=of(345,6.0,382),
	NETHER_BRICKS=of(346,6.0,388),
	NETHER_BRICK_FENCE=of(347,6.0,391),
	NETHER_BRICK_STAIRS=of(348,6.0,392),
	NETHER_WART=of(349,0.0,1046),
	ENCHANTING_TABLE=of(350,1200.0,397),
	BREWING_STAND=of(351,0.5,1053),
	CAULDRON=of(352,2.0,1054),
	WATER_CAULDRON=of(353,2.0,1054),
	LAVA_CAULDRON=of(354,2.0,1054),
	POWDER_SNOW_CAULDRON=of(355,2.0,1054),
	END_PORTAL=of(356,3600000.0),
	END_PORTAL_FRAME=of(357,3600000.0),
	END_STONE=of(358,9.0,399),
	DRAGON_EGG=of(359,9.0,401),
	REDSTONE_LAMP=of(360,0.3,703),
	COCOA=of(361,3.0,992),
	SANDSTONE_STAIRS=of(362,0.8,402),
	EMERALD_ORE=of(363,3.0,837),
	DEEPSLATE_EMERALD_ORE=of(364,3.0,837),
	ENDER_CHEST=of(365,600.0,303),
	TRIPWIRE_HOOK=of(366,0.0,700),
	TRIPWIRE=of(367,0.0,881),
	EMERALD_BLOCK=of(368,6.0,404),
	SPRUCE_STAIRS=of(369,3.0,406),
	BIRCH_STAIRS=of(370,3.0,407),
	JUNGLE_STAIRS=of(371,3.0,408),
	COMMAND_BLOCK=of(372,3600000.0),
	BEACON=of(373,3.0,419),
	COBBLESTONE_WALL=of(374,6.0,420),
	MOSSY_COBBLESTONE_WALL=of(375,6.0,421),
	FLOWER_POT=of(376,0.0,1147),
	POTTED_TORCHFLOWER=of(377,0.0,new char[] {1147,240}),
	POTTED_OAK_SAPLING=of(378,0.0,new char[] {1147,49}),
	POTTED_SPRUCE_SAPLING=of(379,0.0,new char[] {1147,50}),
	POTTED_BIRCH_SAPLING=of(380,0.0,new char[] {1147,51}),
	POTTED_JUNGLE_SAPLING=of(381,0.0,new char[] {1147,52}),
	POTTED_ACACIA_SAPLING=of(382,0.0,new char[] {1147,53}),
	POTTED_CHERRY_SAPLING=of(383,0.0,new char[] {1147,54}),
	POTTED_DARK_OAK_SAPLING=of(384,0.0,new char[] {1147,55}),
	POTTED_PALE_OAK_SAPLING=of(385,0.0,new char[] {1147,56}),
	POTTED_MANGROVE_PROPAGULE=of(386,0.0,new char[] {1147,57}),
	POTTED_FERN=of(387,0.0,new char[] {1147,203}),
	POTTED_DANDELION=of(388,0.0,new char[] {1147,225}),
	POTTED_POPPY=of(389,0.0,new char[] {1147,228}),
	POTTED_BLUE_ORCHID=of(390,0.0,new char[] {1147,229}),
	POTTED_ALLIUM=of(391,0.0,new char[] {1147,230}),
	POTTED_AZURE_BLUET=of(392,0.0,new char[] {1147,231}),
	POTTED_RED_TULIP=of(393,0.0,new char[] {1147,232}),
	POTTED_ORANGE_TULIP=of(394,0.0,new char[] {1147,233}),
	POTTED_WHITE_TULIP=of(395,0.0,new char[] {1147,234}),
	POTTED_PINK_TULIP=of(396,0.0,new char[] {1147,235}),
	POTTED_OXEYE_DAISY=of(397,0.0,new char[] {1147,236}),
	POTTED_CORNFLOWER=of(398,0.0,new char[] {1147,237}),
	POTTED_LILY_OF_THE_VALLEY=of(399,0.0,new char[] {1147,238}),
	POTTED_WITHER_ROSE=of(400,0.0,new char[] {1147,239}),
	POTTED_RED_MUSHROOM=of(401,0.0,new char[] {1147,244}),
	POTTED_BROWN_MUSHROOM=of(402,0.0,new char[] {1147,243}),
	POTTED_DEAD_BUSH=of(403,0.0,new char[] {1147,206}),
	POTTED_CACTUS=of(404,0.0,new char[] {1147,322}),
	CARROTS=of(405,0.0,1148),
	POTATOES=of(406,0.0,1149),
	OAK_BUTTON=of(407,0.5,707),
	SPRUCE_BUTTON=of(408,0.5,708),
	BIRCH_BUTTON=of(409,0.5,709),
	JUNGLE_BUTTON=of(410,0.5,710),
	ACACIA_BUTTON=of(411,0.5,711),
	CHERRY_BUTTON=of(412,0.5,712),
	DARK_OAK_BUTTON=of(413,0.5,713),
	PALE_OAK_BUTTON=of(414,0.5,714),
	MANGROVE_BUTTON=of(415,0.5,715),
	BAMBOO_BUTTON=of(416,0.5,716),
	SKELETON_SKULL=of(417,1.0,1154),
	SKELETON_WALL_SKULL=of(418,1.0,1154),
	WITHER_SKELETON_SKULL=of(419,1.0,1155),
	WITHER_SKELETON_WALL_SKULL=of(420,1.0,1155),
	ZOMBIE_HEAD=of(421,1.0,1157),
	ZOMBIE_WALL_HEAD=of(422,1.0,1157),
	PLAYER_HEAD=of(423,1.0,1156),
	PLAYER_WALL_HEAD=of(424,1.0,1156),
	CREEPER_HEAD=of(425,1.0,1158),
	CREEPER_WALL_HEAD=of(426,1.0,1158),
	DRAGON_HEAD=of(427,1.0,1159),
	DRAGON_WALL_HEAD=of(428,1.0,1159),
	PIGLIN_HEAD=of(429,1.0,1160),
	PIGLIN_WALL_HEAD=of(430,1.0,1160),
	ANVIL=of(431,1200.0,442),
	CHIPPED_ANVIL=of(432,1200.0,443),
	DAMAGED_ANVIL=of(433,1200.0,444),
	TRAPPED_CHEST=of(434,2.5,701),
	LIGHT_WEIGHTED_PRESSURE_PLATE=of(435,0.5,721),
	HEAVY_WEIGHTED_PRESSURE_PLATE=of(436,0.5,722),
	COMPARATOR=of(437,0.0,684),
	DAYLIGHT_DETECTOR=of(438,0.2,697),
	REDSTONE_BLOCK=of(439,6.0,682),
	NETHER_QUARTZ_ORE=of(440,3.0,839),
	HOPPER=of(441,4.8,690),
	QUARTZ_BLOCK=of(442,0.8,446),
	CHISELED_QUARTZ_BLOCK=of(443,0.8,445),
	QUARTZ_PILLAR=of(444,0.8,448),
	QUARTZ_STAIRS=of(445,0.8,449),
	ACTIVATOR_RAIL=of(446,0.7,792),
	DROPPER=of(447,3.5,692),
	WHITE_TERRACOTTA=of(448,4.2,450),
	ORANGE_TERRACOTTA=of(449,4.2,451),
	MAGENTA_TERRACOTTA=of(450,4.2,452),
	LIGHT_BLUE_TERRACOTTA=of(451,4.2,453),
	YELLOW_TERRACOTTA=of(452,4.2,454),
	LIME_TERRACOTTA=of(453,4.2,455),
	PINK_TERRACOTTA=of(454,4.2,456),
	GRAY_TERRACOTTA=of(455,4.2,457),
	LIGHT_GRAY_TERRACOTTA=of(456,4.2,458),
	CYAN_TERRACOTTA=of(457,4.2,459),
	PURPLE_TERRACOTTA=of(458,4.2,460),
	BLUE_TERRACOTTA=of(459,4.2,461),
	BROWN_TERRACOTTA=of(460,4.2,462),
	GREEN_TERRACOTTA=of(461,4.2,463),
	RED_TERRACOTTA=of(462,4.2,464),
	BLACK_TERRACOTTA=of(463,4.2,465),
	WHITE_STAINED_GLASS_PANE=of(464,0.3),
	ORANGE_STAINED_GLASS_PANE=of(465,0.3),
	MAGENTA_STAINED_GLASS_PANE=of(466,0.3),
	LIGHT_BLUE_STAINED_GLASS_PANE=of(467,0.3),
	YELLOW_STAINED_GLASS_PANE=of(468,0.3),
	LIME_STAINED_GLASS_PANE=of(469,0.3),
	PINK_STAINED_GLASS_PANE=of(470,0.3),
	GRAY_STAINED_GLASS_PANE=of(471,0.3),
	LIGHT_GRAY_STAINED_GLASS_PANE=of(472,0.3),
	CYAN_STAINED_GLASS_PANE=of(473,0.3),
	PURPLE_STAINED_GLASS_PANE=of(474,0.3),
	BLUE_STAINED_GLASS_PANE=of(475,0.3),
	BROWN_STAINED_GLASS_PANE=of(476,0.3),
	GREEN_STAINED_GLASS_PANE=of(477,0.3),
	RED_STAINED_GLASS_PANE=of(478,0.3),
	BLACK_STAINED_GLASS_PANE=of(479,0.3),
	ACACIA_STAIRS=of(480,3.0,409),
	CHERRY_STAIRS=of(481,3.0,410),
	DARK_OAK_STAIRS=of(482,3.0,411),
	PALE_OAK_STAIRS=of(483,3.0,412),
	MANGROVE_STAIRS=of(484,3.0,413),
	BAMBOO_STAIRS=of(485,3.0,414),
	BAMBOO_MOSAIC_STAIRS=of(486,3.0,415),
	SLIME_BLOCK=of(487,0.0,687),
	BARRIER=of(488,3600000.8),
	LIGHT=of(489,3600000.8),
	IRON_TRAPDOOR=of(490,5.0,756),
	PRISMARINE=of(491,6.0,526),
	PRISMARINE_BRICKS=of(492,6.0,527),
	DARK_PRISMARINE=of(493,6.0,528),
	PRISMARINE_STAIRS=of(494,6.0,529),
	PRISMARINE_BRICK_STAIRS=of(495,6.0,530),
	DARK_PRISMARINE_STAIRS=of(496,6.0,531),
	PRISMARINE_SLAB=of(497,6.0,291),
	PRISMARINE_BRICK_SLAB=of(498,6.0,292),
	DARK_PRISMARINE_SLAB=of(499,6.0,293),
	SEA_LANTERN=of(500,0.3,1169),
	HAY_BLOCK=of(501,0.5,468),
	WHITE_CARPET=of(502,0.1,469),
	ORANGE_CARPET=of(503,0.1,470),
	MAGENTA_CARPET=of(504,0.1,471),
	LIGHT_BLUE_CARPET=of(505,0.1,472),
	YELLOW_CARPET=of(506,0.1,473),
	LIME_CARPET=of(507,0.1,474),
	PINK_CARPET=of(508,0.1,475),
	GRAY_CARPET=of(509,0.1,476),
	LIGHT_GRAY_CARPET=of(510,0.1,477),
	CYAN_CARPET=of(511,0.1,478),
	PURPLE_CARPET=of(512,0.1,479),
	BLUE_CARPET=of(513,0.1,480),
	BROWN_CARPET=of(514,0.1,481),
	GREEN_CARPET=of(515,0.1,482),
	RED_CARPET=of(516,0.1,483),
	BLACK_CARPET=of(517,0.1,484),
	TERRACOTTA=of(518,4.2,485),
	COAL_BLOCK=of(519,6.0,83),
	PACKED_ICE=of(520,0.5),
	SUNFLOWER=of(521,0.0,488),
	LILAC=of(522,0.0,489),
	ROSE_BUSH=of(523,0.0,490),
	PEONY=of(524,0.0,491),
	TALL_GRASS=of(525,0.0),
	LARGE_FERN=of(526,0.0),
	WHITE_BANNER=of(527,1.0,1185),
	ORANGE_BANNER=of(528,1.0,1186),
	MAGENTA_BANNER=of(529,1.0,1187),
	LIGHT_BLUE_BANNER=of(530,1.0,1188),
	YELLOW_BANNER=of(531,1.0,1189),
	LIME_BANNER=of(532,1.0,1190),
	PINK_BANNER=of(533,1.0,1191),
	GRAY_BANNER=of(534,1.0,1192),
	LIGHT_GRAY_BANNER=of(535,1.0,1193),
	CYAN_BANNER=of(536,1.0,1194),
	PURPLE_BANNER=of(537,1.0,1195),
	BLUE_BANNER=of(538,1.0,1196),
	BROWN_BANNER=of(539,1.0,1197),
	GREEN_BANNER=of(540,1.0,1198),
	RED_BANNER=of(541,1.0,1199),
	BLACK_BANNER=of(542,1.0,1200),
	WHITE_WALL_BANNER=of(543,1.0,1185),
	ORANGE_WALL_BANNER=of(544,1.0,1186),
	MAGENTA_WALL_BANNER=of(545,1.0,1187),
	LIGHT_BLUE_WALL_BANNER=of(546,1.0,1188),
	YELLOW_WALL_BANNER=of(547,1.0,1189),
	LIME_WALL_BANNER=of(548,1.0,1190),
	PINK_WALL_BANNER=of(549,1.0,1191),
	GRAY_WALL_BANNER=of(550,1.0,1192),
	LIGHT_GRAY_WALL_BANNER=of(551,1.0,1193),
	CYAN_WALL_BANNER=of(552,1.0,1194),
	PURPLE_WALL_BANNER=of(553,1.0,1195),
	BLUE_WALL_BANNER=of(554,1.0,1196),
	BROWN_WALL_BANNER=of(555,1.0,1197),
	GREEN_WALL_BANNER=of(556,1.0,1198),
	RED_WALL_BANNER=of(557,1.0,1199),
	BLACK_WALL_BANNER=of(558,1.0,1200),
	RED_SANDSTONE=of(559,0.8,533),
	CHISELED_RED_SANDSTONE=of(560,0.8,534),
	CUT_RED_SANDSTONE=of(561,0.8,535),
	RED_SANDSTONE_STAIRS=of(562,0.8,536),
	OAK_SLAB=of(563,3.0,264),
	SPRUCE_SLAB=of(564,3.0,265),
	BIRCH_SLAB=of(565,3.0,266),
	JUNGLE_SLAB=of(566,3.0,267),
	ACACIA_SLAB=of(567,3.0,268),
	CHERRY_SLAB=of(568,3.0,269),
	DARK_OAK_SLAB=of(569,3.0,270),
	PALE_OAK_SLAB=of(570,3.0,271),
	MANGROVE_SLAB=of(571,3.0,272),
	BAMBOO_SLAB=of(572,3.0,273),
	BAMBOO_MOSAIC_SLAB=of(573,3.0,274),
	STONE_SLAB=of(574,6.0,277),
	SMOOTH_STONE_SLAB=of(575,6.0,278),
	SANDSTONE_SLAB=of(576,6.0,279),
	CUT_SANDSTONE_SLAB=of(577,6.0,280),
	PETRIFIED_OAK_SLAB=of(578,6.0,281),
	COBBLESTONE_SLAB=of(579,6.0,282),
	BRICK_SLAB=of(580,6.0,283),
	STONE_BRICK_SLAB=of(581,6.0,284),
	MUD_BRICK_SLAB=of(582,3.0,285),
	NETHER_BRICK_SLAB=of(583,6.0,286),
	QUARTZ_SLAB=of(584,6.0,287),
	RED_SANDSTONE_SLAB=of(585,6.0,288),
	CUT_RED_SANDSTONE_SLAB=of(586,6.0,289),
	PURPUR_SLAB=of(587,6.0,290),
	SMOOTH_STONE=of(588,6.0,297),
	SMOOTH_SANDSTONE=of(589,6.0,296),
	SMOOTH_QUARTZ=of(590,6.0,294),
	SMOOTH_RED_SANDSTONE=of(591,6.0,295),
	SPRUCE_FENCE_GATE=of(592,3.0,778),
	BIRCH_FENCE_GATE=of(593,3.0,779),
	JUNGLE_FENCE_GATE=of(594,3.0,780),
	ACACIA_FENCE_GATE=of(595,3.0,781),
	CHERRY_FENCE_GATE=of(596,3.0,782),
	DARK_OAK_FENCE_GATE=of(597,3.0,783),
	PALE_OAK_FENCE_GATE=of(598,3.0,784),
	MANGROVE_FENCE_GATE=of(599,3.0,785),
	BAMBOO_FENCE_GATE=of(600,3.0,786),
	SPRUCE_FENCE=of(601,3.0,326),
	BIRCH_FENCE=of(602,3.0,327),
	JUNGLE_FENCE=of(603,3.0,328),
	ACACIA_FENCE=of(604,3.0,329),
	CHERRY_FENCE=of(605,3.0,330),
	DARK_OAK_FENCE=of(606,3.0,331),
	PALE_OAK_FENCE=of(607,3.0,332),
	MANGROVE_FENCE=of(608,3.0,333),
	BAMBOO_FENCE=of(609,3.0,334),
	SPRUCE_DOOR=of(610,3.0,737),
	BIRCH_DOOR=of(611,3.0,738),
	JUNGLE_DOOR=of(612,3.0,739),
	ACACIA_DOOR=of(613,3.0,740),
	CHERRY_DOOR=of(614,3.0,741),
	DARK_OAK_DOOR=of(615,3.0,742),
	PALE_OAK_DOOR=of(616,3.0,743),
	MANGROVE_DOOR=of(617,3.0,744),
	BAMBOO_DOOR=of(618,3.0,745),
	END_ROD=of(619,0.0,305),
	CHORUS_PLANT=of(620,0.4,0),
	CHORUS_FLOWER=of(621,0.4),
	PURPUR_BLOCK=of(622,6.0,308),
	PURPUR_PILLAR=of(623,6.0,309),
	PURPUR_STAIRS=of(624,6.0,310),
	END_STONE_BRICKS=of(625,9.0,400),
	TORCHFLOWER_CROP=of(626,0.0,1204),
	PITCHER_CROP=of(627,0.0,1205),
	PITCHER_PLANT=of(628,0.0,241),
	BEETROOTS=of(629,0.0,1207),
	DIRT_PATH=of(630,0.65,28),
	END_GATEWAY=of(631,3600000.0),
	REPEATING_COMMAND_BLOCK=of(632,3600000.0),
	CHAIN_COMMAND_BLOCK=of(633,3600000.0),
	FROSTED_ICE=of(634,0.5),
	MAGMA_BLOCK=of(635,0.5,539),
	NETHER_WART_BLOCK=of(636,1.0,540),
	RED_NETHER_BRICKS=of(637,6.0,542),
	BONE_BLOCK=of(638,2.0,543),
	STRUCTURE_VOID=of(639,0.0),
	OBSERVER=of(640,3.0,689),
	SHULKER_BOX=of(641,2.0,545),
	WHITE_SHULKER_BOX=of(642,2.0,546),
	ORANGE_SHULKER_BOX=of(643,2.0,547),
	MAGENTA_SHULKER_BOX=of(644,2.0,548),
	LIGHT_BLUE_SHULKER_BOX=of(645,2.0,549),
	YELLOW_SHULKER_BOX=of(646,2.0,550),
	LIME_SHULKER_BOX=of(647,2.0,551),
	PINK_SHULKER_BOX=of(648,2.0,552),
	GRAY_SHULKER_BOX=of(649,2.0,553),
	LIGHT_GRAY_SHULKER_BOX=of(650,2.0,554),
	CYAN_SHULKER_BOX=of(651,2.0,555),
	PURPLE_SHULKER_BOX=of(652,2.0,556),
	BLUE_SHULKER_BOX=of(653,2.0,557),
	BROWN_SHULKER_BOX=of(654,2.0,558),
	GREEN_SHULKER_BOX=of(655,2.0,559),
	RED_SHULKER_BOX=of(656,2.0,560),
	BLACK_SHULKER_BOX=of(657,2.0,561),
	WHITE_GLAZED_TERRACOTTA=of(658,1.4,562),
	ORANGE_GLAZED_TERRACOTTA=of(659,1.4,563),
	MAGENTA_GLAZED_TERRACOTTA=of(660,1.4,564),
	LIGHT_BLUE_GLAZED_TERRACOTTA=of(661,1.4,565),
	YELLOW_GLAZED_TERRACOTTA=of(662,1.4,566),
	LIME_GLAZED_TERRACOTTA=of(663,1.4,567),
	PINK_GLAZED_TERRACOTTA=of(664,1.4,568),
	GRAY_GLAZED_TERRACOTTA=of(665,1.4,569),
	LIGHT_GRAY_GLAZED_TERRACOTTA=of(666,1.4,570),
	CYAN_GLAZED_TERRACOTTA=of(667,1.4,571),
	PURPLE_GLAZED_TERRACOTTA=of(668,1.4,572),
	BLUE_GLAZED_TERRACOTTA=of(669,1.4,573),
	BROWN_GLAZED_TERRACOTTA=of(670,1.4,574),
	GREEN_GLAZED_TERRACOTTA=of(671,1.4,575),
	RED_GLAZED_TERRACOTTA=of(672,1.4,576),
	BLACK_GLAZED_TERRACOTTA=of(673,1.4,577),
	WHITE_CONCRETE=of(674,1.8,578),
	ORANGE_CONCRETE=of(675,1.8,579),
	MAGENTA_CONCRETE=of(676,1.8,580),
	LIGHT_BLUE_CONCRETE=of(677,1.8,581),
	YELLOW_CONCRETE=of(678,1.8,582),
	LIME_CONCRETE=of(679,1.8,583),
	PINK_CONCRETE=of(680,1.8,584),
	GRAY_CONCRETE=of(681,1.8,585),
	LIGHT_GRAY_CONCRETE=of(682,1.8,586),
	CYAN_CONCRETE=of(683,1.8,587),
	PURPLE_CONCRETE=of(684,1.8,588),
	BLUE_CONCRETE=of(685,1.8,589),
	BROWN_CONCRETE=of(686,1.8,590),
	GREEN_CONCRETE=of(687,1.8,591),
	RED_CONCRETE=of(688,1.8,592),
	BLACK_CONCRETE=of(689,1.8,593),
	WHITE_CONCRETE_POWDER=of(690,0.5,594),
	ORANGE_CONCRETE_POWDER=of(691,0.5,595),
	MAGENTA_CONCRETE_POWDER=of(692,0.5,596),
	LIGHT_BLUE_CONCRETE_POWDER=of(693,0.5,597),
	YELLOW_CONCRETE_POWDER=of(694,0.5,598),
	LIME_CONCRETE_POWDER=of(695,0.5,599),
	PINK_CONCRETE_POWDER=of(696,0.5,600),
	GRAY_CONCRETE_POWDER=of(697,0.5,601),
	LIGHT_GRAY_CONCRETE_POWDER=of(698,0.5,602),
	CYAN_CONCRETE_POWDER=of(699,0.5,603),
	PURPLE_CONCRETE_POWDER=of(700,0.5,604),
	BLUE_CONCRETE_POWDER=of(701,0.5,605),
	BROWN_CONCRETE_POWDER=of(702,0.5,606),
	GREEN_CONCRETE_POWDER=of(703,0.5,607),
	RED_CONCRETE_POWDER=of(704,0.5,608),
	BLACK_CONCRETE_POWDER=of(705,0.5,609),
	KELP=of(706,0.0,253),
	KELP_PLANT=of(707,0.0,253),
	DRIED_KELP_BLOCK=of(708,2.5,956),
	TURTLE_EGG=of(709,0.5),
	SNIFFER_EGG=of(710,0.5,611),
	DEAD_TUBE_CORAL_BLOCK=of(711,6.0,612),
	DEAD_BRAIN_CORAL_BLOCK=of(712,6.0,613),
	DEAD_BUBBLE_CORAL_BLOCK=of(713,6.0,614),
	DEAD_FIRE_CORAL_BLOCK=of(714,6.0,615),
	DEAD_HORN_CORAL_BLOCK=of(715,6.0,616),
	TUBE_CORAL_BLOCK=of(716,6.0,612),
	BRAIN_CORAL_BLOCK=of(717,6.0,613),
	BUBBLE_CORAL_BLOCK=of(718,6.0,614),
	FIRE_CORAL_BLOCK=of(719,6.0,615),
	HORN_CORAL_BLOCK=of(720,6.0,616),
	DEAD_TUBE_CORAL=of(721,0.0),
	DEAD_BRAIN_CORAL=of(722,0.0),
	DEAD_BUBBLE_CORAL=of(723,0.0),
	DEAD_FIRE_CORAL=of(724,0.0),
	DEAD_HORN_CORAL=of(725,0.0),
	TUBE_CORAL=of(726,0.0),
	BRAIN_CORAL=of(727,0.0),
	BUBBLE_CORAL=of(728,0.0),
	FIRE_CORAL=of(729,0.0),
	HORN_CORAL=of(730,0.0),
	DEAD_TUBE_CORAL_FAN=of(731,0.0),
	DEAD_BRAIN_CORAL_FAN=of(732,0.0),
	DEAD_BUBBLE_CORAL_FAN=of(733,0.0),
	DEAD_FIRE_CORAL_FAN=of(734,0.0),
	DEAD_HORN_CORAL_FAN=of(735,0.0),
	TUBE_CORAL_FAN=of(736,0.0),
	BRAIN_CORAL_FAN=of(737,0.0),
	BUBBLE_CORAL_FAN=of(738,0.0),
	FIRE_CORAL_FAN=of(739,0.0),
	HORN_CORAL_FAN=of(740,0.0),
	DEAD_TUBE_CORAL_WALL_FAN=of(741,0.0),
	DEAD_BRAIN_CORAL_WALL_FAN=of(742,0.0),
	DEAD_BUBBLE_CORAL_WALL_FAN=of(743,0.0),
	DEAD_FIRE_CORAL_WALL_FAN=of(744,0.0),
	DEAD_HORN_CORAL_WALL_FAN=of(745,0.0),
	TUBE_CORAL_WALL_FAN=of(746,0.0),
	BRAIN_CORAL_WALL_FAN=of(747,0.0),
	BUBBLE_CORAL_WALL_FAN=of(748,0.0),
	FIRE_CORAL_WALL_FAN=of(749,0.0),
	HORN_CORAL_WALL_FAN=of(750,0.0),
	SEA_PICKLE=of(751,0.0,208),
	BLUE_ICE=of(752,2.8),
	CONDUIT=of(753,3.0,643),
	BAMBOO_SAPLING=of(754,1.0,263),
	BAMBOO=of(755,1.0,263),
	POTTED_BAMBOO=of(756,0.0,new char[] {1147,263}),
	VOID_AIR=of(757,0.0),
	CAVE_AIR=of(758,0.0),
	BUBBLE_COLUMN=of(759,0.0),
	POLISHED_GRANITE_STAIRS=of(760,6.0,644),
	SMOOTH_RED_SANDSTONE_STAIRS=of(761,6.0,645),
	MOSSY_STONE_BRICK_STAIRS=of(762,6.0,646),
	POLISHED_DIORITE_STAIRS=of(763,6.0,647),
	MOSSY_COBBLESTONE_STAIRS=of(764,6.0,648),
	END_STONE_BRICK_STAIRS=of(765,9.0,649),
	STONE_STAIRS=of(766,6.0,650),
	SMOOTH_SANDSTONE_STAIRS=of(767,6.0,651),
	SMOOTH_QUARTZ_STAIRS=of(768,6.0,652),
	GRANITE_STAIRS=of(769,6.0,653),
	ANDESITE_STAIRS=of(770,6.0,654),
	RED_NETHER_BRICK_STAIRS=of(771,6.0,655),
	POLISHED_ANDESITE_STAIRS=of(772,6.0,656),
	DIORITE_STAIRS=of(773,6.0,657),
	POLISHED_GRANITE_SLAB=of(774,6.0,662),
	SMOOTH_RED_SANDSTONE_SLAB=of(775,6.0,663),
	MOSSY_STONE_BRICK_SLAB=of(776,6.0,664),
	POLISHED_DIORITE_SLAB=of(777,6.0,665),
	MOSSY_COBBLESTONE_SLAB=of(778,6.0,666),
	END_STONE_BRICK_SLAB=of(779,9.0,667),
	SMOOTH_SANDSTONE_SLAB=of(780,6.0,668),
	SMOOTH_QUARTZ_SLAB=of(781,6.0,669),
	GRANITE_SLAB=of(782,6.0,670),
	ANDESITE_SLAB=of(783,6.0,671),
	RED_NETHER_BRICK_SLAB=of(784,6.0,672),
	POLISHED_ANDESITE_SLAB=of(785,6.0,673),
	DIORITE_SLAB=of(786,6.0,674),
	BRICK_WALL=of(787,6.0,422),
	PRISMARINE_WALL=of(788,6.0,423),
	RED_SANDSTONE_WALL=of(789,0.8,424),
	MOSSY_STONE_BRICK_WALL=of(790,6.0,425),
	GRANITE_WALL=of(791,6.0,426),
	STONE_BRICK_WALL=of(792,6.0,427),
	MUD_BRICK_WALL=of(793,3.0,428),
	NETHER_BRICK_WALL=of(794,6.0,429),
	ANDESITE_WALL=of(795,6.0,430),
	RED_NETHER_BRICK_WALL=of(796,6.0,431),
	SANDSTONE_WALL=of(797,0.8,432),
	END_STONE_BRICK_WALL=of(798,9.0,433),
	DIORITE_WALL=of(799,6.0,434),
	SCAFFOLDING=of(800,0.0,679),
	LOOM=of(801,2.5,1245),
	BARREL=of(802,2.5,1258),
	SMOKER=of(803,3.5,1259),
	BLAST_FURNACE=of(804,3.5,1260),
	CARTOGRAPHY_TABLE=of(805,2.5,1261),
	FLETCHING_TABLE=of(806,2.5,1262),
	GRINDSTONE=of(807,6.0,1263),
	LECTERN=of(808,2.5,693),
	SMITHING_TABLE=of(809,2.5,1264),
	STONECUTTER=of(810,3.5,1265),
	BELL=of(811,5.0,1266),
	LANTERN=of(812,3.5,1267),
	SOUL_LANTERN=of(813,3.5,1268),
	CAMPFIRE=of(814,2.0,835),
	SOUL_CAMPFIRE=of(815,2.0,342),
	SWEET_BERRY_BUSH=of(816,0.0),
	WARPED_STEM=of(817,2.0,146),
	STRIPPED_WARPED_STEM=of(818,2.0,158),
	WARPED_HYPHAE=of(819,2.0,181),
	STRIPPED_WARPED_HYPHAE=of(820,2.0,169),
	WARPED_NYLIUM=of(821,0.4,340),
	WARPED_FUNGUS=of(822,0.0,246),
	WARPED_WART_BLOCK=of(823,1.0,541),
	WARPED_ROOTS=of(824,0.0,248),
	NETHER_SPROUTS=of(825,0.0),
	CRIMSON_STEM=of(826,2.0,145),
	STRIPPED_CRIMSON_STEM=of(827,2.0,157),
	CRIMSON_HYPHAE=of(828,2.0,180),
	STRIPPED_CRIMSON_HYPHAE=of(829,2.0,168),
	CRIMSON_NYLIUM=of(830,0.4,340),
	CRIMSON_FUNGUS=of(831,0.0,245),
	SHROOMLIGHT=of(832,1.0,1273),
	WEEPING_VINES=of(833,0.0,250),
	WEEPING_VINES_PLANT=of(834,0.0),
	TWISTING_VINES=of(835,0.0),
	TWISTING_VINES_PLANT=of(836,0.0),
	CRIMSON_ROOTS=of(837,0.0,247),
	CRIMSON_PLANKS=of(838,3.0,46),
	WARPED_PLANKS=of(839,3.0,47),
	CRIMSON_SLAB=of(840,3.0,275),
	WARPED_SLAB=of(841,3.0,276),
	CRIMSON_PRESSURE_PLATE=of(842,0.5,733),
	WARPED_PRESSURE_PLATE=of(843,0.5,734),
	CRIMSON_FENCE=of(844,3.0,335),
	WARPED_FENCE=of(845,3.0,336),
	CRIMSON_TRAPDOOR=of(846,3.0,767),
	WARPED_TRAPDOOR=of(847,3.0,768),
	CRIMSON_FENCE_GATE=of(848,3.0,787),
	WARPED_FENCE_GATE=of(849,3.0,788),
	CRIMSON_STAIRS=of(850,3.0,416),
	WARPED_STAIRS=of(851,3.0,417),
	CRIMSON_BUTTON=of(852,0.5,717),
	WARPED_BUTTON=of(853,0.5,718),
	CRIMSON_DOOR=of(854,3.0,746),
	WARPED_DOOR=of(855,3.0,747),
	CRIMSON_SIGN=of(856,1.0,927),
	WARPED_SIGN=of(857,1.0,928),
	CRIMSON_WALL_SIGN=of(858,1.0,927),
	WARPED_WALL_SIGN=of(859,1.0,928),
	STRUCTURE_BLOCK=of(860,3600000.0),
	JIGSAW=of(861,3600000.0),
	COMPOSTER=of(862,0.6,1257),
	TARGET=of(863,0.5,694),
	BEE_NEST=of(864,0.3),
	BEEHIVE=of(865,0.6,1276),
	HONEY_BLOCK=of(866,0.0,688),
	HONEYCOMB_BLOCK=of(867,0.6,1278),
	NETHERITE_BLOCK=of(868,1200.0,94),
	ANCIENT_DEBRIS=of(869,1200.0,82),
	CRYING_OBSIDIAN=of(870,1200.0,1280),
	RESPAWN_ANCHOR=of(871,1200.0,1293),
	POTTED_CRIMSON_FUNGUS=of(872,0.0,new char[] {1147,245}),
	POTTED_WARPED_FUNGUS=of(873,0.0,new char[] {1147,246}),
	POTTED_CRIMSON_ROOTS=of(874,0.0,new char[] {1147,247}),
	POTTED_WARPED_ROOTS=of(875,0.0,new char[] {1147,248}),
	LODESTONE=of(876,3.5,1279),
	BLACKSTONE=of(877,6.0,1281),
	BLACKSTONE_STAIRS=of(878,6.0,1283),
	BLACKSTONE_WALL=of(879,6.0,435),
	BLACKSTONE_SLAB=of(880,6.0,1282),
	POLISHED_BLACKSTONE=of(881,6.0,1285),
	POLISHED_BLACKSTONE_BRICKS=of(882,6.0,1289),
	CRACKED_POLISHED_BLACKSTONE_BRICKS=of(883,6.0,1292),
	CHISELED_POLISHED_BLACKSTONE=of(884,6.0,1288),
	POLISHED_BLACKSTONE_BRICK_SLAB=of(885,6.0,1290),
	POLISHED_BLACKSTONE_BRICK_STAIRS=of(886,6.0,1291),
	POLISHED_BLACKSTONE_BRICK_WALL=of(887,6.0,437),
	GILDED_BLACKSTONE=of(888,6.0,1284),
	POLISHED_BLACKSTONE_STAIRS=of(889,6.0,1287),
	POLISHED_BLACKSTONE_SLAB=of(890,6.0,1286),
	POLISHED_BLACKSTONE_PRESSURE_PLATE=of(891,0.5,720),
	POLISHED_BLACKSTONE_BUTTON=of(892,0.5,706),
	POLISHED_BLACKSTONE_WALL=of(893,6.0,436),
	CHISELED_NETHER_BRICKS=of(894,6.0,390),
	CRACKED_NETHER_BRICKS=of(895,6.0,389),
	QUARTZ_BRICKS=of(896,0.8,447),
	CANDLE=of(897,0.1,1294),
	WHITE_CANDLE=of(898,0.1,1295),
	ORANGE_CANDLE=of(899,0.1,1296),
	MAGENTA_CANDLE=of(900,0.1,1297),
	LIGHT_BLUE_CANDLE=of(901,0.1,1298),
	YELLOW_CANDLE=of(902,0.1,1299),
	LIME_CANDLE=of(903,0.1,1300),
	PINK_CANDLE=of(904,0.1,1301),
	GRAY_CANDLE=of(905,0.1,1302),
	LIGHT_GRAY_CANDLE=of(906,0.1,1303),
	CYAN_CANDLE=of(907,0.1,1304),
	PURPLE_CANDLE=of(908,0.1,1305),
	BLUE_CANDLE=of(909,0.1,1306),
	BROWN_CANDLE=of(910,0.1,1307),
	GREEN_CANDLE=of(911,0.1,1308),
	RED_CANDLE=of(912,0.1,1309),
	BLACK_CANDLE=of(913,0.1,1310),
	CANDLE_CAKE=of(914,0.5,1294),
	WHITE_CANDLE_CAKE=of(915,0.5,1295),
	ORANGE_CANDLE_CAKE=of(916,0.5,1296),
	MAGENTA_CANDLE_CAKE=of(917,0.5,1297),
	LIGHT_BLUE_CANDLE_CAKE=of(918,0.5,1298),
	YELLOW_CANDLE_CAKE=of(919,0.5,1299),
	LIME_CANDLE_CAKE=of(920,0.5,1300),
	PINK_CANDLE_CAKE=of(921,0.5,1301),
	GRAY_CANDLE_CAKE=of(922,0.5,1302),
	LIGHT_GRAY_CANDLE_CAKE=of(923,0.5,1303),
	CYAN_CANDLE_CAKE=of(924,0.5,1304),
	PURPLE_CANDLE_CAKE=of(925,0.5,1305),
	BLUE_CANDLE_CAKE=of(926,0.5,1306),
	BROWN_CANDLE_CAKE=of(927,0.5,1307),
	GREEN_CANDLE_CAKE=of(928,0.5,1308),
	RED_CANDLE_CAKE=of(929,0.5,1309),
	BLACK_CANDLE_CAKE=of(930,0.5,1310),
	AMETHYST_BLOCK=of(931,1.5,88),
	BUDDING_AMETHYST=of(932,1.5),
	AMETHYST_CLUSTER=of(933,1.5,840),
	LARGE_AMETHYST_BUD=of(934,1.5),
	MEDIUM_AMETHYST_BUD=of(935,1.5),
	SMALL_AMETHYST_BUD=of(936,1.5),
	TUFF=of(937,6.0,12),
	TUFF_SLAB=of(938,6.0,13),
	TUFF_STAIRS=of(939,6.0,14),
	TUFF_WALL=of(940,6.0,15),
	POLISHED_TUFF=of(941,6.0,17),
	POLISHED_TUFF_SLAB=of(942,6.0,18),
	POLISHED_TUFF_STAIRS=of(943,6.0,19),
	POLISHED_TUFF_WALL=of(944,6.0,20),
	CHISELED_TUFF=of(945,6.0,16),
	TUFF_BRICKS=of(946,6.0,21),
	TUFF_BRICK_SLAB=of(947,6.0,22),
	TUFF_BRICK_STAIRS=of(948,6.0,23),
	TUFF_BRICK_WALL=of(949,6.0,24),
	CHISELED_TUFF_BRICKS=of(950,6.0,25),
	CALCITE=of(951,0.75,11),
	TINTED_GLASS=of(952,0.3,196),
	POWDER_SNOW=of(953,0.25),
	SCULK_SENSOR=of(954,1.5),
	CALIBRATED_SCULK_SENSOR=of(955,1.5),
	SCULK=of(956,0.2),
	SCULK_VEIN=of(957,0.2),
	SCULK_CATALYST=of(958,3.0),
	SCULK_SHRIEKER=of(959,3.0),
	COPPER_BLOCK=of(960,6.0,91),
	EXPOSED_COPPER=of(961,6.0,95),
	WEATHERED_COPPER=of(962,6.0,96),
	OXIDIZED_COPPER=of(963,6.0,97),
	COPPER_ORE=of(964,3.0,843),
	DEEPSLATE_COPPER_ORE=of(965,3.0,843),
	OXIDIZED_CUT_COPPER=of(966,6.0,105),
	WEATHERED_CUT_COPPER=of(967,6.0,104),
	EXPOSED_CUT_COPPER=of(968,6.0,103),
	CUT_COPPER=of(969,6.0,102),
	OXIDIZED_CHISELED_COPPER=of(970,6.0,101),
	WEATHERED_CHISELED_COPPER=of(971,6.0,100),
	EXPOSED_CHISELED_COPPER=of(972,6.0,99),
	CHISELED_COPPER=of(973,6.0,98),
	WAXED_OXIDIZED_CHISELED_COPPER=of(974,6.0,121),
	WAXED_WEATHERED_CHISELED_COPPER=of(975,6.0,120),
	WAXED_EXPOSED_CHISELED_COPPER=of(976,6.0,119),
	WAXED_CHISELED_COPPER=of(977,6.0,118),
	OXIDIZED_CUT_COPPER_STAIRS=of(978,6.0,109),
	WEATHERED_CUT_COPPER_STAIRS=of(979,6.0,108),
	EXPOSED_CUT_COPPER_STAIRS=of(980,6.0,107),
	CUT_COPPER_STAIRS=of(981,6.0,106),
	OXIDIZED_CUT_COPPER_SLAB=of(982,6.0,113),
	WEATHERED_CUT_COPPER_SLAB=of(983,6.0,112),
	EXPOSED_CUT_COPPER_SLAB=of(984,6.0,111),
	CUT_COPPER_SLAB=of(985,6.0,110),
	WAXED_COPPER_BLOCK=of(986,6.0,114),
	WAXED_WEATHERED_COPPER=of(987,6.0,116),
	WAXED_EXPOSED_COPPER=of(988,6.0,115),
	WAXED_OXIDIZED_COPPER=of(989,6.0,117),
	WAXED_OXIDIZED_CUT_COPPER=of(990,6.0,125),
	WAXED_WEATHERED_CUT_COPPER=of(991,6.0,124),
	WAXED_EXPOSED_CUT_COPPER=of(992,6.0,123),
	WAXED_CUT_COPPER=of(993,6.0,122),
	WAXED_OXIDIZED_CUT_COPPER_STAIRS=of(994,6.0,129),
	WAXED_WEATHERED_CUT_COPPER_STAIRS=of(995,6.0,128),
	WAXED_EXPOSED_CUT_COPPER_STAIRS=of(996,6.0,127),
	WAXED_CUT_COPPER_STAIRS=of(997,6.0,126),
	WAXED_OXIDIZED_CUT_COPPER_SLAB=of(998,6.0,133),
	WAXED_WEATHERED_CUT_COPPER_SLAB=of(999,6.0,132),
	WAXED_EXPOSED_CUT_COPPER_SLAB=of(1000,6.0,131),
	WAXED_CUT_COPPER_SLAB=of(1001,6.0,130),
	COPPER_DOOR=of(1002,6.0,748),
	EXPOSED_COPPER_DOOR=of(1003,6.0,749),
	OXIDIZED_COPPER_DOOR=of(1004,6.0,751),
	WEATHERED_COPPER_DOOR=of(1005,6.0,750),
	WAXED_COPPER_DOOR=of(1006,6.0,752),
	WAXED_EXPOSED_COPPER_DOOR=of(1007,6.0,753),
	WAXED_OXIDIZED_COPPER_DOOR=of(1008,6.0,755),
	WAXED_WEATHERED_COPPER_DOOR=of(1009,6.0,754),
	COPPER_TRAPDOOR=of(1010,6.0,769),
	EXPOSED_COPPER_TRAPDOOR=of(1011,6.0,770),
	OXIDIZED_COPPER_TRAPDOOR=of(1012,6.0,772),
	WEATHERED_COPPER_TRAPDOOR=of(1013,6.0,771),
	WAXED_COPPER_TRAPDOOR=of(1014,6.0,773),
	WAXED_EXPOSED_COPPER_TRAPDOOR=of(1015,6.0,774),
	WAXED_OXIDIZED_COPPER_TRAPDOOR=of(1016,6.0,776),
	WAXED_WEATHERED_COPPER_TRAPDOOR=of(1017,6.0,775),
	COPPER_GRATE=of(1018,6.0,1364),
	EXPOSED_COPPER_GRATE=of(1019,6.0,1365),
	WEATHERED_COPPER_GRATE=of(1020,6.0,1366),
	OXIDIZED_COPPER_GRATE=of(1021,6.0,1367),
	WAXED_COPPER_GRATE=of(1022,6.0,1368),
	WAXED_EXPOSED_COPPER_GRATE=of(1023,6.0,1369),
	WAXED_WEATHERED_COPPER_GRATE=of(1024,6.0,1370),
	WAXED_OXIDIZED_COPPER_GRATE=of(1025,6.0,1371),
	COPPER_BULB=of(1026,6.0,1372),
	EXPOSED_COPPER_BULB=of(1027,6.0,1373),
	WEATHERED_COPPER_BULB=of(1028,6.0,1374),
	OXIDIZED_COPPER_BULB=of(1029,6.0,1375),
	WAXED_COPPER_BULB=of(1030,6.0,1376),
	WAXED_EXPOSED_COPPER_BULB=of(1031,6.0,1377),
	WAXED_WEATHERED_COPPER_BULB=of(1032,6.0,1378),
	WAXED_OXIDIZED_COPPER_BULB=of(1033,6.0,1379),
	LIGHTNING_ROD=of(1034,6.0,696),
	POINTED_DRIPSTONE=of(1035,3.0,1315),
	DRIPSTONE_BLOCK=of(1036,1.0,26),
	CAVE_VINES=of(1037,0.0),
	CAVE_VINES_PLANT=of(1038,0.0),
	SPORE_BLOSSOM=of(1039,0.0,242),
	AZALEA=of(1040,0.0,204),
	FLOWERING_AZALEA=of(1041,0.0,205),
	MOSS_CARPET=of(1042,0.1,255),
	PINK_PETALS=of(1043,0.0,254),
	MOSS_BLOCK=of(1044,0.1,256),
	BIG_DRIPLEAF=of(1045,0.1,261),
	BIG_DRIPLEAF_STEM=of(1046,0.1,261),
	SMALL_DRIPLEAF=of(1047,0.0),
	HANGING_ROOTS=of(1048,0.0),
	ROOTED_DIRT=of(1049,0.5,31),
	MUD=of(1050,0.5,32),
	DEEPSLATE=of(1051,6.0,9),
	COBBLED_DEEPSLATE=of(1052,6.0,9),
	COBBLED_DEEPSLATE_STAIRS=of(1053,6.0,658),
	COBBLED_DEEPSLATE_SLAB=of(1054,6.0,675),
	COBBLED_DEEPSLATE_WALL=of(1055,6.0,438),
	POLISHED_DEEPSLATE=of(1056,6.0,10),
	POLISHED_DEEPSLATE_STAIRS=of(1057,6.0,659),
	POLISHED_DEEPSLATE_SLAB=of(1058,6.0,676),
	POLISHED_DEEPSLATE_WALL=of(1059,6.0,439),
	DEEPSLATE_TILES=of(1060,6.0,363),
	DEEPSLATE_TILE_STAIRS=of(1061,6.0,661),
	DEEPSLATE_TILE_SLAB=of(1062,6.0,678),
	DEEPSLATE_TILE_WALL=of(1063,6.0,441),
	DEEPSLATE_BRICKS=of(1064,6.0,361),
	DEEPSLATE_BRICK_STAIRS=of(1065,6.0,660),
	DEEPSLATE_BRICK_SLAB=of(1066,6.0,677),
	DEEPSLATE_BRICK_WALL=of(1067,6.0,440),
	CHISELED_DEEPSLATE=of(1068,6.0,365),
	CRACKED_DEEPSLATE_BRICKS=of(1069,6.0,362),
	CRACKED_DEEPSLATE_TILES=of(1070,6.0,364),
	INFESTED_DEEPSLATE=of(1071,0.75),
	SMOOTH_BASALT=of(1072,4.2,345),
	RAW_IRON_BLOCK=of(1073,6.0,84),
	RAW_COPPER_BLOCK=of(1074,6.0,85),
	RAW_GOLD_BLOCK=of(1075,6.0,86),
	POTTED_AZALEA_BUSH=of(1076,0.0,new char[] {1147,204}),
	POTTED_FLOWERING_AZALEA_BUSH=of(1077,0.0,new char[] {1147,205}),
	OCHRE_FROGLIGHT=of(1078,0.3,1316),
	VERDANT_FROGLIGHT=of(1079,0.3,1317),
	PEARLESCENT_FROGLIGHT=of(1080,0.3,1318),
	FROGSPAWN=of(1081,0.0),
	REINFORCED_DEEPSLATE=of(1082,1200.0),
	DECORATED_POT=of(1083,0.0,301),
	CRAFTER=of(1084,3.5,1030),
	TRIAL_SPAWNER=of(1085,50.0),
	VAULT=of(1086,50.0),
	HEAVY_CORE=of(1087,1200.0,87),
	PALE_MOSS_BLOCK=of(1088,0.1,259),
	PALE_MOSS_CARPET=of(1089,0.1,257),
	PALE_HANGING_MOSS=of(1090,0.0),
	OPEN_EYEBLOSSOM=of(1091,0.0,226),
	CLOSED_EYEBLOSSOM=of(1092,0.0,227),
	POTTED_OPEN_EYEBLOSSOM=of(1093,0.0,new char[] {1147,226}),
	POTTED_CLOSED_EYEBLOSSOM=of(1094,0.0,new char[] {1147,227});
}