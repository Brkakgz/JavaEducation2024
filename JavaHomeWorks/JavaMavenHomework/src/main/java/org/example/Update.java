package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı için 1, Mail için 2, Adres için 3 giriniz: ");
        int choose = scanner.nextInt();
        if (choose ==1) {
            String updateSql = "UPDATE customers SET customer_name =? WHERE customer_id=?";
            try {
                Connection connection = dbConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
                preparedStatement.setString(1, "mehmet");//customer name olarak artık mehmet'i alıyor
                preparedStatement.setInt(2, 1); // 2. soru işareti yerine artık ID ->1 olan kişiyi
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("UPDATE işleminden etkilenen satır(row) sayısı : " + affectedRows);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        else if (choose ==2)
        { String updateSql = "update customers set first_name =? where customer_id=?";
            try {
                Connection connection = dbConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
                preparedStatement.setString(2, "mehmet@gmail.com");
                preparedStatement.setInt(2, 1);
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("UPDATE işleminden etkilenen satır(row) sayısı : " + affectedRows);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        else if (choose ==3)
        {
            String updateSql = "update customers set first_name =? where customer_id=?";
            try {
                Connection connection = dbConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
                preparedStatement.setString(1, "japan");
                preparedStatement.setInt(2, 1);
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("UPDATE işleminden etkilenen satır(row) sayısı : " + affectedRows);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        else
            System.out.println("Yanlış giriş!");
    }

    }
