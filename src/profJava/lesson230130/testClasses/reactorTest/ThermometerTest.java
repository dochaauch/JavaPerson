package profJava.lesson230130.testClasses.reactorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import profJava.lesson230130.mockClasses.reactor.Sensor;
import profJava.lesson230130.mockClasses.reactor.Thermometer;

@ExtendWith(MockitoExtension.class)
public class ThermometerTest {

    @InjectMocks
    Thermometer thermometer;
    @Mock
    Sensor sensor;

    @Test
    void testWorkingSensor() {
        thermometer.setTemperature(250);
        Mockito.when(sensor.isBlocked())
                .thenReturn(false);
        Assertions.assertEquals(sensor, thermometer.getSensor());
        Assertions.assertEquals(250, thermometer.getTemperature(), 0.1);
        Mockito.verify(sensor, Mockito.times(1)).isBlocked();
    }

    @Test
    void testBlockedSensor() {
        thermometer.setTemperature(250);
        Mockito.when(sensor.isBlocked())
                .thenReturn(true);
        Assertions.assertEquals(sensor, thermometer.getSensor());
        Assertions.assertThrows(RuntimeException.class, () -> thermometer.getTemperature());
        Mockito.verify(sensor, Mockito.times(1)).isBlocked();
    }
}
