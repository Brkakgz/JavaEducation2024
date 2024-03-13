package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork11 {
    public static void main(String[] args) {
        //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
            Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Sayı Girmek İstiyorsunuz: ");
        int num1= scanner.nextInt();
        int sayac=0,sayac1=0,sayac2=0,sayac3=0;
            do {
                System.out.println("Sayı Giriniz: ");
                int num2= scanner.nextInt();
                if(num2>0)
                {
                    System.out.println(num2+" sayısı pozitiftir.");
                    sayac1++;
                }
                else if(num2==0)
                {
                    System.out.println(num2+" sayısı sıfıra eşittir.");
                    sayac2++;
                }
                else
                {
                    System.out.println(num2+" sayısı negatiftir.");
                    sayac3++;
                }

                    sayac++;
            }
            while(sayac<=num1);

        System.out.println("Pozitif girilen sayıların sayısı: "+sayac1);
        System.out.println("Sıfır girilen sayıların sayısı: "+sayac2);
        System.out.println("Negatif girilen sayıların sayısı: "+sayac3);
        
    }
}
