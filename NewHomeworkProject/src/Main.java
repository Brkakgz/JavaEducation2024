import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* System.out.print("Girilen cümlenin kaç kez tekrarlansın: ");
        int loopTimes = scanner.nextInt();*/
        System.out.print("Kelimenizi giriniz: ");
        String sozcuk = scanner.next();
        System.out.print("Yeni sözcük ne kadar uzunlukta olsun: ");
        int sozcukSize = scanner.nextInt();
        int sayac=0,k=0;
       // String nihaiSozcuk=null;

        String sozcuk2 ="" ;
        while(true)
        {
            if(sozcuk2.length()<=sozcukSize) {
                //sozcuk2.charAt(k)=sozcuk.charAt(k);
                sozcuk2 = sozcuk2 + sozcuk;
            }
            else
            {
                break;
            }
            k++;
        }

        System.out.print("Fazlalığa Sahip Dizi Kontrolü: ");
        for (int i=0;i<sozcuk2.length();i++) {
            System.out.print(sozcuk2.charAt(i));
        }
        System.out.println("\n-------");
      /* for(int i=0;i<sinir;i++)
        {
           nihaiSozcuk.charAt(i)=sozcuk2.charAt(i);
        }*/

        System.out.print("İstenen Uzunlıktaki Dizi: ");
        for (int i=0;i<sozcukSize;i++) {
            System.out.print(sozcuk2.charAt(i));
        }
        System.out.println();

        for(int i=0;i<sozcukSize;i++)
        {
            if(sozcuk2.charAt(i)=='a' || sozcuk2.charAt(i)=='A') {
                sayac++;
            }

        }
        
        System.out.println(sayac+" tane a veya A harfi bulundu!");

    }
}