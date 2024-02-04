import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        //1'den n'e kadar olan tamsayıların toplamı

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaça kadar olan sayıları toplamak istiyorsun: ");
        int num= scanner.nextInt();
        int toplam=0;
        for(int i=0;i<=num;i++)
        {
            toplam+=i;
        }
        System.out.println(num+" sayısına kadar olan sayıların toplamı: " + toplam);
    }
}
