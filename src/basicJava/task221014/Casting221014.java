package basicJava.task221014;

public class Casting221014 {
    private static class Animal {
        public void voice() {
            System.out.println("Кря");
        }
    }

    private static class Cat extends Animal{
        public void voice() {
            System.out.println("Мяу");
        }

        public void catchMouse() {
            System.out.println("Поймать мышку");
        }
    }

    private static class Dog extends Animal{
        public void voice() {
            System.out.println("Гав");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Cat(), new Dog()};
        for (Animal animal: animals) {
            animal.voice();

            if(animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.catchMouse();
            }
        }


        Cat[] cats = {new Cat(), new Cat()};
        for (Cat cat: cats) {
            cat.catchMouse();
        }
    }
}
