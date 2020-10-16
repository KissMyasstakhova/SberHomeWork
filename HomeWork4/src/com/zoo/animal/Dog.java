package com.zoo.animal;

public class Dog extends Canines {
    String species;
    String home;
    String colorOfNose;
    boolean molt;

    public Dog(String name, String color, String species, String size, String favoriteFood, String species1, String home, String colorOfNose, boolean molt) {
        super(name, color, species, size, favoriteFood);
        this.species = species1;
        this.home = home;
        this.colorOfNose = colorOfNose;
        this.molt = molt;
    }

    public Dog(){

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getColorOfNose() {
        return colorOfNose;
    }

    public void setColorOfNose(String colorOfNose) {
        this.colorOfNose = colorOfNose;
    }

    public boolean isMolt() {
        return molt;
    }

    public void setMolt(boolean molt) {
        this.molt = molt;
    }

    public static void say(){
        System.out.println("Гав!");
    }

    public static void doing(){
        System.out.println("Играю с хвостом");
    }

    public void springCome(){
        molt = true;
        System.out.println("Я начал линять");
    }

    public void winterCome(){
        molt = false;
        System.out.println("Утепляюсь");
    }
}
