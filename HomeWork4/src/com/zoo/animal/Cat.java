package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Cat extends Animal implements AniDo {
    boolean smoothHaired;
    String eyeColor;

    public Cat(){
        super();
    }

    public Cat(String name, String color, boolean smoothHaired, String eyeColor){
        super(name, color);
        this.smoothHaired = smoothHaired;
        this.eyeColor = eyeColor;
    }

    public boolean isSmoothHaired() {
        return smoothHaired;
    }

    public void setSmoothHaired(boolean smoothHaired) {
        this.smoothHaired = smoothHaired;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void say(){
        System.out.print("Мяу");
    }

    @Override
    public void doing(){
        System.out.print("Сплю");
    }

    @Override
    public void movable(int step) throws NegativeValueException{
        if(step < 0) {
            throw new NegativeValueException("Передано отрицательное число");
        }
        System.out.println("Мяу - Топ ".repeat(step));
    }
}
