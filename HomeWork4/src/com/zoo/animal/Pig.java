package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Pig extends Animal implements AniDo {
    String species;
    boolean curledTail;
    boolean cleannes;

    public Pig() {
        super();
    }

    public Pig(String name, String color, String species, boolean curledTail, boolean cleannes) {
        super(name, color);
        this.species = species;
        this.curledTail = curledTail;
        this.cleannes = cleannes;

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isCurledTail() {
        return curledTail;
    }

    public void setCurledTail(boolean curledTail) {
        this.curledTail = curledTail;
    }

    public boolean isCleannes() {
        return cleannes;
    }

    public void setCleannes(boolean cleannes) {
        this.cleannes = cleannes;
    }

    public void say() {
        System.out.print("Хрю");
    }

    @Override
    public void doing() {
        System.out.print("Купаюсь в грязи");
        cleannes = false;
    }

    public void washPig() {
        cleannes = true;
    }

    @Override
    public void movable(int step) throws NegativeValueException {
        if (step < 0) {
            throw new NegativeValueException("Передано отрицательное число");
        }
        System.out.println("Топ ".repeat(step));
    }
}
