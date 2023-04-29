package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.Clothes.ClothesType;
import com.codecool.wardrobe.clothing.LowerClothes;
import com.codecool.wardrobe.clothing.UpperClothes;

import java.util.Optional;
import java.util.UUID;

public class PantHanger implements Hanger<Clothes> {

    private Clothes upperClothes;
    private Clothes lowerClothes;

    @Override
    public Optional<Clothes> takeOff() {
        if(upperClothes != null) {
            return takeOffUpperClothes();
        } else {
            return takeOfLowerClothes();
        }
    }

    private Optional<Clothes> takeOffUpperClothes() {
        Optional<Clothes> result = Optional.ofNullable(upperClothes);
        upperClothes = null;
        return result;
    }

    private Optional<Clothes> takeOfLowerClothes() {
        Optional<Clothes> result = Optional.ofNullable(lowerClothes);
        lowerClothes = null;
        return result;
    }

    @Override
    public Optional<Clothes> takeOff(UUID id) {
        if (upperClothes != null && upperClothes.getId().equals(id)) {
            return takeOffUpperClothes();
        } else if (lowerClothes != null && lowerClothes.getId().equals(id)) {
            return takeOfLowerClothes();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void put(Clothes item) {
        if (item instanceof UpperClothes) {
            if ()
        }
    }

    @Override
    public boolean hasSlotFor(ClothesType type) {
        if (type.equals(ClothesType.TROUSERS) || type.equals(ClothesType.SKIRT)) {
            return lowerClothes == null;
        } else if (type.equals(ClothesType.BLOUSE) || type.equals(ClothesType.SHIRT)) {
            return upperClothes == null;
        }
    }
}
