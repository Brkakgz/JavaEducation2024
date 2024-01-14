package VoidMethods;

import java.util.Scanner;

public class VoidMethodExample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Giriniz: ");
        String name = scanner.nextLine();
        sayHello(name); //buradaki name artık sayhello'da isim yerine geçiyor çünkü string isim yaptık
        //name isim'e gitti artık orada isim yerine tanımlandı ... name yerine 5 4 yazamazsın string bekliyor niye altta String isim olarak belirttik artık
        //SayHello(name) ifadesindeki name parametresini String isim parametresine eşitliyor olay bu yani
        // String isim = name yani

    }
    public static void sayHello(String isim){ // Parantez içindeki beni kim çağırıyorsa o bu değeriş versin kardeşim diyor e değer olmazsa boş kalırsa altttaki gibi kırmızı verir çünkü değer gelmemiş
       // System.out.println("Merhaba "+name); // Bak name hata verdi nie name sınırı main içinde burada name diye bir değişken yok
        System.out.println("Merhaba "+ isim);
    }
}
