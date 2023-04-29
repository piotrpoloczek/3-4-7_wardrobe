package com.codecool.wardrobe.clothing;

import com.codecool.wardrobe.clothing.Clothes.ClothesType;

public class LowerClothes extends Clothes {
    public LowerClothes(String brandName, ClothesType type) {
        super(brandName, type);
        if (this.type != ClothesType.SKIRT && this.type != ClothesType.TROUSERS) {
            throw new IllegalArgumentException("Not supported clothes type.");
        }
    }


}
