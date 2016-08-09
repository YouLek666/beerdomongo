package it.morfoza.beerdomongo;

/**
 * Created by widzew on 2016-08-08.
 */
public class User {

    private String name;
    private int age;
    private float weight;
    private Gender gender;

    public User(String name, int age, float weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }


    public String toString() {
        return name + " " + age + " " + weight + " " + gender + "";
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void drinkBeer(Beer beer) {

    }


    public double howDrunkManIs() {
       // return Beer.howManyAlcoholHasBeer() / (weight * 0.7);
        return 5;
    }

    public double howDrunkWomanIs() {
        // return Beer.howManyAlcoholHasBeer() / (weight * 0.6);
        return 5;
    }

}
