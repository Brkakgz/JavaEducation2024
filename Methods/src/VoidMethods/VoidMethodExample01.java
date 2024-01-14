package VoidMethods;

import java.util.Random;

public class VoidMethodExample01 {
    public static void main(String[] args) {
      //Void değer döndürmesi yapmaz gideceği bir yer yoktur anlamına gelir
        //Metod içinde metod olmaz,Class içinde birden fazla metod tanımlanır.
        //Metodlar çağrıldığında kullanılır !!!
        System.out.println("Uygulama Çalışıyor.");
        sayHello();
        // int a = sayHello(); yapamazsın çünkü o bir void senin beklediğin bir int
        System.out.println("Uygulama Kapatılıyor!!!...");

    }
    public static void sayHello(){
        // Ne yapıyorsan void içinde yapar başka yere dönmez. PArametre dönmesi yapmaz yani.

        System.out.println("Hoş geldiniz...!");
    }
}