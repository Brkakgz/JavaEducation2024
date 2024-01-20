public class HandlingExceptionExample01 {
    public static void main(String[] args) {
        int number1=5;
        // System.out.println("number1 /0 ="+(number1/0)); //0'a bölme hatası arithmeticexception hatası geldi ve gelince kopyaladık catch içine yaağıştırdık
        try{
            System.out.println("number1 /0 ="+(number1/0));
            System.out.println("Başarılı");
        }
        catch(ArithmeticException arithmeticException) //ikincisi hatayı içine tanımladık gibi
        {
            System.out.println("Catch arithmeticexception! description ->"+arithmeticException.getMessage()); // catch(1 2) içindeki sout içindeki 2+getmessage olarak yazıldı
        }
        catch(NullPointerException nullPointerException){
            System.out.println("catch nullpointexception! descriptoion->"+nullPointerException.getMessage());
        }
        catch(Exception exception){ // Tüm hataları bu kapsıyor ama özel hata yazdıramayız bak 2 hatav erdı tek bunu yazsan hangisi ? özel olarak belirtemeyiz
            System.out.println("catch exception! description->" +exception.getMessage());
        }
       /* catch(Exception xxx){
            System.out.println("yorum"+xxx.getMessage()); tarzındadır kalıp yani. Ayrıca Catch özelden genele gider ctrl + sol tık yap public class ArithmeticException extends RuntimeException bak runtime daha geneli altında arithmetic var
        }*/
        System.out.println("Uygulama Kapatılıyor...");
    }
}
