package Slayt6Link2;

import java.util.Scanner;

public class JavaHomeWork04 {
    //Java Tek Sayı Yazdırma Örneği
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi Sayıya Kadar Tek Sayıları Bulmak İstiyorsunuz ?");
        int num1= scanner.nextInt();
        teksayi(num1);
    }
    protected static void teksayi(int num1){
        for(int i=1; i<=num1;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Tek Sayı: "+i);
            }
        }
    }
}
