package Slayt6Link1;

import java.util.Scanner;

public class JavaHomeWork09 {
    public static void main(String[] args) {
        //Write a program to calculate HCF of Two given number.(ebob)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int num1= scanner.nextInt();
        System.out.println("İkinci Sayıyı giriniz: ");
        int num2 = scanner.nextInt();
        int bolme1=0,bolme2=0,sonuc=1;
 //       if(num1<=num2)
//        {
//            int bigNum=num2;
//        }
//        else {
//            int bigNum=num1;
//        }
        for (int i=2;i<=1000;i++) //buraya i<=bignum yazacaktım ama olmadı :D hata verdi
        {
            //bolme1=num1%i;
            //bolme2=num2%i;
            if (num1 % i==0 && num2 % i==0) {
                while (true) {

                        sonuc = i * sonuc;
                        num1 = num1 / i;
                        num2 = num2 / i;

                        if (num1 % i != 0 || num2 % i != 0)
                        {
                            break;
                        }
                }
            }

        }
        System.out.println("Ebob: "+sonuc);
    }
}
