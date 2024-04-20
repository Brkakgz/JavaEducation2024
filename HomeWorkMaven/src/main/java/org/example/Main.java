package org.example;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws
            IOException {

        Scanner scanner = new Scanner(System.in);

        //Daha önceden oluşturduğum Cars adındaki db'ye cars adında tablo oluşturdum
        /*
        CREATE TABLE cars (
                    ID INT PRIMARY KEY ,
                    brand VARCHAR(255) NOT NULL,
                    model VARCHAR(255) NOT NULL,
                    year INT NOT NULL,
                    fuelType VARCHAR(255),
                    engineSize DOUBLE PRECISION );
         */

        //Cars adındaki db'ye bağlanıyoruz
        String jdbcUrl="jdbc:postgresql://localhost:5432/Cars";
        String username="postgres";
        String password ="123456";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);

            System.out.println("Kaç adet veri girişi yapacaksınız: ");
            int number= scanner.nextInt();
            String insertSQL="INSERT INTO cars (ID,brand,model,year,fuelType,engineSize) VALUES(?,?,?,?,?,?)";
            PreparedStatement insertStatement= connection.prepareStatement(insertSQL);
            for (int i=1;i<=number;i++)
            {

                insertStatement.setInt(1,i);
                System.out.println("Marka giriniz: ");
                String brand = scanner.next();
                insertStatement.setString(2,brand);
                System.out.println("Model giriniz: ");
                String model = scanner.next();
                insertStatement.setString(3,model);
                System.out.println("Yılını giriniz: ");
                int year = scanner.nextInt();
                insertStatement.setInt(4,year);
                System.out.println("Yakıt Tipi giriniz: ");
                String fuelType = scanner.next();
                insertStatement.setString(5,fuelType);
                System.out.println("Motor Gücünü giriniz: ");
                double engineSize = scanner.nextDouble();
                insertStatement.setDouble(6,engineSize);
                int affectedRow= insertStatement.executeUpdate(); //DETELE , INSERT, UPDATE için executeUpdate. Bu adım sql'e veriyi yollar
                System.out.println("INSERT işlemi başarılı toplamda insert adedi"+affectedRow);
            }
            //INSERT
//            insertStatement.setInt(1,1);
//            insertStatement.setString(2,"Audi");
//            insertStatement.setString(3,"A6");
//            insertStatement.setInt(4,2020);
//            insertStatement.setString(5,"Diesel");
//            insertStatement.setDouble(6,2.0);
//            insertStatement.setInt(1,2);
//            insertStatement.setString(2,"Audi");
//            insertStatement.setString(3,"A3");
//            insertStatement.setInt(4,2019);
//            insertStatement.setString(5,"Gasoline");
//            insertStatement.setDouble(6,3.0);
//            insertStatement.setInt(1,3);
//            insertStatement.setString(2,"Fiat");
//            insertStatement.setString(3,"Egea");
//            insertStatement.setInt(4,2020);
//            insertStatement.setString(5,"Diesel");
//            insertStatement.setDouble(6,1.4);
//            insertStatement.setInt(1,4);
//            insertStatement.setString(2,"Volkswagen");
//            insertStatement.setString(3,"Polo");
//            insertStatement.setInt(4,2024);
//            insertStatement.setString(5,"Gasoline");
//            insertStatement.setDouble(6,1.0);

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            //Veri tabanı bağlantı oluşturma
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);

            //Select işlemi
            String selectSQL="SELECT * FROM cars";
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = selectStatement.executeQuery(); //SELECT
            PrintWriter pw = new PrintWriter("cars.txt");
            while(resultSet.next())
            {

                //DB'den sonuçları al
                int Id = resultSet.getInt("ID");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                String fuelType = resultSet.getString("fuelType");
                int year = resultSet.getInt("year");
                double engineSize = resultSet.getDouble("engineSize");



                    pw.println(Id);
                    pw.println(brand);
                    pw.println(model);
                    pw.println(fuelType);
                    pw.println(year);
                    pw.println(engineSize);
                    pw.println("-----");


//                  System.out.println("Id : " + Id);
//                  System.out.println("Brand : " + brand);
//                  System.out.println("Model : " + model);
//                  System.out.println("Year : " + year);
//                  System.out.println("Fuel Type: " + fuelType);
//                  System.out.println("Engine Size: "+ engineSize);
            }
            pw.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        FileReader fr = new FileReader("cars.txt");
//        BufferedReader br = new BufferedReader(fr);
//        String data = null;
//        while((data = br.readLine()) != null) {
//            System.out.println(data);
//        }
//        fr.close();
//        br.close();

    }

}