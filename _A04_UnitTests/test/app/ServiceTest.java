package app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @ParameterizedTest(name = "sum({0}, {1}) = {2}")
    @CsvSource({
            "1, 2, 3",
            "0, 0, 0",
            "-1, 1, 0",
            "-5, -7, -12",
            "100, 200, 300"
    })
    void sum(int a, int b, int expected) {
       assertEquals(expected, Service.sum(a,b));
    }
    @Test
    void sumMax(){
        //Exception
    }


    @Test
    void isEven_returnsTrue() {
        assertTrue(Service.isEven(0));
        assertTrue(Service.isEven(2));
        assertTrue(Service.isEven(-4));

    }
    @Test
    void isEven_returnsFalse() {
        assertFalse(Service.isEven(1));
        assertFalse(Service.isEven(3));
        assertFalse(Service.isEven(-5));

    }

    @Test
    void reverse() {
        assertEquals("olleH", Service.reverse("Hello"));
        assertEquals("b a", Service.reverse("a b"));
    }

    @Test
    void applyDiscount() {
    }

    @Test
    void randomNumbers_Size() {
        List<Integer> nums = Service.randomNumbers(20);
        assertNotNull(nums);
        assertEquals(20, nums.size());

    }
    @Test
    void randomNumbers_returnEmptyList() {
        List<Integer> nums = Service.randomNumbers(0);
        assertNotNull(nums);
        assertTrue(nums.isEmpty());

    }

    @Test
    void randomNumbers_negativeCount_Exception(){
        assertThrows(IllegalArgumentException.class,() -> {
            Service.randomNumbers(-1);
        } );
    }

    @Test
    void randomNumbers_MaxTime() {
        int n = 10_000_000;
        assertTimeout(Duration.ofMillis(1000),() ->{
            List<Integer> nums = Service.randomNumbers(n);
            assertEquals(n,nums.size());
        } );





    }
}