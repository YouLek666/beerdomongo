import java.util.ArrayList;

public class Keeper {

    public void checkBeerStrength(ArrayList<Beer> beerList) {
        for (Beer beer : beerList) {
            System.out.println(beer);
            if (!beer.isStrong()) {
                System.out.println("You can drink one more");
            } else {
                System.out.println("This beer is strong");
            }

        }

    }

}
