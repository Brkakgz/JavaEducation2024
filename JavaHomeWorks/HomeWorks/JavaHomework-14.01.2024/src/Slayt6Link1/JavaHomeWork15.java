package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork15 {
    public static void main(String[] args) {
        //Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int num= scanner.nextInt();
        double toplam=0;
        for(double i=1;i<=num;i++)
        {
            toplam=toplam+(1/i);
        }
        System.out.println("Toplamı: "+toplam);
    }
}
