package dev.fitzgerald.services;


import dev.fitzgerald.entities.ShoppingCart;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface ShoppingCartService {

    List<ShoppingCart> getAllShoppingCarts();

    List<ShoppingCart> getShoppingCartByCust(Long cust);
}
