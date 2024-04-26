package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {

customerDataInput(1,"burak","burak@gmail.com","turkey");
productDataInput(111,"kitap",99);
orderDataInput(1,"kitap","burak@gmail.com",2020);

    }
    public static void customerDataInput(int customer_id,String customer_name,String customer_mail,String customer_adress)
    {
        String insertCustomersSQL = "INSERT INTO customers (customer_id, customer_name, customer_mail, customer_adress) VALUES (?, ?, ?, ?)";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomersSQL)) {

            insertCustomerStatement.setInt(1, customer_id);
            insertCustomerStatement.setString(2, customer_name);
            insertCustomerStatement.setString(3, customer_mail);
            insertCustomerStatement.setString(4, customer_adress);
            int affectedRow = insertCustomerStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void productDataInput(int product_id,String product_name,double product_price){
        String insertCustomersSQL = "INSERT INTO customers (customer_id, customer_name, customer_mail, customer_adress) VALUES (?, ?, ?, ?)";
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
    public static void orderDataInput(int order_id,String product_name,String customer_mail,int orderDate)
    {
        String insertCustomersSQL = "INSERT INTO customers (order_id,product_name,customer_id, orderDate) VALUES (?, ?, ?, ?)";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertCustomerStatement = connection.prepareStatement(insertCustomersSQL)) {

            insertCustomerStatement.setInt(1, order_id);
            insertCustomerStatement.setString(2, product_name);
            insertCustomerStatement.setString(3, customer_mail);
            insertCustomerStatement.setInt(4, orderDate);
            int affectedRow = insertCustomerStatement.executeUpdate();
            System.out.println("INSER işlemi başarılı toplamda insert adedi : " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
