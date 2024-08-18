package org.okten.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/*@Data
@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private Double price;

    @Enumerated(EnumType.ORDINAL)
    private ProductAvailability availability;

    @OneToMany(mappedBy = "id.product", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<OrderItem> orderItems;

}*/

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Enumerated(EnumType.ORDINAL)
    private ProductAvailability availability;

    @OneToMany(mappedBy = "id.product", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

    private String owner;
}
