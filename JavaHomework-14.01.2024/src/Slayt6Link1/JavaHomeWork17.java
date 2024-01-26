package Slayt6Link1;

import java.util.Random;
import java.util.Scanner;

public class JavaHomeWork17 {
    public static void main(String[] args) {
        //Write a program that generates a random number and asks the user to guess what the number is.
        // If the user's guess is higher than the random number, the program should display "Too high, try again."
        // If the user's guess is lower than the random number the program should display "Too low, try again."
        // The program should use a loop that repeats until the user correctly guesses the random number.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber= random.nextInt(500);
        System.out.println("Random sayımız: "+randomNumber); //bunu eklemezsek nasıl bulcaz 500 sayı arasından program test amacı ile yazıldı
        while(true)
        {
            System.out.println("Sayı Giriniz: ");
            int num= scanner.nextInt();
            if(num<randomNumber)
            {
                System.out.println("Sayınız Rastgele Üretilen Sayıdan Küçüktür Lütfen Tekrar Deneyiniz");
            }
            else if(num>randomNumber)
            {
                System.out.println("Sayınız Rastgele Üretilen Sayıdan Büyüktür Lütfen Tekrar Deneyiniz");
            }
            else
            {
                System.out.println("Rastgele Üretilen Sayıyı Buldunuz Tebrikler !!!");
                break;
            }
        }
    }
}
