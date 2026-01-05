import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto(220,"gelb"));
        autos.add(new Auto(110,"blau"));
        autos.add(new Auto(150,"rot"));
        autos.add(new Auto(100,"gelb"));

       // Collections.sort(autos);
      //  autos.sort((a1, a2) ->a1.getFarbe().compareTo(a2.getFarbe()) );
        autos.sort(Comparator.comparing(Auto::getFarbe));
        System.out.println(autos);


    }
}

class MyCompare implements Comparator<Auto>{

    @Override
    public int compare(Auto a1, Auto a2) {
        return a1.getFarbe().compareTo(a2.getFarbe());
    }
}