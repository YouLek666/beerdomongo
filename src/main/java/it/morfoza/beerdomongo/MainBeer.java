package it.morfoza.beerdomongo;

import spark.Spark;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;

import static it.morfoza.beerdomongo.Gender.*;
import static it.morfoza.beerdomongo.Gender.MALE;

/**
 * Created by widzew on 2016-07-30.
 */
public class MainBeer {

    public static void consoloVersion(String[] args) throws ThisIsNotABeer {

        ArrayList<Beer> beerList = new ArrayList<>();
        beerList.add(new Beer("Rebel Podwójnie Chmielone", 5, 12, 230, 23));
        beerList.add(new Beer("Ciechan", 6, 12.2, 240, 22));
        beerList.add(new Beer("Tenczynek Lager", 4.9, 12, 205, 20));
        beerList.add(new Beer("Tyskie", 5.6, 9, 201, 25));



        Keeper julek = new Keeper();
        julek.checkBeer2(beerList);


        User user = new User("Marian",22,84, FEMALE);
        user.drinkBeer(beerList.get(2));
        double promilsInBlood = user.howDrunkIs();
        double soberInHours = user.timeToBeSober();

        System.out.println(user);
        System.out.println("Masz " + promilsInBlood + " promila");
        System.out.println("Będziesz trzeźwy za " + soberInHours + " godziny");


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

