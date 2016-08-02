import java.util.ArrayList;

/**
 * Created by widzew on 2016-07-30.
 */
public class MainBeer {
    public static void main(String[] args) {

        ArrayList<Beer> beerList = new ArrayList<>();
        beerList.add(new Beer("Rebel Podwójnie Chmielone", 5, 12));
        beerList.add(new Beer("Ciechan", 6, 12.2));
        beerList.add(new Beer("Tenczynek Lager", 4.9, 12));
        beerList.add(new Beer("Tyskie", 5.6, 12));

        Beer.checkBeerStrength(beerList);


        System.out.println();
        System.out.println("Pętla while:");
        int i = 0;
        while (i < beerList.size()) {
            Beer beer = beerList.get(i);
            System.out.println(beer);
            i += 1;
        }

        System.out.println();
        System.out.println("Pętla for:");

        for (int i2 = 0; i2 < beerList.size(); i2++) {
            Beer beer = beerList.get(i2);
            System.out.println(beer);
        }

        System.out.println();
        System.out.println("Pętla foreach:");

        for (Beer beer : beerList) {
            System.out.println(beer);
        }

    }

}

