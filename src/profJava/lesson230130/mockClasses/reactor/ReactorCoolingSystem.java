package profJava.lesson230130.mockClasses.reactor;

import lombok.Setter;

public class ReactorCoolingSystem {

    @Setter
    private Thermometer thermometer;

    @Setter
    private double temperatureThreshold;
    private boolean on;

    public ReactorCoolingSystem() {
        on = false;
    }

    public void checkReactorCoolingSystem() {
        this.on = (thermometer.getTemperature() >= temperatureThreshold);
    }

    public boolean isOn() {
        return on;
    }
}