/**
 * Created by widzew on 2016-07-30.
 */
public class BeerData {

    private String BeerName;
    private double Percent;
    private double Plato;

    public BeerData (String beerName, double Percent, double Plato) {
        this.BeerName = beerName;
        this.Percent = Percent;
        this.Plato = Plato;
}

    public String toString() {
        return "Beer " + BeerName + " Percent " + Percent + " Plato "+ Plato;
    }

    public boolean isStrong() {
        if (Percent > 4.9) return true;
        else return false;
    }
}
