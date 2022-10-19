package dev.fitzgerald.controllers;


import dev.fitzgerald.entities.Grocery;
import dev.fitzgerald.services.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@RestController
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @GetMapping("/groceries")
    @ResponseBody
    public List<Grocery> getAllGroceries(){
        List<Grocery> groceries = this.groceryService.getAllGroceries();
        return groceries;
    }

    @GetMapping("groceries/id/{id}")
    @ResponseBody
    public Grocery getGroceryById(@PathVariable Long id){
        Grocery temp = this.groceryService.getGroceryById(id);
        if(temp == null){
            return new Grocery();
        } else{
            return temp;
        }

    }

    @GetMapping("groceries/name/{name}")
    @ResponseBody
    public Grocery getGroceryByName(@PathVariable String name){
        name = name.toLowerCase();
        Grocery temp = this.groceryService.getGroceryByName(name);
        if(temp == null){
            return new Grocery();
        } else{
            return temp;
        }
    }



}

