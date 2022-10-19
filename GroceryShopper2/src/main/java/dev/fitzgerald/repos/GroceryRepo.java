package dev.fitzgerald.repos;


import dev.fitzgerald.entities.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface GroceryRepo extends JpaRepository<Grocery, Long> {

    Grocery findGroceryByName(String name);
    Grocery findGroceryById(Long id);

}
