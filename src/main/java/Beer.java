import java.util.ArrayList;

/**
 * Created by widzew on 2016-07-30.
 */
public class Beer {

    private String BeerName;
    private double Percent;
    private double Plato;

    public Beer(String beerName, double Percent, double Plato) {
        this.BeerName = beerName;
        if(Percent > 70) {
            System.out.println("Zgupłeś??!! Ustawiam 70% (max. dopuszczalne)");
            throw new RuntimeException("70% to za duzo jak na piwo!");
        } else {
            this.Percent = Percent;
        }
        this.Plato = Plato;
    }


    public String toString() {
        return "Beer " + BeerName + " Percent " + Percent + " Plato " + Plato;
    }

    public boolean isStrong() {
        if (this.Percent > 4.9) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isStrong(Beer beer) {
        if (beer.Percent > 4.9) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isStrong(double Percent) {
        if (Percent > 4.9) {
            return true;
        } else {
            return false;
        }
    }


}