import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Produkt {
    private String name ;
    private double preis;
    private int menge;

    public Produkt(String name, double preis, int menge) {
        this.name = name;
        this.preis = preis;
        this.menge = menge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", menge=" + menge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Produkt produkt = (Produkt) o;
        return Double.compare(preis, produkt.preis) == 0 && menge == produkt.menge && Objects.equals(name, produkt.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(preis);
        result = 31 * result + menge;
        return result;
    }
}
