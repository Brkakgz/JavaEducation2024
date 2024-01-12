import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı girişi alan ve bu sayının asal olup olmadığını kontrol eden bir do-while döngüsü ile
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.println("Sayı Giriniz: ");
        num1=scan.nextInt();
        int i=2,sayac=0;
        do {
           if(num1%i==0 && num1!=2) {
               sayac++;
           }
           i++;
        }
        while(i<num1);
        if(sayac==0)
        {
            System.out.println("Sayınız Asaldır");
        }
        else{
            System.out.println("Sayınız Asal Değildir");
        }
    }
}
