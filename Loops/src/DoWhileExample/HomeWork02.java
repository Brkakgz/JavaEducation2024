package DoWhileExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("0'dan farklı sayı giriniz: ");
            number=scanner.nextInt();
        }
        while(number==0);
        //while sadece kontrol edip do ya gidip gitmeyeceğine karar veriyor
        System.out.println("Doğru girdiniz kapatılıyor...");
    }
}
