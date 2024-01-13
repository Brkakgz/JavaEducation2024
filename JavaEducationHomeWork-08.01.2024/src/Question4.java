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

//Bu biraz problemli bunun asalmi bool kullanmayı hatırla sadece
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int number = scanner.nextInt();
        int sayac = 2;
        boolean asalMi = true;
        do {
            if (number % sayac == 0 && number!=sayac) { //number!=sayac kendisi hariç için
                asalMi = false;
            }
            sayac++;
        }
            while (sayac < number) ; // while(asalMi && number !=2) bu tüm sayıları kontol etmez direkt bölünürse hemen çıkar

            if (asalMi) {
                System.out.println("girdiğiniz " + number + " asaldır");
            }
            else{
                System.out.println("girdiğiniz "+number +" asal değildir");
            }
*/
    }
}
