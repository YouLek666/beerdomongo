package it.morfoza.beerdomongo;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by widzew on 2016-08-25.
 */
@Component
@Primary
public class BeerRepositoryDatabase implements BeerRepository {
    //@Override
    //public List<Beer> getAllBeers() {
    //    return null;
    //}

    @Override
    public Beer findByName(String beerName) {
        return dataSource.queryForObject("SELECT * FROM beer WHERE beername = ?", new BeerRowMapper(), beerName);

    }

    public BeerRepositoryDatabase(JdbcTemplate dataSource) {
        this.dataSource = dataSource;
    }

    private JdbcTemplate dataSource;

    public List<Beer> getAllBeers() {
        return dataSource.query ("SELECT id, beername, percent, plato, calories FROM beer", new BeerRowMapper ()  );
    }


}
