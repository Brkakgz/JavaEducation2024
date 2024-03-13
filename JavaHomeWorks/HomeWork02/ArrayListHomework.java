package HomeWork02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListHomework {
    /*
    Bir ArrayList oluşturun ve bu listeye 5 farklı öğe ekleyin.
ArrayList'in boyutunu ekrana yazdırın.
ArrayList'in tüm elemanlarını ekrana yazdırın.
ArrayList'e kullanıcıdan bir eleman eklemesini isteyin ve bu elemanı listenin sonuna ekleyin.
ArrayList'in tüm elemanlarını tekrar ekrana yazdırın.
Kullanıcıdan bir indeks değeri girmesini isteyin ve bu indeksteki elemanı ekrana yazdırın.
Kullanıcıdan bir eleman girmesini isteyin ve bu elemanın ArrayList'te kaç defa geçtiğini bulun ve ekrana yazdırın.
ArrayList'in tamamını sıralayın ve sıralı listeyi ekrana yazdırın.
ArrayList'i temizleyin (tüm elemanları silin) ve boş liste durumunu ekrana yazdırın.
Kullanıcıdan yeni elemanlar eklemesini isteyin ve bu elemanları ArrayList'e ekleyerek sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(-99);
        arrayList1.add(0);
        arrayList1.add(125);
        arrayList1.add(-1);
        System.out.println("ArrayList1 Boyutu: " + arrayList1.size());
        System.out.println("ArrayList1 Elemanları: " + arrayList1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eklemek istediğiniz sayıyı giriniz: ");
        int number = scanner.nextInt();
        arrayList1.add(number);
        System.out.println("ArrayList1 Güncellenmiş Elemanları: " + arrayList1);
        System.out.print("Lütfen 1 ile 6 arasında seçim yapınız: ");
        int indexNumber = scanner.nextInt();
        indexNumber = indexNumber - 1;
        System.out.println("Seçtiğiniz indexteki sayı: " + arrayList1.get(indexNumber));
        System.out.println("Bulmak istediğiniz sayıyı giriniz: ");
        int number2 = scanner.nextInt();
        int sayac = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) == number2) {
                sayac++;
            }
        }
        System.out.println("Aradığınız " + number2 + " sayısı " + sayac + " tane bulunmuştur");

        Collections.sort(arrayList1); //Sıralama yapmak için
        System.out.println("ArrayList1 Sıralanmış Elemanları: " + arrayList1);
        arrayList1.clear();
        System.out.println("ArrayList1 Temizlenmiş Elemanları: " + arrayList1);
        System.out.println("ArrayList1'e kaç adet eleman eklemek istiyorsunuz: ");
        int number3 = scanner.nextInt();
        for (int i = 0; i < number3; i++) {
            System.out.print("Sayı ekleyiniz: ");
            int number4 = scanner.nextInt();
            arrayList1.add(number4);
        }
        System.out.println("ArrayList1'e Kullanıcıdan Girilen Sayıların Eklenmiş Versiyonu: " + arrayList1);


    }
}
