import java.util.Scanner;

public class IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Kullanıcı adınızı giriniz: ");
        String username=scanner.nextLine();

        System.out.println("Lütfen Şifrenizi Giriniz: ");
        String password=scanner.nextLine();

        System.out.println("merhaba");

        if(username.equals("burakakgöz") && password.equals("burak123"))
        {
            System.out.println("Başarılı, Yönlendiriliyorsunuz");
        }

        else
        {
            System.out.println("Bilgileriniz hatalıdır.");
        }
        
    }
}
