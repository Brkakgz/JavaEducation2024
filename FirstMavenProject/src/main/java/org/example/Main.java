package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

       String jdbcUrl="jdbc:postgresql://localhost:5432/firstDB";
       String username="postgres";
       String password ="123456";

        try {
            //Veri tabanı bağlantı oluşturma,  getconnection hatalı gözükür more actions ile try cath içerisine al
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);

            //INSERT
            String insertSQL="INSERT INTO customers (customer=id,customer_name,contact_name,city,postal_code,country) VALUES(?,?,?,?,?,?)";
            PreparedStatement insertStatement= connection.prepareStatement(insertSQL);
            insertStatement.setInt(1,9999); //1. ? için 9999 değerini verdik.
            insertStatement.setString(2,"burak");
            insertStatement.setString(3,"akgöz");
            insertStatement.setString(4,"Emek");
            insertStatement.setString(5,"Eskişehir");
            insertStatement.setString(6,"26080");
            insertStatement.setString(7,"TR");
            int affectedRow= insertStatement.executeUpdate(); //DETELE , INSERT, UPDATE için executeUpdate. Bu adım sql'e veriyi yollar
            System.out.println("INSERT işlemi başarılı toplamda insert adedi"+affectedRow);
            connection.close();
            System.out.println();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}