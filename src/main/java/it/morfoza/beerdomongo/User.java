package it.morfoza.beerdomongo;

import org.springframework.stereotype.Component;

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
        return name + " " + age + " lat " + weight + " kg " + gender + " wypił " + drinkedBeers + "";
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }


    public void drinkBeer(Beer beer) {
        drinkedBeers.add(beer);
    }


    public double howDrunkIs() {
        if (getGender()== Gender.MALE) {
        double totalGramsOfDrunkenAlcohol = 0;
        for (Beer beer : drinkedBeers) {
            double gramsOfAlcohol = beer.howMuchAlcoholHasBeer();
            totalGramsOfDrunkenAlcohol = gramsOfAlcohol + totalGramsOfDrunkenAlcohol;
        }
        return (totalGramsOfDrunkenAlcohol / 100) / (weight * 0.7);
    } else {
                double totalGramsOfDrunkenAlcohol = 0;
                for (Beer beer : drinkedBeers) {
                    double gramsOfAlcohol = beer.howMuchAlcoholHasBeer();
                    totalGramsOfDrunkenAlcohol = gramsOfAlcohol + totalGramsOfDrunkenAlcohol;
                }
                return (totalGramsOfDrunkenAlcohol / 100) / (weight * 0.6);
            }
        }

    public double timeToBeSober() {
        double sobering =  ((howDrunkIs()/0.15));
        return sobering;}




}
