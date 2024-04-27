package com.burakodev.sprindatahomework.repository;

import com.burakodev.sprindatahomework.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository <Customers, Integer>{


    //Dümdüz bir sorgu aslında bu sorguyu Class bazında yaptığı için Customers classına gidiyor oradaki bilgileri kontrol ederek bize çıktı veriyor
    //e.customerName class içerisindeki tanımlamadan geliyor
    @Query("select e from Customers e where e.customerId=:p")
    List<Customers> findbyAllCustomerDetails(Integer p);

    @Modifying
    @Query("delete from Customers e where e.customerId =:id")
    void deleteCustomersById(int id);






}
