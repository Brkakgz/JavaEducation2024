public class VariableExample01 {
    public static void main(String[] args) {
        //Class olmalı public class VariableExcamples01
        //Run yapılması için psvm lazım

        //veritipi değişken adı
        int intNumber; //int-> veri tipi , intNumber değişken
        long longNumber; // int ile aynıdır int4 long8 byte yer tutar
        byte byteNumber=127; //128'e kadar olan sayıları alabilir
        short shortNumber=555;
        float floatNumber = 2.3456f; // Data db'den geliyorsa f gerek yok
        double doubleNumber = 18.5624d; //float ile aynı sadece float 4byte double 8byte'lık yer tutar
        // char charExample="K"; çift tırnak string yapar
        char charExample='K'; // tek tırnak yapmalıyız
        String name = "Burak"; // Tek tırnak char tanımlamasında çift tırnak string ifade tanımlamasında kullanılır
        //String ve array haricinde primitive veri tipi olarak geçer
        //küçük harfli olanlar primitive denilebilir
        // Long longNumber=56456; gibi bu artık primitive olmaktan çıkar

        int number1=5;
        long toplam = 5+3;

        boolean isHigher = number1>1;
        System.out.println("isHigher:"+isHigher);
        if (isHigher) // if içine işlem yaptıramazsın içinde true yada false çıkacak veya çıkmış ifade lazım
        {
            System.out.println("Büyüktür");
        }

        System.out.println("İşlem Bitiyor");
        //Burda number1=5 tanımladık number1>1 evet yada hayır dedi sonra büyük mü evet yazdı sonra if tru olunca büyüktür yazdı en son işlem bitiyor dedi. False olsa False işlem bitiyor yazardı





    }
}
