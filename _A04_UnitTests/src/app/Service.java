package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service {

    /**
     *
     * @param a Zahl1
     * @param b Zahl2
     * @return Summe
     */
    public static int sum(int a, int b){

        return a + b;
    }

    /**
     *
     * @param n Zahl
     * @return true, wenn Zahl gerade ist
     */
    public static boolean isEven(int n){

        return n % 2 == 0;
    }


    /**
     *
     * @param text - ein Text
     * @return den Text umgedreht (rückwerts)  z.B. Hallo -> ollaH
     */
    public static String reverse(String text){

        return new StringBuilder(text).reverse().toString();
    }

    /**
     *
     * @param price
     * @param percent
     * @return berechneter Rabatt
     */
    public static double applyDiscount(double price, int percent){
        return 0;
    }

    /**
     * new Random()
     * @param n: Anzahl der zufälligen Zahlen
     * @return Liste mit n Zufallszahlen z.B randomNumbers(20) ArrayListe mit 20 Zufallszahlen
     */
    public static List<Integer> randomNumbers(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be >=0");
        }
        var numbers = new ArrayList<Integer>();
        var rnd = new Random();

        for (int i = 0; i < n; i++) {

            numbers.add(rnd.nextInt());
        }
        return numbers;
    }
    


}
