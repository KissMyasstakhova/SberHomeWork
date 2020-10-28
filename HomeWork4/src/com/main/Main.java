package com.main;

import com.zoo.animal.Animal;
import com.zoo.animal.Cat;
import com.zoo.animal.Dog;
import com.zoo.animal.Pig;
import com.zoo.exception.AlreadyAddExceptoin;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.OutOfAviaryExceptoin;
import java.util.ArrayList;

public class Main {
     public ArrayList<Animal> aviary = new ArrayList<>();
     private int vacancy = 3;
     public static void main(String[] args)  {

         Pig pig1 = new Pig("Спайк", "розовый", "микропиг", true, true);
         Cat cat1 = new Cat("Мурзик", "рыжий", true, "зеленый");
         Cat cat2 = new Cat();
         cat2.setName("Павлик");
         Dog dog1 = new Dog("Бобик", "Белый", "Собака", "крупная порода", "куриные грудки","Лайка", "квартира", "розовый", false );
         System.out.println(dog1.getName());
         dog1.say();
         dog1.doing();
         dog1.springCome();

    /*     try {
             dog1.movable(-2);
         } catch (NegativeValueException e) {
             e.printStackTrace();
         }

*/
    Main main = new Main();
         try {
             main.addAnimalToAviary(pig1);
             main.addAnimalToAviary(cat1);
             main.addAnimalToAviary(cat2);
             main.addAnimalToAviary(dog1);

         } catch (OutOfAviaryExceptoin outOfAviaryExceptoin) {
             outOfAviaryExceptoin.printStackTrace();
         } catch (AlreadyAddExceptoin alreadyAddExceptoin) {
             alreadyAddExceptoin.printStackTrace();
         }
         finally {
             for ( var i : main.aviary){
                 System.out.println(i.getName());
             }
         }


     }
     public void addAnimalToAviary (Animal animal) throws OutOfAviaryExceptoin, AlreadyAddExceptoin{
      if(aviary.contains(animal)){
          throw new AlreadyAddExceptoin("Данное животное уже было добавлено в вольер");
      }
      if(aviary.size() == vacancy){
          throw new OutOfAviaryExceptoin("Вольер заполнен");
      }
         aviary.add(animal);
     }
}
