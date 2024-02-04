import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir pozitif tam sayının faktöriyelini hesaplayan bir while döngüsü yazın.
        Scanner scan = new Scanner(System.in);
        int number1,factorial = 1;
        System.out.print("Pozitif Sayı Giriniz :");
        number1 = scan.nextInt();
        if(number1<=0)
        {
            System.out.println("Potizitif olmalıdır Program Kapatılıyor ...");
            return;
        }
        for(int i=1;i<=number1;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Faktöriyel="+ factorial);
    }
}