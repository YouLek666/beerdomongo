package it.morfoza.beerdomongo;

import it.morfoza.beerdomongo.Beer;

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

    public void checkBeerQuality(ArrayList<Beer> beerList) {
        for (Beer beer : beerList) {
            System.out.println(beer);
            if (beer.isGood()) {
                System.out.println("Good beer, drink");
            } else {
                System.out.println("Shit, better avoid");
            }
        }
    }




    public void checkBeer2(ArrayList<Beer> beerList) {
        for (Beer beer : beerList){
            System.out.println(beer);
            boolean good = beer.isGood();
            if (beer.isGood()) {
                System.out.println("Good beer, drink");
            } else {
                System.out.println("Shit, better avoid");
            }
            boolean strong = beer.isStrong();
            if (!beer.isStrong()) {
                System.out.println("You can drink one more");
            } else {
                System.out.println("This beer is strong");
            }
        }

    }


}
