package app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void isPresent() {
        boolean test = Service.isPresent("Otto");
        assertTrue(test);
        assertFalse(Service.isPresent(null));
        assertTrue(Service.isPresent("Max"));
        assertTrue(Service.isPresent(" Max "));
        assertFalse(Service.isPresent("otto"));
        boolean test2 = Service.isPresent("");
        assertFalse(test2);

    }

    @Test
    @Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
    void isPresentTime(){
        Service.isPresent("Max");
    }
}