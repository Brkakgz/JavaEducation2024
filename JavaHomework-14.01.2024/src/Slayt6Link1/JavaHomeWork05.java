package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork05 {
    public static void main(String[] args) {
        //Two numbers are entered through the keyboard.
        // Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

        Scanner scanner = new Scanner(System.in);
        int power=1;
        System.out.print("Sayıyı giriniz: ");
        int num1= scanner.nextInt();
        System.out.print("Girdiğiniz sayının üssünü giriniz: ");
        int num2 = scanner.nextInt();
        for (int i=1;i<=num2;i++)
        {
            power = num1*power;
        }
        System.out.println("Sonuç: "+power);
    }
}
