package com.codecool.wardrobe.clothing;

import java.util.UUID;

public class Clothes {
    private UUID id;
    private String brandName;
    protected ClothesType type;

    public Clothes(String brandName, ClothesType type) {
        this.id = UUID.randomUUID();
        this.brandName = brandName;
        this.type = type;
    }

    public Clothes(String brandName) {
        this.id = UUID.randomUUID();
        this.brandName = brandName;
    }

    public UUID getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public ClothesType getType() {
        return this.type;
    }

    public enum ClothesType {
        SHIRT,
        BLOUSE,
        TROUSERS,
        SKIRT
    }
}
