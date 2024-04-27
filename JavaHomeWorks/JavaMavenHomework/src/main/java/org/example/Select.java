package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) {
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        String selectSQL = "SELECT * FROM orders INNER JOIN customers ON orders.customer_id=customers.customers_id INNER JOIN products ON orders.product_id=products.product_id";
        //veritabanı bağlantı oluşturma
        try(Connection connection = dbConnection.getConnection();
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL)) {
            //SELECT işlemi
            ResultSet resultSet = selectStatement.executeQuery(); //SELECT

            while(resultSet.next()) {
                //Db'den gelen sonuçları al
                int orderId = resultSet.getInt("order_id");
                String customersName = resultSet.getString("customers_name");
                String productName = resultSet.getString("product_name");
                String orderDate = resultSet.getString("orderdate");

                System.out.println("order_id : " + orderId);
                System.out.println("customer_name : " + customersName);
                System.out.println("product_name : " + productName);
                System.out.println("order_date: "+orderDate);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
