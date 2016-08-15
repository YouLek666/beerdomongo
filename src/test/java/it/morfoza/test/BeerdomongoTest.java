package it.morfoza.test;

import it.morfoza.beerdomongo.Beer;
import it.morfoza.beerdomongo.Gender;
import it.morfoza.beerdomongo.ThisIsNotABeer;
import it.morfoza.beerdomongo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by widzew on 2016-08-12.
 */
public class BeerdomongoTest {
    @Test
    public void should () {
        User user = new User("Marek", 44, 84, Gender.MALE);
        User user1 = new User("Darek",55,90, Gender.FEMALE);

        assertThat(user != user1);
    }
}