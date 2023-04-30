package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.UpperClothes;

import java.util.Optional;
import java.util.UUID;

public class ShirtHanger implements Hanger<UpperClothes> {

    private UpperClothes upperClothes;

    @Override
    public Optional<UpperClothes> takeOff() {
        Optional<UpperClothes> result = Optional.ofNullable(this.upperClothes);
        this.upperClothes = null;
        return result;
    }

    @Override
    public Optional<UpperClothes> takeOff(UUID id) {
        if (
                this.upperClothes != null &&
                this.upperClothes.getId().equals(id)
        ) {
            return takeOff();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void put(UpperClothes item) {
        if (this.upperClothes != null) {
            throw new IllegalStateException(
                    "ShirtHanger can store only one clothing item."
            );
        }
        this.upperClothes = item;
    }

    @Override
    public boolean hasSlotFor(Clothes.ClothesType type) {
        if (type.equals(Clothes.ClothesType.BLOUSE) || type.equals(Clothes.ClothesType.SHIRT)) {
            return upperClothes == null;
        } else {
            return false;
        }
    }
}
