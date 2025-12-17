import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Auto> list= List.of(
                new Auto(200, "grün", Auto.Marke.BMW),
                new Auto(200, "grün", Auto.Marke.BMW),
                new Auto(210, "blau", Auto.Marke.MERCEDES),
                new Auto(212, "blau", Auto.Marke.MERCEDES),
                new Auto(180, "gelb", Auto.Marke.FORD),
                new Auto(220, "gelb", Auto.Marke.BMW),
                new Auto(130, "gelb", Auto.Marke.ENTE),
                new Auto(130, "braun", Auto.Marke.ENTE)

        );


        // Aufgabe: löse mit Hilfe von stream
        //1. das schnellste Auto (ein Auto-Objekt)
        Auto schnellstesAuto =list.stream().reduce(Main::schnellstes).get();
        System.out.println(schnellstesAuto);
        //2. eine Liste mit allen Farben (keine doppelten)
        //3. alle Autos mit einer Geschwindigkeit ab 200
        list.stream().filter( a -> a.getGeschwindigkeit() >= 200).forEach(System.out::println);
        //4. nach geschwindigkeit sortierte Liste (kleinste zuerst)

        list.stream().sorted((a1,a2)->
                a1.getGeschwindigkeit()<a2.getGeschwindigkeit()
                        ?-1: 1).distinct().forEach(System.out::println);

        //5. Marken-Liste aller gelben Autos, die unter 200 fahren (nur Marken in der Liste)
        List<Auto.Marke> li5 =list.stream().
                filter( a -> a.getGeschwindigkeit() < 200).
                filter(a->a.getFarbe().equals("gelb")).
                map(Auto::getMarke).toList();



    }

    public static Auto schnellstes(Auto a1, Auto a2){
        return a1.getGeschwindigkeit()> a2.getGeschwindigkeit()? a1:a2;
    }
}