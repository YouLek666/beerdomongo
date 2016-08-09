package it.morfoza.beerdomongo;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

public class Beerdomongo {

    public static void main(String[] args) {


        Spark.staticFileLocation("/webfiles");

        String port = System.getenv("PORT");
        if (port != null) {
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);
        }


        Spark.get("/beerdomongo", (request, response) -> {
            String beername = request.queryParams("beername");
            String percentAsString = request.queryParams("percent");
            String platoAsString = request.queryParams("plato");
            String caloriesAsString = request.queryParams("calories");


            int percent = Integer.parseInt(percentAsString);
            double plato = Integer.parseInt(platoAsString);
            int calories = Integer.parseInt(caloriesAsString);


            Map<String, Object> model = new HashMap();
            model.put("beer name", beername);
            model.put("percent", percent);
            model.put("plato", plato);
            model.put("calories", calories);

            return new ModelAndView(model, "beerthinks.ftl");
        }, new FreeMarkerEngine());


    }
}