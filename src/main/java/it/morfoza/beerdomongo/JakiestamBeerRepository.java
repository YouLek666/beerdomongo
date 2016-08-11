package it.morfoza.beerdomongo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JakiestamBeerRepository implements BeerRepository {
    @Override
    public List<Beer> getAllBeers()  {
        List<Beer> beerList = new ArrayList<>();
        try {
            beerList.add(new Beer("Rebel Podwójnie Chmielone", 5, 12, 230, 23));
            beerList.add(new Beer("Ciechan", 6, 12.2, 240, 22));
            beerList.add(new Beer("Tenczynek Lager", 4.9, 12, 205, 20));
            beerList.add(new Beer("Tyskie", 5.6, 9, 201, 25));
        } catch (ThisIsNotABeer e) {
            throw new RuntimeException("Wrong data in JakiestamBeerRepository", e);
        }
        return beerList;

    }

    @Override
    public Beer findByName(String beerName) {
        List<Beer> allBeers = getAllBeers();
        for (Beer beer : allBeers) {
            if(beer.getName().equals(beerName)) {
                return beer;
            }
        }
        throw new BeerDoesNotExist();
    }
}
