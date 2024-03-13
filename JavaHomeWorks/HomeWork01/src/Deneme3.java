import java.util.Scanner;

public class Deneme3 {
    public static void main(String[] args) {
        //Girilen 2 sayıdan hangisinin daha küçük
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        double num1=scanner.nextDouble();
        System.out.println("2.sayıyı giriniz: ");
        double num2= scanner.nextDouble();

        if(num1<num2)
        {
            System.out.println("Num2 daha büyüktür");
        }
        else if (num2<num1) {
                System.out.println("Num1 daha büyüktür");
        }
        else {
            System.out.println("İkisi eşittir");
        }

    }
}
