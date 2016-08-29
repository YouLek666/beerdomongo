package it.morfoza.beerdomongo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
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
    private LocalDateTime momentOfDrinkingLastBeer;

    private List<Beer> drinkedBeers = new ArrayList<>();

    public User(String name, int age, float weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }


    public String toString() {
        return name + " " + age + " lat " + weight + " kg " + gender + " wypił " + drinkedBeers + " czas trzezwienia od ostatniego piwka: " + timeToBeSoberFromLastBeer() + " czas trzezwienia od teraz (h): " + timeToBeSober() ;
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
        momentOfDrinkingLastBeer = LocalDateTime.now();
        drinkedBeers.add(beer);
    }

    public double howDrunkIs() {
        if (getGender() == Gender.MALE) {
            return howDrunkManIs();
        } else {
            return howDrunkWomanIs();
        }
    }

    private double howDrunkWomanIs() {
        return howDrunkIsForFactor(0.6);
    }

    private double howDrunkManIs() {
        return howDrunkIsForFactor(0.7);
    }

    private double howDrunkIsForFactor(double drunkFactor) {
        double totalGramsOfDrunkenAlcohol = 0;
        for (Beer beer : drinkedBeers) {
            double gramsOfAlcohol = beer.howMuchAlcoholHasBeer();
            totalGramsOfDrunkenAlcohol = gramsOfAlcohol + totalGramsOfDrunkenAlcohol;
        }
        return (totalGramsOfDrunkenAlcohol / 100) / (weight * drunkFactor);
    }

    public double timeToBeSoberFromLastBeer() {
        double sobering = ((howDrunkIs() / 0.15));
        return sobering;
    }

    public double timeToBeSober() {
        return timeToBeSoberFromLastBeer() - timePassedFromLastBeer();
    }

    private double timePassedFromLastBeer() {
        if (momentOfDrinkingLastBeer == null) {
            return 0;
        }
        Duration duration = Duration.between(momentOfDrinkingLastBeer, LocalDateTime.now());
        double numberOfSecondsInAnHour = 60*60;
        return duration.getSeconds() / numberOfSecondsInAnHour;

    }


}
