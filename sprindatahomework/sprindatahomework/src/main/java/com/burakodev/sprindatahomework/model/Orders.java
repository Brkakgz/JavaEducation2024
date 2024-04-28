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
    private Integer ordersId;
    @Column(name="customer_id")
    private Integer customerId;
    @Column(name="product_id")
    private Integer productId;
    private int orderDate;

//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customers customer;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Products product;

}
