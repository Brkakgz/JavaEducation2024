package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork16 {
    public static void main(String[] args) {
        //Compute the natural logarithm of 2, by adding up to n terms in the series
        //1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
        //where n is a positive integer and input by user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int num= scanner.nextInt();
        double toplam=0;

        for(double i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                toplam=toplam-(1/i);
            }
            else{
                toplam=toplam+(1/i);
            }
        }
        System.out.println("Toplam: "+toplam);
    }
}
