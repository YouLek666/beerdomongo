package it.morfoza.beerdomongo;

import java.util.List;

/**
 * Created by widzew on 2016-08-11.
 */
public interface BeerRepository {

    List<Beer> getAllBeers();

    Beer findByName(String beerName);
}
