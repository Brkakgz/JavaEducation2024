package com.burakodev.sprindatahomework.repository;


import com.burakodev.sprindatahomework.model.Customers;
import com.burakodev.sprindatahomework.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {


    @Query("select e from Orders e where e.ordersId=opk and e.customerId=:cpk and e.productId=:ppk and e.orderDate=:od")
    List<Orders> findAllOrderDetail(Integer opk,Integer cpk,Integer ppk,Integer od);


    @Query("select c from Customers c Inner Join Orders o on c.customerId = o.customerId ")
    List<Customers> findOrderedCustomerList();
}
