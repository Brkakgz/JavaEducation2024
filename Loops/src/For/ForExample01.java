package For;

import java.sql.SQLOutput;

public class ForExample01 {
    public static void main(String[] args) {

        /*
        for(initialize;condition;increment/decrement){code}
        * */
        int sayi;//burada sayıya değer verip for(;sayi<=5;sayi++) olabilir
        for(sayi=1;sayi<=5;sayi++)
        {
            System.out.println("Merhaba : "+sayi+".");
        }
        System.out.println("Döngü Bitti  Döngü "+sayi+ "kez çalıştı");
    }
}
