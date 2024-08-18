package org.okten.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

/*@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;

    @Column(name = "order_datetime")
    private OffsetDateTime orederDate;

    @OneToMany(mappedBy = "id.order")
    private List<OrderItem> items;

}*/

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_date")
    private OffsetDateTime orderDate;

    @OneToMany(mappedBy = "id.order")
    private List<OrderItem> items;
}

