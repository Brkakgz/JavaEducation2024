package HomeWorkArrayListnMap;

import java.util.HashMap;
import java.util.Scanner;

public class MapHomeWork {
    /*
    Bir Map oluşturun ve bu mape 5 farklı anahtar-değer çifti ekleyin. Örneğin, öğrenci adları ve notları gibi çiftler kullanabilirsiniz.
Map'in boyutunu ekrana yazdırın.
Map'in tüm anahtar-değer çiftlerini ekrana yazdırın.
Kullanıcıdan bir anahtar girmesini isteyin ve bu anahtarın karşılık gelen değerini ekrana yazdırın.
Kullanıcıdan yeni bir anahtar ve değer çifti girmesini isteyin ve bu çifti mape ekleyin.
Map'in tüm anahtarlarını ekrana yazdırın.
Kullanıcıdan bir değer girmesini isteyin ve bu değerin Map içinde bulunan kaç farklı anahtarla ilişkilendiğini bulun ve ekrana yazdırın.
Map'ten bir anahtarın değerini güncelleyin.
Map'ten bir anahtarı silin ve güncellenmiş Map'i ekrana yazdırın.
Map'i temizleyin (tüm anahtar-değer çiftlerini silin) ve boş Map durumunu ekrana yazdırın.
Kullanıcıdan yeni anahtar-değer çiftleri eklemesini isteyin ve bu çiftleri mape ekleyerek sonucu ekrana yazdırın.
     */

    public static void main(String[] args) {
        HashMap<Integer, String> city = new HashMap<>();

        city.put(26,"Eskişehir");
        city.put(07,"Antalya");
        city.put(25,"Erzurum");
        city.put(01,"Adana");
        city.put(06,"Ankara");
        System.out.println("Hashmap boyutu: "+city.size());
        System.out.println("Hashmap: "+city);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anahtar Değer giriniz: ");
        int keyNumber= scanner.nextInt();
        String cites =city.get(keyNumber);
        System.out.println("İstenen Anahtara Karşılık gelen değer: "+city.get(keyNumber));

        System.out.println("Eklemek istediğiniz değeri giriniz: ");
        String addValue1 = scanner.next(); // Nextline dersek sonraki satıra geçip değeri boş yapıyor next dersek boşlukjlu değer kabul etmiyor
        System.out.println("Eklemek istediğiniz anahtarı  giriniz: ");
        int addKeyNumber =scanner.nextInt();

        city.put(addKeyNumber,addValue1);
        System.out.println("Yeni anahtar değer çifti eklenmiş Hashmap: "+city);

        System.out.println("Aramak istediğiniz key değerini giriniz: ");
        int keyNumber2= scanner.nextInt();
        int sayac=0;

        for (Integer key : city.keySet()) {
            if(key==keyNumber2)
            {
                sayac++;
            }
        }
        System.out.println(sayac+" tane key değeri bulundu");

        System.out.println("1 Key değeri silindi");
        city.remove(1);
        city.replace(6,"DEĞİŞTİRİLDİ");
        System.out.println("Değiştirilen Hashmap: "+city);
        city.clear();
        System.out.println("Tümü Silinen Hashmap: "+city);

        System.out.println("Kaç adet anahtar değer girmek istiyorsun ?");
        int number2= scanner.nextInt();
        for(int i=0;i<number2;i++)
        {
            System.out.println("Eklemek istediğiniz değeri giriniz: ");
            String addValue2 = scanner.next();
            System.out.println("Eklemek istediğiniz anahtarı  giriniz: ");
            int addKeyNumber2 =scanner.nextInt();

            city.put(addKeyNumber2,addValue2);
        }
        System.out.println("Yeniden Değer Girilen HashMap: "+city);
    }
}
