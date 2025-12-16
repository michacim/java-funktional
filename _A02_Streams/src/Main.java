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
        //2. eine Liste mit allen Farben (keine doppelten)
        //3. alle Autos mit einer Geschwindigkeit ab 200
        //4. nach geschwindigkeit sortierte Liste (kleinste zuerst)
        //5. Marken-Liste aller gelben Autos, die unter 200 fahren (nur Marken in der Liste)
    }
}