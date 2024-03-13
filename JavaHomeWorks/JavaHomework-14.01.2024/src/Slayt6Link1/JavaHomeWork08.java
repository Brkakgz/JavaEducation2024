package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork08 {
    public static void main(String[] args) {
        //Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sadece pozitif tam sayı giniz: ");
        int num1= scanner.nextInt();
        int bolme,sayac=0;
        while(num1<=0)
        {
            num1= scanner.nextInt();
            System.out.println("Yanlış sayı girişi!");
            System.out.println("Sadece pozitif tam sayı giniz!!! :");
        }
        for(int i=2;i<num1;i++)
        {
            bolme=num1%i;
            if(bolme==0)
            {
                sayac++;
            }
        }
        if(sayac>0)
        {
            System.out.println("Sayınız Asal Değildir");
        }
        else{
            System.out.println("Sayınız Asaldır");
        }
    }
}
