package dev.fitzgerald.repos;

import dev.fitzgerald.entities.ShoppingCart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface ShoppingCartRepo extends CrudRepository<ShoppingCart, Long> {
    List<ShoppingCart> findShoppingCartByCust(Long cust);

}
