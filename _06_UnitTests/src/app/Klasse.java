package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Klasse{

    /**
     *
     * @param a - eine Zahl
     * @param b - eine Zahl
     * @return größere von beiden Zahlen
     */
    public int max(int a, int b){

        return a > b ? a:b;
    }

    /**
     *
     * @param arr - Zahlenfolge oder Array: 3,4,6,8
     * @return größte ermittelte Zahl des Arrays
     * @throws  IllegalArgumentException - null
     */
    public int max(int... arr){ // int[]
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Liste darf nicht null oder leer sein!");
        }

        int max = arr[0];
        for(int n:arr){
            if(n > max){
                max = n;
            }
        }
        return max;
    }

    /**
     *
     * @param s a für Array, v für Vector
     * @return new ArrayList, new Vector or null
     * @param <T> beliebiger Typo
     */
    public <T>  List<T> createList(String s){ //<T> Platzhalter für beliebigen Datentyp
        if(s.equalsIgnoreCase("a")){
            return new ArrayList<>();
        } else if (s.equalsIgnoreCase("v")) {
            return new Vector<>();
        }
        return null;
    }



}
