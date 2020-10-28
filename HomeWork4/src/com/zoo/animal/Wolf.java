package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Wolf extends Canines implements AniDo {
    boolean flockWater;
    String forest;
    int volume;

    public Wolf(String name, String color, String species, String size, String favoriteFood, boolean flockWater, String forest, int volume) {
        super(name, color, species, size, favoriteFood);
        this.flockWater = flockWater;
        this.forest = forest;
        this.volume = volume;
    }

    public Wolf(){

    }

    public boolean isFlockWater() {
        return flockWater;
    }

    public void setFlockWater(boolean flockWater) {
        this.flockWater = flockWater;
    }

    public String getForest() {
        return forest;
    }

    public void setForest(String forest) {
        this.forest = forest;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void say(){
        System.out.println("У-у-у");
    }

    @Override
    public void doing(){
        System.out.println("Охочусь");
    }

    @Override
    public void movable(int step) throws NegativeValueException {
        if(step < 0) {
            throw new NegativeValueException("Передано отрицательное число");
        }
        System.out.println("Преследую добычу уже "+ step + "шага");
    }

    public void sweetMoon(){
        System.out.println("У".repeat(volume));
    }
}
