package ReturnMethods;

public class ReturnMethodsExample01 {
    public static void main(String[] args) {

        int toplam = topla(3,5);
        System.out.println("Toplamının karesinin iki katı: "+((toplam*toplam)*2)); // Bak burada değeri çarptırdık kares,n, aldık kullandık yani

    }
   //public returnType methodName()
    public static int topla(int number1, int number2){ // nasıl geri döneceğini int olarak söylüyoruz bu fonksiyon int tipinde veri döndrür
        //System.out.println("toplam: "+ (number1+number2)); // sadece bu satırı yazarsan hata verir döndürecek değer yok der
        return number1+number2; // return komutunu gördüğünde çağırıldığı yere döner yani 7. satır
        //buradan gelecek sonuç ile tekrar iş yapacaksam return metod kullanacaksın. yoksa sonuç burada kalır.
    }
}
