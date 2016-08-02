import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

/**
 * Created by widzew on 2016-07-30.
 */
public class MainBeer {
    public static void main(String[] args) {

        ArrayList<BeerData> beerList = new ArrayList<>();
        beerList.add(new BeerData("Rebel Podwójnie Chmielone", 5, 12));
        beerList.add(new BeerData("Ciechan", 6, 12.2));
        beerList.add(new BeerData("Tenczynek Lager", 4.9, 12));
        beerList.add(new BeerData("Tyskie", 5.6, 12));

        BeerData.checkBeerStrength(beerList);


        System.out.println();
        System.out.println("Pętla while:");
        int i = 0;
        while (i < beerList.size()) {
            BeerData beerData = beerList.get(i);
            System.out.println(beerData);
            i += 1;
        }

        System.out.println();
        System.out.println("Pętla for:");

        for (int i2 = 0; i2 < beerList.size(); i2++) {
            BeerData beerData = beerList.get(i2);
            System.out.println(beerData);
        }

        System.out.println();
        System.out.println("Pętla foreach:");

        for (BeerData beerData : beerList) {
            System.out.println(beerData);
        }

    }

}

