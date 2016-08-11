package it.morfoza.beerdomongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widzew on 2016-08-10.
 */
@Controller
public class BeerdomongoController {

    private List<Beer> beerList;
    private User user;

    private BeerRepository beerRepository;

    @Autowired
    public BeerdomongoController(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    public BeerdomongoController() throws ThisIsNotABeer {
        beerList = new ArrayList<>();
        beerList.add(new Beer("Rebel Podwójnie Chmielone", 5, 12, 230, 23));
        beerList.add(new Beer("Ciechan", 6, 12.2, 240, 22));
        beerList.add(new Beer("Tenczynek Lager", 4.9, 12, 205, 20));
        beerList.add(new Beer("Tyskie", 5.6, 9, 201, 25));

    }

    @RequestMapping("/beerdomongo")
    public String beerdomongo() {
        return "beerdomongo";
    }

    @RequestMapping("/form")
    public String form(@RequestParam(value = "name") String name,
                       @RequestParam(value = "age") int age,
                       @RequestParam(value = "weight") float weight,
                       @RequestParam(value = "gender") Gender gender, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("weight", weight);
        model.addAttribute("gender", gender);

        user = new User(name, age, weight, gender);
        model.addAttribute("user1", user);
        model.addAttribute("beers", beerList);


        return "form";
    }
    @RequestMapping("/pij")
    public String pij(@RequestParam(value = "beer.name") String beerName, Model model) {
        model.addAttribute("beer.name", beerName);
            return "pij";}

}






