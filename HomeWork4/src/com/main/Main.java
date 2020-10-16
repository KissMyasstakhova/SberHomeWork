package com.main;

import com.zoo.animal.Cat;
import com.zoo.animal.Dog;
import com.zoo.animal.Pig;

public class Main {
     public static void main(String[] args) {
         Pig pig1 = new Pig("Спайк", "розовый", "микропиг", true, true);
         Cat cat1 = new Cat("Мурзик", "рыжий", true, "зеленый");
         Cat cat2 = new Cat();
         cat2.setName("Павлик");
         Dog dog1 = new Dog("Бобик", "Белый", "Собака", "крупная порода", "куриные грудки","Лайка", "квартира", "розовый", false );
         System.out.println(dog1.getName());
         dog1.say();
         dog1.doing();
         dog1.springCome();


    }
}
