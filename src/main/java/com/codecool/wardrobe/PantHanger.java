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
        Optional
    }

    @Override
    public Optional<Clothes> takeOff(UUID id) {
        if (clothes != null && clothes.getId().equals(id)) {
            return takeOff();
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
        return clothes == null;
    }
}
