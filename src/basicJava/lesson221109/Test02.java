package basicJava.lesson221109;

class ParentCar {
    void drive(){

    }
}

class SportCar extends ParentCar implements Flyable, Serializable{

    @Override
    public void fly() {

    }

    @Override
    public void serial() {

    }
}

interface Flyable {
    void fly();
}

interface Serializable {
    void serial();
}


class Main{
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        sportCar.drive();
    }
}