import java.util.ArrayList;

/**
 * Created by widzew on 2016-07-30.
 */
public class MainBeer {
    public static void main(String[] args) {

        ArrayList<BeerData> beerList = new ArrayList<>();
        beerList.add(new BeerData("Rebel Podwójnie Chmielone", 5, 12 ));
        beerList.add(new BeerData("Ciechan", 6, 12.2 ));
        beerList.add(new BeerData("Tenczynek Lager", 4.9, 12 ));

        BeerData beer = new BeerData(beerList);


        System.out.println(beerList);


        }

    }

