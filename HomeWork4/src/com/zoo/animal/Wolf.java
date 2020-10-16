package com.zoo.animal;

public class Wolf extends Canines {
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

    public  static void say(){
        System.out.println("У-у-у");
    }

    public static void doing(){
        System.out.println("Охочусь");
    }

    public void sweetMoom(){
        System.out.println("У".repeat(volume));
    }
}
