package com.burakodev.sprindatahomework.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="customers")
@ToString
@Getter
@Setter
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_id")
    public Integer customerId;
    private String customerName;
    private String customerMail;
    private String customerAdress;


}
