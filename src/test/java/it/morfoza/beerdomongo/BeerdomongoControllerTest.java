package it.morfoza.beerdomongo;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;


import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by widzew on 2016-08-22.
 */
public class BeerdomongoControllerTest {

//    BeerdomongoController beerdomongoController = new BeerdomongoController(BeerRepository, User);

@Test
    public void should() throws ThisIsNotABeer {//given
    BeerRepository beerRepository = Mockito.mock(BeerRepository.class);
    Beer beer = new Beer("Tyskie", 5.0,5.0,4,2.0);
    when (beerRepository.findByName("Tyskie")).thenReturn(beer);
    UserSession userSession = Mockito.mock(UserSession.class);
    User user = Mockito.mock(User.class);
    when (userSession.getCurrentUser()).thenReturn(user);
    BeerdomongoController beerdomongoController = new BeerdomongoController(beerRepository, userSession);

    Model model = Mockito.mock(Model.class);


    //when
    beerdomongoController.pij("Tyskie", model);

    //then
    verify(user).drinkBeer(beer);

}
}