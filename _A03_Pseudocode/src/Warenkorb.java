import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    private List<Produkt> produkte = new ArrayList<>();



    public void hinzufuegen(Produkt produkt){
        produkte.add(produkt);
    }
    public void loeschen(Produkt produkt){
        produkte.remove(produkt);
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }


}
