package com.burakodev.sprindatahomework.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="orders")
@ToString
@Getter
@Setter
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_id")
    private int ordersId;
    @Column(name="customer_id")
    private int customerId;
    @Column(name="product_id")
    private int productId;
    private int orderDate;

}
