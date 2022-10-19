package dev.fitzgerald.services;

import dev.fitzgerald.entities.Grocery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface GroceryService {

    List<Grocery> getAllGroceries();
    Grocery getGroceryById(Long id);
    Grocery getGroceryByName(String name);

}
