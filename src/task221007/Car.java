package task221007;

public class Car {
    protected Integer numberWheels = 4;

    public void move() {
        System.out.println("Car move");
    }

    public static class CitroenCar extends Car {

    }

    public static class Citroen4C extends CitroenCar {
        public void move() {
            System.out.println("4C move");
        }

    }

    public static void main(String[] args) {
        Citroen4C citroen4C = new Citroen4C();
        citroen4C.move();
    }
}
