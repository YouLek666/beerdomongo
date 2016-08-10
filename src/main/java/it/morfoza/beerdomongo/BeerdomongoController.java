package it.morfoza.beerdomongo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by widzew on 2016-08-10.
 */
@Controller
public class BeerdomongoController {
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

        User user = new User(name, age, weight, gender);
        model.addAttribute("user1", user);

        return "form";
    }
}






