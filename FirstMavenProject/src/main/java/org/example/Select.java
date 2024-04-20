package org.example;

import java.sql.*;

public class Select {
    public static void main(String[] args) {
        String jdbcUrl="jdbc:postgresql://localhost:5432/firstDB";
        String username="postgres";
        String password ="123456";

        try {
            //Veri tabanı bağlantı oluşturma
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);

            //Select işlemi
            String selectSQL="SELECT *FROM customers";
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = selectStatement.executeQuery(); //SELECT
            while(resultSet.next())
            {
                //DB'den sonuçları al
                int customerId=resultSet.getInt("customer_id"); //db'den gelen customer id adındaki değeri customerId'ye ata
                String customerName=resultSet.getString("customer_name");//db'den gelen customer_name sütunundaki değeri custonerName'ye atar

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
