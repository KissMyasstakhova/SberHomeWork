package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Canines extends Animal implements AniDo {
    String species;
    String size;
    String favoriteFood;

    public Canines(String name, String color, String species, String size, String favoriteFood) {
        super(name, color);
        this.species = species;
        this.size = size;
        this.favoriteFood = favoriteFood;
    }

    public Canines() {
        super();
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void say(){
        System.out.println("Я из семества псовых");
    }

    @Override
    public void doing(){
        System.out.println("Занимаюсь своими псовыми делами");
    }

    @Override
    public void movable(int step) throws NegativeValueException {
        if(step < 0) {
            throw new NegativeValueException("Передано отрицательное число");
        }
        System.out.println("Топ ".repeat(step));
    }


}
