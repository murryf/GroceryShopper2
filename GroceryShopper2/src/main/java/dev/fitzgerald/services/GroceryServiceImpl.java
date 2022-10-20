package dev.fitzgerald.services;


import dev.fitzgerald.entities.Grocery;
import dev.fitzgerald.repos.GroceryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class GroceryServiceImpl implements GroceryService {
    @Autowired
    private GroceryRepo groceryRepo;

    @Override
    public List<Grocery> getAllGroceries() {
        List<Grocery> results = new ArrayList<Grocery>();
        this.groceryRepo.findAll().forEach(results::add);
        return results;
    }

    @Override
    public Grocery getGroceryById(Long id) {
        return this.groceryRepo.findGroceryById(id);
    }

    @Override
    public Grocery getGroceryByName(String name) {
        return this.groceryRepo.findGroceryByName(name);
    }

}
