package com.zoo.animal;

public class Pig extends Animal {
    String species;
    boolean curledTail;
    boolean cleannes;

    public Pig(){
        super();
    }

    public Pig(String name, String color, String species, boolean curledTail, boolean cleannes){
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

    public static void say(){
        System.out.print("Хрю");
    }

    public void doing(){
        System.out.print("Купаюсь в грязи");
        cleannes = false;
    }

    public void washPig(){
        cleannes = true;
    }
}
