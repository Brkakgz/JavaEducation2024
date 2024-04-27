package com.burakodev.sprindatahomework.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="products")
@ToString
@Getter
@Setter
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    public Integer productId;
    private String productName;
    private Integer productPrice;


}
