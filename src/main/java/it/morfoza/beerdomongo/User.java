package it.morfoza.beerdomongo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widzew on 2016-08-08.
 */
public class User {


    private String name;
    private int age;
    private float weight;
    private Gender gender;

    private List<Beer> drinkedBeers = new ArrayList<>();

    public User(String name, int age, float weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }


    public String toString() {
        return name + " " + age + " lat " + weight + " kg " + gender +" wypił " + drinkedBeers + "";
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }


    public void drinkBeer(Beer beer) {
        drinkedBeers.add(beer);
    }


    public double howDrunkManIs() {
        double totalGramsOfDrunkenAlcohol = 0;
        for (Beer beer : drinkedBeers) {
            double gramsOfAlcohol = beer.howMuchAlcoholHasBeer();
            totalGramsOfDrunkenAlcohol = gramsOfAlcohol + totalGramsOfDrunkenAlcohol;
        }
        return (totalGramsOfDrunkenAlcohol/100) / (weight * 0.7);
    }

    public double howDrunkWomanIs() {
        double totalGramsOfDrunkenAlcohol = 0;
        for (Beer beer : drinkedBeers) {
            double gramsOfAlcohol = beer.howMuchAlcoholHasBeer();
            totalGramsOfDrunkenAlcohol = gramsOfAlcohol + totalGramsOfDrunkenAlcohol;
        }
        return (totalGramsOfDrunkenAlcohol/100) / (weight * 0.6);
    }
}
