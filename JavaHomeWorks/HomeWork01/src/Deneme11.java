import java.util.Scanner;

public class Deneme11 {
    public static void main(String[] args) {
        //0 girene kadar her girilen sayı için mükemmel sayı olup olmadığını bulan prog.
        Scanner scanner = new Scanner(System.in);
        int sayac=1,bolen=0;
        while(true)
        {
            bolen=0;
            System.out.println("Sayı giriniz: ");
            int num = scanner.nextInt();
            if(num==0)
            {
                break;
            }

            for(int i=1;i<num;i++) {
                if (num % sayac == 0) {
                    System.out.println("bölen :"+i);
                    bolen = bolen + i;
                }

            }
            if (bolen == num) {
                System.out.println("Sayınız mükemmel sayı");
            }
            else {
                System.out.println("Mükemmel değildir");
            }
        }

    }
}
