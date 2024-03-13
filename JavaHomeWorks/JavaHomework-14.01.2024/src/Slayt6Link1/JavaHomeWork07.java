package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork07 {
    public static void main(String[] args) {
        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Girmek İstiyorsunuz: ");
        int num = scanner.nextInt();
        int toplam1=0,toplam2=0;
        for(int i=1; i<=num;i++)
        {
            System.out.print("Sayınızı giriniz: ");
            int num2 = scanner.nextInt();
            if(num2%2==0)
            {
                System.out.println(num2+" sayısı çifttir");
                toplam1=num2+toplam1;
            }
            else
            {
                System.out.println(num2+" sayısı tektir");
                toplam2 = num2+toplam2;
            }
        }
        System.out.println("Çift Sayıların Toplamı: "+toplam1+"  /  Tek Sayıların Toplamı: "+toplam2);
    }
}
