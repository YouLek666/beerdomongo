package it.morfoza.beerdomongo;

import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by widzew on 2016-08-25.
 */
public class BeerRowMapper implements org.springframework.jdbc.core.RowMapper<Beer> {

    public Beer mapRow(ResultSet resultSet, int i) throws SQLException {
        String beername = resultSet.getString("beername");
        double percent = resultSet.getDouble("percent");
        double plato = resultSet.getDouble ("plato");
        int calories = resultSet.getInt("calories");

        Beer beer = null;
        try {
            beer = new Beer(beername, percent,plato,calories, 55);
        } catch (ThisIsNotABeer thisIsNotABeer) {
            thisIsNotABeer.printStackTrace();
        }
        return beer;


}
}
