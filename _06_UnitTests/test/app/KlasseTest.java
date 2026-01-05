package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class KlasseTest {

    private Klasse klasse;


    @BeforeEach
    void setUp() {
        klasse = new Klasse();
    }

    @Test
    void max() {
        int result = klasse.max(2,3);

        assertEquals(3,result);
        assertEquals(-1,klasse.max(-1,-3));
        assertNotEquals(2,result);
    }

    @Test
    void testMax() {
       int result =  klasse.max(23,1,3,-5,0,24,1);//int...==Array
       assertEquals(24,result);
        int result2 =  klasse.max(-23,-1,-3,-5,0,-24,-1);//int...==Array
        assertEquals(0,result2);

        klasse.max(new int[]{});


    }

    @Test
    void testMaxArrayException(){
        // Test von Exception die von einer Methode geworfen werden
        assertThrows(IllegalArgumentException.class, () ->  {
            klasse.max(null);
            klasse.max(new int[]{});
            klasse.max();
        } );
    }

    @Test
    void createList() {
       List<String> arraylist=  klasse.createList("a");
       assertNotNull(arraylist);
       assertInstanceOf(ArrayList.class, arraylist);

       List<String> vector=  klasse.createList("v");
       assertNotNull(vector);
       assertInstanceOf(Vector.class, vector);

       List<Integer> nullList = klasse.createList("x");
       assertNull(nullList);
    }
}