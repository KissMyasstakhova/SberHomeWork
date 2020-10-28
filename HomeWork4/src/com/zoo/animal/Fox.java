package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Fox extends Canines implements AniDo {
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

    public void say(){
        System.out.println("Скрип");
    }

    @Override
    public void doing(){
        System.out.println("Делаю хитрости");
    }

    @Override
    public void movable(int step) throws NegativeValueException {
        if(step < 0) {
            throw new NegativeValueException("Передано отрицательное число");
        }
        System.out.println("Бегу со скрипом на"+ step);
    }
}
