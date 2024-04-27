package com.burakodev.sprindatahomework.repository;


import com.burakodev.sprindatahomework.model.Orders;
import com.burakodev.sprindatahomework.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

    //Mesela bu sorgu sadece id değerine göre sonuç verir
    @Query("select e from Products e where e.productId=:pi")
    List<Products> findProductbyId(Integer pi);



}
