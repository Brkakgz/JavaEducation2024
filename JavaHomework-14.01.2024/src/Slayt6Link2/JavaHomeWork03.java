package Slayt6Link2;

import java.util.Scanner;

public class JavaHomeWork03 {
    //Faktöriyel Hesaplama Programı Java
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi Sayının Faktöriyeli Alınacak: ");
        int num1= scanner.nextInt();
        int sonuc = 0;
        sonuc= factorial(num1);
        System.out.println("Faktöriyel: "+sonuc);
    }
    public static int factorial(int num1){
        int carpim=1;
        for(int i=1;i<=num1;i++){
            carpim=carpim*i;
        }
        return carpim;
    }
}
