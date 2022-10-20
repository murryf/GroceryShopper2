package dev.fitzgerald.repos;


import dev.fitzgerald.entities.Grocery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GroceryRepo extends CrudRepository<Grocery, Long> {

    Grocery findGroceryByName(String name);
    Grocery findGroceryById(Long id);

}
