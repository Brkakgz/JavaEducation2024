package JavaHackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Adet Sayı Girmek İstiyorsunuz : ");
        int numberUser = scanner.nextInt();
        for (int i=0;i<numberUser;i++)
        {
            System.out.println("Sayı giriniz: ");
            int numberChoice = scanner.nextInt();
            numbers.add(numberChoice);
        }

        System.out.println("Eklemek istediğiniz sayı: ");
        int numberUser2= scanner.nextInt();
        System.out.println("Hangi indexe eklemek istersiniz: ");
        int addIndexNumber = scanner.nextInt();

        numbers.add(addIndexNumber,numberUser2);
        System.out.println(numbers);
        
        System.out.println("Kaç Adet Sayı Silmek İstiyorsunuz : ");
        int numberOfDeleteNumber= scanner.nextInt();
        for (int ii=0;ii<numberOfDeleteNumber;ii++) {
            System.out.println("Hangi indexteki sayıyı silmek istersiniz: ");
            int removeIndexNumber = scanner.nextInt();
            numbers.remove(removeIndexNumber);
        }
        System.out.println(numbers);
    }
}
