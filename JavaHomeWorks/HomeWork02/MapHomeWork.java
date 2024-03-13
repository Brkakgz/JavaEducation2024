package HomeWork02;

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
        System.out.println("Eklemek istediğiniz anahtarı  giriniz: ");
        int addKeyNumber =scanner.nextInt();
        System.out.println("Eklemek istediğiniz değeri giriniz: ");
        String addValue1 = scanner.nextLine();
        city.put(addKeyNumber,addValue1);
        System.out.println("Yeni anahtar değer çifti eklenmiş Hashmap: "+city);

    }
}
