package it.morfoza.beerdomongo;

import spark.ModelAndView;
import spark.Spark;

/**
 * Created by widzew on 2016-08-08.
 */
public class beerdomongo {
    Spark.staticFileLocation("/webfiles");

    String port = System.getenv ("PORT");
        if (port != null) {
        int portInt = Integer.parseInt (port);
        Spark.port(portInt);
    }


        Spark.get("/beerdomongo", (request, response) -> {
        String beername = request.queryParams("beername");
        String percent = request.queryParams("percent");
        String plato = request.queryParams("plato");
        String operation = request.queryParams("operation");


        String beername = Integer.parseString(beername);
        int percent = Integer.parseInt(percent);
        int plato = Integer.parseInt(plato);

        Map<String, Object> model = new HashMap();
        model.put("result", result);
        model.put("number1", number1);
        model.put("number2", number2);

        return new ModelAndView(model, "result.ftl");
    }, new FreeMarkerEngine());

        Spark.get("/beerlist", (request, response) -> {
        String number1 = request.queryParams("name");
        String number2 = request.queryParams("subname");

        Map<String, Object> model = new HashMap();
        model.put("name", number1);
        model.put("subname", number2);

        return new ModelAndView(model, "name.ftl");
    }, new FreeMarkerEngine());


}
