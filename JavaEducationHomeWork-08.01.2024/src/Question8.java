import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir sayının asal çarpanlarını bulan bir do-while döngüsü içeren bir Java programı nasıl yazılır?
        Scanner scanner = new Scanner(System.in);
        int number,sayac=2;
        System.out.println("Sayınızı giriniz: ");
        number = scanner.nextInt();
        if(number<=0)
            return;

        do {
            while(number%sayac ==0)
            {
                System.out.println("bolen: "+ sayac);
                number/=sayac;
            }
            sayac++;
            if (number%sayac==0)
            {
                System.out.println(sayac+"asal bölendir");
            }

        }
        while(sayac<number);
    }
}
