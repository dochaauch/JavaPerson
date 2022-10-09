package Lesson221005.animal;

import java.util.ArrayList;

public class Animal {
}

class Pet extends Animal {

}

class Cat extends Pet {

}

class Dog extends Pet {

}

class Main {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        Animal catA = new Cat();// расширяющее привидение
        Animal dogA = new Dog();
        Animal animal = new Animal();
        Dog dog = (Dog) animal;
        Object object = new Object();
        Cat cat = (Cat) object;

        Animal animalCat = new Cat();
        Dog dog2 =  (Dog) animalCat;
        ArrayList arrayList = new ArrayList<>();
    }
}