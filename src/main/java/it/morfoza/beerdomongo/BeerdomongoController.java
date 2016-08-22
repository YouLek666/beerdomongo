package it.morfoza.beerdomongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by widzew on 2016-08-10.
 */
@Controller
public class BeerdomongoController {

    private BeerRepository beerRepository;
    private UserSession session;

    @Autowired
    public BeerdomongoController(BeerRepository beerRepository, UserSession session) {
        this.beerRepository = beerRepository;
        this.session = session;
    }

    @RequestMapping("/beerdomongo")
    public String beerdomongo(@RequestParam(value = "error", required = false) String error, Model model) {
        model.addAttribute("error", error);
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

        if (age < 18){
            String error = encode ("Jesteś za młody. Wracaj do piaskownicy!");
            return "redirect:/beerdomongo?error=" + error;
        }




        User user = new User(name, age, weight, gender);
        session.setCurrentUser(user);
        model.addAttribute("user1", user);
        model.addAttribute("beers", beerRepository.getAllBeers());


        return "form";
    }

    @RequestMapping("/pij")
    public String pij(@RequestParam(value = "beer.name") String beerName, Model model) {
        Beer beer = beerRepository.findByName(beerName);
        User user = session.getCurrentUser();
        user.drinkBeer(beer);

        return "redirect:/user_info";
    }

    @RequestMapping("/user_info")
    public String userInfo(Model model) {
        User user = session.getCurrentUser();
        double promilsInBlood = user.howDrunkIs();

        model.addAttribute("user", user);
        model.addAttribute("promils", promilsInBlood);
        return "pij";
    }

    private String encode(String text) {
        try {
            return URLEncoder.encode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}






