package dev.fitzgerald.services;


import dev.fitzgerald.entities.ShoppingCart;
import dev.fitzgerald.repos.ShoppingCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    private ShoppingCartRepo shoppingCartRepo;


    @Override
    public List<ShoppingCart> getAllShoppingCarts() {
        List<ShoppingCart> results = new ArrayList<>();
        this.shoppingCartRepo.findAll().forEach(results::add);
        return results;
    }

    @Override
    public List<ShoppingCart> getShoppingCartByCust(Long cust) {
        List<ShoppingCart> results = new ArrayList<>();
        this.shoppingCartRepo.findShoppingCartByCust(cust).forEach(results::add);

        return null;
    }
}
