package it.morfoza.beerdomongo;

/**
 * Created by widzew on 2016-07-30.
 */
public class Beer {

    private String beerName;
    private double percent;
    private double plato;
    private int calories;
    private double howManyAlcoholHasBeer;

    public Beer(String beerName, double percent, double Plato, int Calories, double howManyAlcoholHasBeer) throws ThisIsNotABeer {
        this.beerName = beerName;
        if(percent > 70) {
            System.out.println("Zgupłeś??!! Ustawiam 70% (max. dopuszczalne)");
            throw new ThisIsNotABeer();
        } else {
            this.percent = percent;
        }
        this.plato = Plato;
        this.calories = Calories;
        this.howManyAlcoholHasBeer = howManyAlcoholHasBeer;
    }


    public String toString() {
        return "Beer: " + beerName + " Percent: " + percent + " Plato: " + plato + " Calories: " + calories + " Alcohol in g: " + howManyAlcoholHasBeer;
    }

    public boolean isStrong() {
        if (this.percent > 4.9) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isStrong(Beer beer) {
        if (beer.percent > 4.9) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGood() {
        if (this.plato > 10) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isGood(Beer beer) {
        if (beer.plato > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static double howManyAlcoholHasBeer(Beer beer) {
        return (500 * beer.percent) * 0.79;
    }
}





