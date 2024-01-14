package AccessSpecifiers;

public class DefaultMethodExample01 {
    public static void main(String[] args) {
    DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
    System.out.println(defaultMethodExample01.topla(6,8));
    }
    // defalut int topla(int number1, int number2){ kızarır başına default yazılmaz bo şbırakılrı
    //default asla farklı paketeen çağırılamaz, protected belli bir durumda olabilir ama default olmaz

    //PublicAccessSpecifiersExample01 classının 20. satırı normalde kırmızı görmek istediğim için açık bırakılmıştı ama yorum satırınca dönüştürünce o metoda gitmeyi bıraktı yorum satırını açarsan ne olacağını görür anlarsın
    //ProtectedAccessSpecifiersExample01 classının 6. satırı normalde kırmızı görmek istediğim için açık bırakılmıştı ama yorum satırınca dönüştürünce o metoda gitmeyi bıraktı yorum satırını açarsan ne olacağını görür anlarsın
    // Direkt bu ikisine gidiyordu aynı isimli metod tanımladığım için sanırım işlem önceliği oluyor
    int topla(int number1, int number2){

        return number1+number2;
    }
}
