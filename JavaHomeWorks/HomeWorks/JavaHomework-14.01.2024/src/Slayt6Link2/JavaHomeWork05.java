package Slayt6Link2;

import java.util.Scanner;

public class JavaHomeWork05 {
    public static void main(String[] args) {

        //Java Klavyeden Girilen 10 Sayının Toplamını Yazdıran Program
        Scanner scanner = new Scanner(System.in);
        int toplam=0,i=1;
        while(true)
        {

            System.out.println(i+". Sayıyı giriniz");
            int num1 = scanner.nextInt();
            toplam=toplam+num1;
            i++;
            if(i>10){
                break;
            }
        }
        System.out.println("Toplam: "+toplam);
    }

}
