package main.java.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name= "buyers")
@Entity
@Setter
@Getter
@ToString
public class Buyer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private Integer age;

    @OneToMany(mappedBy = "buyer")
    private List<Order> orders = new ArrayList<>();

    public Buyer() {
    }

    public Buyer(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void addOrder(Order order) {
        if(order != null) {
            orders.add(order);
        }
    }

}
