import java.util.Scanner;

public class Algorithm01 {
    public static void main(String[] args) {
        int number2;
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner reader = new Scanner(System.in); //Scanner sınıfı zaten tanımlı(kütüphane)(classlar büyük haerfle başlar) kullanmak için tanımlıyoruz
        //Scanner'i kopyaladığımız için bazen tanımayabiliyor kendin yazınca alttan seçebilirsin import edemedi yani
        System.out.println("Birinci sayı giriniz:");
        int number=reader.nextInt();
        //kullanıcıdan number değişkeni için int türünde değer girilmesini sağladı
        System.out.println("Girilen birinci sayı:"+number);

        System.out.println("İkinci sayıyı giriniz");
        number2 = reader.nextInt(); //next sana bir değer gelecek int bu değer int olarak gelecek demek

        int toplam=number+number2;

        System.out.println("Girilen ikinci sayı:"+ number2);
        System.out.println("İki sayının toplamı:"+ number+number2);
        //Burda string ile başladığımız için + yanyana ekle gibi anlıyor +(number+number2) yaparsan toplama yapar
        System.out.println("İki sayının toplamı:"+ (number+number2)); // toplam değerine atamayıp bu şekilde yaparsak bu toplanan değer burda kalır
        System.out.println(toplam);
    }
}
