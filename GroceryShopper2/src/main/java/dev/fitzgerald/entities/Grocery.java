package dev.fitzgerald.entities;


import javax.persistence.*;

@Entity
@Table(name="grocerydb")
public class Grocery {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    Long id;
    @Column(name = "item_name")
    String name;
    @Column(name = "item_price")
    Double groceryPrice;


    public Grocery(){}

    public Grocery(Long id, String name, Double price){
        this.id = id;
        this.name = name;
        this.groceryPrice = price;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Double getGroceryPrice(){
        return groceryPrice;
    }

    public void setId(Long groceryId) {
        this.id = groceryId;
    }

    public void setName(String groceryName) {
        this.name = groceryName;
    }

    public void setGroceryPrice(Double groceryPrice) {
        this.groceryPrice = groceryPrice;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "groceryId=" + id +
                ", groceryName='" + name + '\'' +
                ", groceryPrice=" + groceryPrice +
                '}';
    }
}

