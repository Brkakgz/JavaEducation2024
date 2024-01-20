import java.util.Scanner;

/**
 * Java Doc Comment Line
 * {@link Java_Doc.JavaDoc} linkledik mesela
 * burada bu classın ne yaptığı yazılır
 * @author akgoz //yazan kişi en başa yazılır genelde
 */
public class Main {

    /**
     * Scanner to get user's direction
     */
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/**
 *Burada bu metodun ne iş yaptığı
 * {@link #sayHello(String)} --- {}@link classadı(parametresi) süslü kapa   kapayınca hata veriyor çünkü tanımladığım şey yok anladın sen
 */
        System.out.println("Hello World!");
        Main main = new Main();
        main.sayHello("hasan");
    }

    /**
     *
     * @param name -> User's name
     */
    public void sayHello(String name){
        System.out.println("Hello"+name);
    }

    //Tools-->Generate JavaDoc... dediğimiz zaman bize html tarzında dökümantasyon oluşturur ki bunu / yıldız yıldız yaparak  yapıyoruz
}