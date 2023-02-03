package profJava.lesson230130.mockClasses.reactor;


import lombok.Setter;

public class Sensor {
    @Setter
    private boolean blocked;

    public boolean isBlocked() {
        return blocked;
    }
}