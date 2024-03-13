import java.util.Random;

public class Deneme6 {
    public static void main(String[] args) {
        // 6 6 gelene kadar çalışan zar programı
        Random random = new Random();
        int sayac=0;
        do {
            int n1= random.nextInt(6)+1;
            int n2= random.nextInt(6)+1;
            sayac++;
            if(n1==6 && n2==6)
            {
                System.out.println(sayac+". durum için zar1: "+n1);
                System.out.println(sayac+". durum için zar2: "+n2);
                break;
            }
            else
            {
                System.out.println(sayac+". durum için zar1: "+n1);
                System.out.println(sayac+". durum için zar2: "+n2);
            }
        }
        while(true);
    }
    /*
     Random random = new Random();
       int zar1, zar2;
       int zarlarinAtisSayisi = 0;
       do {
           zar1 = random.nextInt(6) + 1;
           zar2 = random.nextInt(6) + 1;
           zarlarinAtisSayisi++;
           System.out.println("Atış " + zarlarinAtisSayisi + ": " + zar1 + " " + zar2);
       } while (zar1 != 6 || zar2 != 6);
       System.out.println("Zarların Toplam atış sayısı: " + zarlarinAtisSayisi);
     }
     //Burası ise zar1 ve zar2 6 6 olmadığı durumlarda çalıştırır
     */
}
