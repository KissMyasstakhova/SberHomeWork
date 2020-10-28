package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Dog extends Canines implements AniDo {
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

    public void say(){
        System.out.println("Гав!");
    }

    @Override
    public void doing(){
        System.out.println("Играю с хвостом");
    }

    @Override
    public void movable(int step) throws NegativeValueException {
        if(step < 0) {
            throw new NegativeValueException("Передано отрицательное число");
        }
        System.out.println("Бегу за мячиком на "+ step +"шага");
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
