package it.morfoza.beerdomongo;

/**
 * Created by widzew on 2016-08-08.
 */
public class User {

        private String name;
        private int age;
        private float weight;
        private float height;
        private Gender gender;

        public User(String name, int age, float weight, float height, Gender gender) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height / 100;
            this.gender = gender;
        }


        public String toString() {
            return name + " " + " " + age + " " + weight + " " + height;
        }

        public float getWeight() {return weight;}

        public float getHeight() {
            return height;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

         public float getBmi() {
            return weight / (height * height);
        }



         public double howDrunkManIs() {return Beer.howManyAlcoholHasBeer * (weight * 0.7);
    }

         public double howDrunkWomanIs() {
        return Beer.howManyAlcoholHasBeer * (weight * 0.6);
    }

}
