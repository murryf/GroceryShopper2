package dev.fitzgerald.groceryshopper2;


import dev.fitzgerald.entities.Grocery;
import dev.fitzgerald.repos.GroceryRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class GroceryRepoTests {

    @Autowired
    private GroceryRepo groceryRepo;

    @Test
    public void makeGrocery(){
        Grocery grocery = new Grocery(0L,"peas", 0.99);
        grocery = groceryRepo.save(grocery);
        System.out.println(grocery);
        Assertions.assertNotEquals(0L,grocery.getId());
    }

    @Test
    public void updateGrocery(){
        Grocery grocery = new Grocery(0L, "chicken", 8.54);
        Grocery unchanged = groceryRepo.save(grocery);
        grocery.setId(unchanged.getId());
        grocery.setName("chicken nuggets");
        grocery = groceryRepo.save(grocery);
        System.out.println(unchanged);
        System.out.println(grocery);
        Assertions.assertEquals(grocery.getId(), unchanged.getId());
    }

    @Test
    public void getGrocery(){
        Grocery fetched = groceryRepo.findGroceryById(17L);
        System.out.println(fetched);
        Assertions.assertEquals("chicken nuggets", fetched.getName());
    }

    @Test
    public void deleteGrocery(){
        Grocery toDelete = new Grocery(0L,"ham",24.99);
        toDelete = groceryRepo.save(toDelete);
        groceryRepo.delete(toDelete);
        Assertions.assertNull(groceryRepo.findGroceryById(toDelete.getId()));
    }
}
