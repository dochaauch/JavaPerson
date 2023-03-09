package main.java.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor

@Table(name = "orders")
@Entity
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;

    public Order(String name, String description) {
        this.name = name;
        this.description = description;

    }
}
