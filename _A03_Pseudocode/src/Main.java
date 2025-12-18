import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Pseudocode zu Java-Code
 */
public class Main {

//    Funktion summe(a, b)
//      ergebnis <- a + b
//      Rückgabe ergebnis
//    Ende Funktion

    public static int summe(int a, int b) {
        int ergebnis = a + b; // TODO one line
        return ergebnis;
    }
//    Funktion istGrößer(a, b) // ist a > b
    //    Wenn a > b dann
    //    Rückgabe Wahr
    //    Sonst
    //    Rückgabe Falsch
//    Ende Funktion

    //    public static boolean istGroesser(int a, int b){
//        if(a > b){
//            return true;
//        }else{
//            return false;
//        }
//    }
    public static boolean istGroesser(int a, int b) {
        return a > b;
    }

//    Algorithmus Minimum(Liste)
    //    min ← Liste[0]
    //    Für jedes Element e in Liste
    //    Wenn e < min dann
    //    min ← e
    //    Ende Für
    //    Rückgabe min
//    Ende Algorithmus

    public static int minimum(List<Integer> zahlen) {
        Objects.requireNonNull(zahlen, "Liste darf nicht null sein");
       // FIXME Parameter prüfen
        int min = zahlen.get(0); // neuere Javaversion zahlen.getFirst()
        for (int e : zahlen) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }
//    Funktion Durchschnitt(Liste)
//        summe ← 0
    //    Für jedes Element e in Liste
    //       summe ← summe + e
    //    Ende Für
//        Rückgabe summe / Länge(Liste)
//    Ende Funktion

    public static double durchschnitt(List<Integer> zahlen){
        Objects.requireNonNull(zahlen, "Liste darf nicht null sein");
        int summe = 0;
        for (int e: zahlen){
            summe +=e;
        }
        return (double) summe / zahlen.size();
    }

    // hierfür benötigen wir eine Klasse Produkt und Warenkorb
//    Algorithmus BerechneGesamtpreis(warenkorb)
//        gesamt ← 0
//        Für jedes produkt in warenkorb
//             gesamt ← gesamt + produkt.preis * produkt.menge
//        Ende Für
//        Rückgabe gesamt
//    Ende Algorithmus
    public static double berechneGesamtpreis(Warenkorb warenkorb){
        double gesamt = 0;
        for(Produkt produkt :warenkorb.getProdukte() ){
            gesamt += produkt.getPreis() * produkt.getMenge();
        }
        return gesamt;
    }
//--------------------- main -------------------------------------------------------
    public static void main(String[] args) {
        //System.out.println(summe(3, 5));
        //ArrayList<Integer> li = new ArrayList<>();
        //li.add(4);
       // System.out.println( minimum(List.of(2,0,5,23,-13,1,55)));
      //  minimum(null);

        Warenkorb w = new Warenkorb();
        w.hinzufuegen(new Produkt("Jacke",33.33,1));
        w.hinzufuegen(new Produkt("Buch",30.99,2));
        w.hinzufuegen(new Produkt("Hose",53.50,1));
        System.out.println(berechneGesamtpreis(w));
    }
}