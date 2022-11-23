package basicJava.lesson221010;

public class Fridge {
    private final String name = "INDESIT";
    private final byte volume = 70;

    @Override
    public String toString() {
        return "Fridge{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
