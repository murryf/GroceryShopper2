package dev.fitzgerald.entities;


import javax.persistence.*;

@Entity
@Table(name="cartdb")
public class ShoppingCart {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entry_id")
    private Long id;
    @Column(name = "cart_id")
    private Long cust;
    @Column(name = "product_id")
    private Long item;
    @Column(name = "product_qtty")
    private int qtty;


    public ShoppingCart(){};

    public ShoppingCart(Long id, Long cust, Long item, int qtty){
        this.id = id;
        this.cust = cust;
        this.item = item;
        this.qtty = qtty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCust() {
        return cust;
    }

    public void setCust(Long cust) {
        this.cust = cust;
    }

    public Long getItem() {
        return item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public int getQtty() {
        return qtty;
    }

    public void setQtty(int qtty) {
        this.qtty = qtty;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", cust=" + cust +
                ", item=" + item +
                ", qtty=" + qtty +
                '}';
    }
}
