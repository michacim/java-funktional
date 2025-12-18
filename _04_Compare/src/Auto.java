import java.util.Objects;

public class Auto implements Comparable<Auto>{


    private int geschwindigkeit;
    private String farbe;

    public Auto(int geschwindigkeit, String farbe ) {
        this.geschwindigkeit = geschwindigkeit;
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "geschwindigkeit=" + geschwindigkeit +
                ", farbe='" + farbe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;
        return geschwindigkeit == auto.geschwindigkeit && Objects.equals(farbe, auto.farbe);
    }


    @Override
    public int hashCode() {
        int result = geschwindigkeit;
        result = 31 * result + Objects.hashCode(farbe);
        return result;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    /**
     * negative Zahl -kleiner, positive Zahl größer, == 0
     * @param
     * @return
     */
    @Override
    public int compareTo(Auto a) {

        return this.geschwindigkeit - a.geschwindigkeit;
    }
}
