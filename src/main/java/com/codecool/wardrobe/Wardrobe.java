package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;

import java.util.*;

/**
 * The task of the class is to model a wardrobe.
 */
public class Wardrobe {

    private final int limit;
    private final List<Hanger> hangers;

    public Wardrobe(int limit) {
        if (limit > 120) {
            throw new IllegalArgumentException("Maximum limit is 120.");
        }
        this.limit = limit;
        this.hangers = new ArrayList<>();
    }

    public int getLimit() {
        return this.limit;
    }

    public int count() {
        return hangers.size();
    }

    public void put(Hanger<? extends Clothes> hanger) {
        if (hangers.size() >= limit) {
            throw new IllegalStateException("The wardrobe currently is full.");
        }
        hangers.add(hanger);
    }

    public Hanger<? extends Clothes> getHanger(Clothes.ClothesType clothesType) {
        for (Hanger hanger : hangers) {
            if (hanger.hasSlotFor(clothesType)) {
                return hanger;
            }
        }
        throw new NoSuchElementException("No empty hangers for your clothes");
    }

    public Clothes getClothes(UUID clothesId) {
        for (Hanger hanger : hangers) {
            Optional<Clothes> result = hanger.takeOff(clothesId);
            if (result.isPresent()){
                return result.get();
            }
        }
        throw new NoSuchElementException("Clothes not found.");
    }

    // The main method with this declaration is the entry point of Java applications.
    public static void main(String[] args) {
        // Create an instance of our class with the test data.
        System.out.println("Hello WardROBO");
    }
}
