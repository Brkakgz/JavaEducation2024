package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork03 {
    public static void main(String[] args) {
        //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        int num1;
        System.out.print("Lütfen Pozitif Sayı giriniz: ");
        do {
            num1 = scanner.nextInt();
            if (num1 > 0) {
                control = false;
            }
            else{
                System.out.print("Yanlış Sayı Girdiniz Lütfen Pozitif Sayı Giriniz! : ");
            }
        }
        while (control);

        for (int i = 1; i <= num1; i++) {
            System.out.println(i + " * "+num1+"=" + (num1*i));
        }
    }
}
