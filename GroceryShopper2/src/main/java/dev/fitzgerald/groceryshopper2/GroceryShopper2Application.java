package dev.fitzgerald.groceryshopper2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "dev.fitzgerald") //Locate Components
@EntityScan(basePackages = "dev.fitzgerald.entities") //Locate Entities
@EnableJpaRepositories(basePackages = "dev.fitzgerald.repos")//Locate Repos
public class GroceryShopper2Application {

    public static void main(String[] args) {
        SpringApplication.run(GroceryShopper2Application.class, args);
    }

}
