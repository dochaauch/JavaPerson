package profJava.lesson230130.testClasses.reactorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import profJava.lesson230130.mockClasses.reactor.ReactorCoolingSystem;
import profJava.lesson230130.mockClasses.reactor.Thermometer;

@ExtendWith(MockitoExtension.class)
public class ReactorCoolingSystemTest {

    @InjectMocks
    ReactorCoolingSystem reactorCoolingSystem;

    @Mock
    Thermometer thermometer;

    @Test
    void testReactorCoolingSystemON() {
        Mockito.when(thermometer.getTemperature())
                .thenReturn(250D);
        reactorCoolingSystem.setTemperatureThreshold(240);
        reactorCoolingSystem.checkReactorCoolingSystem();
        Assertions.assertTrue(reactorCoolingSystem.isOn());
        Mockito.verify(thermometer, Mockito.times(1)).getTemperature();
    }

    @Test
    void testReactorCoolingSystemOFF() {
        Mockito.when(thermometer.getTemperature())
                .thenReturn(220D);
        reactorCoolingSystem.setTemperatureThreshold(240);
        reactorCoolingSystem.checkReactorCoolingSystem();
        Assertions.assertFalse(reactorCoolingSystem.isOn());
        Mockito.verify(thermometer, Mockito.times(1)).getTemperature();
    }
}
