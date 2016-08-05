package it.morfoza.beerdomongo;

/**
 * Created by widzew on 2016-07-30.
 */
public class Beer {

    private String BeerName;
    private double Percent;
    private double Plato;

    public Beer(String beerName, double Percent, double Plato) throws ThisIsNotABeer {
        this.BeerName = beerName;
        if(Percent > 70) {
            System.out.println("Zgupłeś??!! Ustawiam 70% (max. dopuszczalne)");
            throw new ThisIsNotABeer();
        } else {
            this.Percent = Percent;
        }
        this.Plato = Plato;
    }


    public String toString() {
        return "it.morfoza.beerdomongo.Beer " + BeerName + " Percent " + Percent + " Plato " + Plato;
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

    public boolean isGood() {
        if (this.Plato > 10) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isGood(Beer beer) {
        if (beer.Plato > 10) {
            return true;
        } else {
            return false;
        }





    }


}