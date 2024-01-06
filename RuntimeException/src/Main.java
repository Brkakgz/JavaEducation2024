import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     System.out.println("Birinci sayiyi giriniz: ");
     int number1=scanner.nextInt();

     System.out.println("number1:"+ number1);
     //Uygulama hata görünmezken hata verme olayıdır. Mesela sayı yerine karakter girersek hata alırız runtimeexception

    }

}
