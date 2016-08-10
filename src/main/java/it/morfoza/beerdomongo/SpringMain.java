package it.morfoza.beerdomongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;

/**
 * Created by widzew on 2016-08-10.
 */
@SpringBootApplication
public class SpringMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringMain.class,args);

    }
}
