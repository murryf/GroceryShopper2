package dev.fitzgerald.groceryshopper2;

import dev.fitzgerald.entities.ShoppingCart;
import dev.fitzgerald.repos.ShoppingCartRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShoppingCartRepoTest {

    @Autowired
    private ShoppingCartRepo shoppingCartRepo;

    @Test
    public void findShoppingCartByCust() {
        List<ShoppingCart> listed = shoppingCartRepo.findShoppingCartByCust(66L);
        System.out.println(listed.toString());
    }

    @Test
    public void makeShoppingCart(){
        ShoppingCart cart = new ShoppingCart(0L,66L,5L,1);
        cart = shoppingCartRepo.save(cart);
        System.out.println(cart);
        Assertions.assertNotEquals(0L,cart.getId());
    }


}