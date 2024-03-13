package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork12 {
    public static void main(String[] args) {
        //Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Adet Sayı İstediğinizi Giriniz: ");
        int num1= scanner.nextInt();
        int sayac=0,enk=0,enb=0;
        do {
            System.out.println("Sayı giriniz: ");
            int num2= scanner.nextInt();




            sayac++;
        }
        while(sayac<=num1);
        System.out.println("enk: "+enk);
        System.out.println("enb: "+enb);
    }
}
