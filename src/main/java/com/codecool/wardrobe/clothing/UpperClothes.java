package com.codecool.wardrobe.clothing;

public class UpperClothes extends Clothes {
    public UpperClothes(String brandName, ClothesType type) {
        super(brandName, type);
        if (this.type != ClothesType.BLOUSE && this.type != ClothesType.SHIRT) {
            throw new IllegalArgumentException("Not supported clothes type.");
        }
    }
}
