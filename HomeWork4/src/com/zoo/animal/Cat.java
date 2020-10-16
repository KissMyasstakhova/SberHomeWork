package com.zoo.animal;

public class Cat extends Animal {
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

    public static void say(){
        System.out.print("Мяу");
    }

    public static void doing(){
        System.out.print("Сплю");
    }
}
