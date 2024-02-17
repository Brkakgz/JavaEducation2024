package Polymorphism.polymorphism_examples01;

public class main {
    public static void main(String[] args) {

        PolymorphismExample01.topla(5.0,3); // Double , int olan overloaded metodun veri türünü bulur onu kullanır ki girip oraya sen misin diye satır ekledik.
        PolymorphismExample01.topla(3.0,4);
        PolymorphismExample01.topla(3,5); // Main fonksiyonunda int int olanı kapatırsak bu sefer hata vermez neden long long int'i kapsar o yüzden ona bakar onu alır.
        //long long da yoksa double double
    }
}
