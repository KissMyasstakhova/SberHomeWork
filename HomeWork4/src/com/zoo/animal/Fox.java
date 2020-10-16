package com.zoo.animal;

public class Fox extends Canines{
    int percentOfCunning;

    public Fox(String name, String color, String species, String size, String favoriteFood, int percentOfCunning) {
        super(name, color, species, size, favoriteFood);
        this.percentOfCunning = percentOfCunning;
    }

    public Fox() {
        super();
    }

    public int getPercentOfCunning() {
        return percentOfCunning;
    }

    public void setPercentOfCunning(int percentOfCunning) {
        this.percentOfCunning = percentOfCunning;
    }

    public static void say(){
        System.out.println("Крик");
    }

    public static void doing(){
        System.out.println("Делаю хитрости");
    }
}
