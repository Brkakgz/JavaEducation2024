package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {

customerDataInput(1,"burak","burak@gmail.com","turkey");
productDataInput(111,"kitap",99);
orderDataInput(1,111,1,2020);

    }
    public static void customerDataInput(int customers_id,String customers_name,String customers_mail,String customers_adress)
    {
        String insertCustomersSQL = "INSERT INTO customers (customers_id, customers_name, customers_mail, customers_adress) VALUES (?, ?, ?, ?)";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomersSQL)) {

            insertCustomerStatement.setInt(1, customers_id);
            insertCustomerStatement.setString(2, customers_name);
            insertCustomerStatement.setString(3, customers_mail);
            insertCustomerStatement.setString(4, customers_adress);
            int affectedRow = insertCustomerStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void productDataInput(int product_id,String product_name,double product_price){
        String insertCustomersSQL = "INSERT INTO products (product_id, product_name, product_price) VALUES (?, ?, ?)";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomersSQL)) {

            insertCustomerStatement.setInt(1, product_id);
            insertCustomerStatement.setString(2, product_name);
            insertCustomerStatement.setDouble(3, product_price);
            int affectedRow = insertCustomerStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void orderDataInput(int order_id,int product_id,int customer_id,int orderDate)
    {
        String insertCustomersSQL = "INSERT INTO orders (order_id,product_id,customer_id, orderDate) VALUES (?, ?, ?, ?)";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomersSQL)) {

            insertCustomerStatement.setInt(1, order_id);
            insertCustomerStatement.setInt(2, product_id);
            insertCustomerStatement.setInt(3, customer_id);
            insertCustomerStatement.setInt(4, orderDate);
            int affectedRow = insertCustomerStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
