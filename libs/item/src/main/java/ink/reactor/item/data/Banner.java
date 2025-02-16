/*
* Autogenerated file. Please don't touch :)
* Class generator: ink.reactor.dataparser.registry.banner.BannerParser (module data-parser)
* Date: Year: 2025. Month: 01. Day: 14. Time: 19:15:27
*/
package ink.reactor.item.data;

import lombok.Getter;

import java.util.Collection;

import ink.reactor.util.collection.CopyOnWriteCollection;

@Getter
public final class Banner {

    public static final Collection<Banner> ALL = new CopyOnWriteCollection<>(43);

    private final String assetId, translationKey;
    private final int id;

    public Banner(int id, String assetId, String translationKey) {
        this.assetId = assetId;
        this.id = id;
        this.translationKey = translationKey;
    }

    private Banner(String assetId, int id, String translationKey) {
        this(id, assetId, translationKey);
        ALL.add(this);
    }

    public static final Banner 
        TRIANGLE_BOTTOM = new Banner("minecraft:triangle_bottom",0,"block.minecraft.banner.triangle_bottom"),
        STRAIGHT_CROSS = new Banner("minecraft:straight_cross",1,"block.minecraft.banner.straight_cross"),
        STRIPE_RIGHT = new Banner("minecraft:stripe_right",2,"block.minecraft.banner.stripe_right"),
        STRIPE_BOTTOM = new Banner("minecraft:stripe_bottom",3,"block.minecraft.banner.stripe_bottom"),
        TRIANGLE_TOP = new Banner("minecraft:triangle_top",4,"block.minecraft.banner.triangle_top"),
        SQUARE_TOP_LEFT = new Banner("minecraft:square_top_left",5,"block.minecraft.banner.square_top_left"),
        GUSTER = new Banner("minecraft:guster",6,"block.minecraft.banner.guster"),
        PIGLIN = new Banner("minecraft:piglin",7,"block.minecraft.banner.piglin"),
        STRIPE_DOWNLEFT = new Banner("minecraft:stripe_downleft",8,"block.minecraft.banner.stripe_downleft"),
        TRIANGLES_TOP = new Banner("minecraft:triangles_top",9,"block.minecraft.banner.triangles_top"),
        SQUARE_BOTTOM_LEFT = new Banner("minecraft:square_bottom_left",10,"block.minecraft.banner.square_bottom_left"),
        TRIANGLES_BOTTOM = new Banner("minecraft:triangles_bottom",11,"block.minecraft.banner.triangles_bottom"),
        SKULL = new Banner("minecraft:skull",12,"block.minecraft.banner.skull"),
        MOJANG = new Banner("minecraft:mojang",13,"block.minecraft.banner.mojang"),
        FLOW = new Banner("minecraft:flow",14,"block.minecraft.banner.flow"),
        STRIPE_LEFT = new Banner("minecraft:stripe_left",15,"block.minecraft.banner.stripe_left"),
        BRICKS = new Banner("minecraft:bricks",16,"block.minecraft.banner.bricks"),
        BORDER = new Banner("minecraft:border",17,"block.minecraft.banner.border"),
        RHOMBUS = new Banner("minecraft:rhombus",18,"block.minecraft.banner.rhombus"),
        HALF_VERTICAL_RIGHT = new Banner("minecraft:half_vertical_right",19,"block.minecraft.banner.half_vertical_right"),
        GRADIENT = new Banner("minecraft:gradient",20,"block.minecraft.banner.gradient"),
        CURLY_BORDER = new Banner("minecraft:curly_border",21,"block.minecraft.banner.curly_border"),
        DIAGONAL_RIGHT = new Banner("minecraft:diagonal_right",22,"block.minecraft.banner.diagonal_right"),
        HALF_VERTICAL = new Banner("minecraft:half_vertical",23,"block.minecraft.banner.half_vertical"),
        CROSS = new Banner("minecraft:cross",24,"block.minecraft.banner.cross"),
        SMALL_STRIPES = new Banner("minecraft:small_stripes",25,"block.minecraft.banner.small_stripes"),
        HALF_HORIZONTAL_BOTTOM = new Banner("minecraft:half_horizontal_bottom",26,"block.minecraft.banner.half_horizontal_bottom"),
        STRIPE_TOP = new Banner("minecraft:stripe_top",27,"block.minecraft.banner.stripe_top"),
        DIAGONAL_UP_LEFT = new Banner("minecraft:diagonal_up_left",28,"block.minecraft.banner.diagonal_up_left"),
        GRADIENT_UP = new Banner("minecraft:gradient_up",29,"block.minecraft.banner.gradient_up"),
        FLOWER = new Banner("minecraft:flower",30,"block.minecraft.banner.flower"),
        STRIPE_DOWNRIGHT = new Banner("minecraft:stripe_downright",31,"block.minecraft.banner.stripe_downright"),
        DIAGONAL_UP_RIGHT = new Banner("minecraft:diagonal_up_right",32,"block.minecraft.banner.diagonal_up_right"),
        GLOBE = new Banner("minecraft:globe",33,"block.minecraft.banner.globe"),
        DIAGONAL_LEFT = new Banner("minecraft:diagonal_left",34,"block.minecraft.banner.diagonal_left"),
        SQUARE_BOTTOM_RIGHT = new Banner("minecraft:square_bottom_right",35,"block.minecraft.banner.square_bottom_right"),
        STRIPE_MIDDLE = new Banner("minecraft:stripe_middle",36,"block.minecraft.banner.stripe_middle"),
        STRIPE_CENTER = new Banner("minecraft:stripe_center",37,"block.minecraft.banner.stripe_center"),
        CIRCLE = new Banner("minecraft:circle",38,"block.minecraft.banner.circle"),
        SQUARE_TOP_RIGHT = new Banner("minecraft:square_top_right",39,"block.minecraft.banner.square_top_right"),
        CREEPER = new Banner("minecraft:creeper",40,"block.minecraft.banner.creeper"),
        BASE = new Banner("minecraft:base",41,"block.minecraft.banner.base"),
        HALF_HORIZONTAL = new Banner("minecraft:half_horizontal",42,"block.minecraft.banner.half_horizontal");

    @Override
    public int hashCode() {
        return id;
    }
}