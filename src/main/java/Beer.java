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
        this.Percent = Percent;
        this.Plato = Plato;
    }


    public String toString() {
        return "Beer " + BeerName + " Percent " + Percent + " Plato " + Plato;
    }



    public static void checkBeerStrength(ArrayList<Beer> beerList) {

        for (Beer beer : beerList) {

            System.out.println(beer);
            if (beer.Percent <= 4.9) {
                System.out.println("You can drink one more");
            } else {
                System.out.println("This beer is strong");
            }

        }

    }


}