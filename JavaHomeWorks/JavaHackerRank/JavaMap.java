package JavaHackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    //https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
    public static void main(String[] args) {
        HashMap<String,Integer> phoneNumbers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Adet Numara Tanımlamak istiyorsunuz: ");
        int numberOfPhone = scanner.nextInt();
        for (int i=0;i<numberOfPhone;i++)
        {
            System.out.print("İsim: ");
            String numberName= scanner.next();
            System.out.println("Numara: ");
            int phoneNumber = scanner.nextInt();
            phoneNumbers.put(numberName,phoneNumber);
        }
        System.out.println(phoneNumbers);

        System.out.println("Kaç Adet Numara Aramak İstiyorsunuz: ");
        int numberCounter = scanner.nextInt();

        for(int i=0;i<=numberCounter;i++) {
            System.out.println(i+". Aramak istediğiniz adı giriniz: ");
            String searchingNumbers = scanner.next();
            if(phoneNumbers.get(searchingNumbers) == null)
            {
                System.out.println("Kişi Bulunamadı");
            }
            else
                System.out.println(phoneNumbers.get(searchingNumbers));
        }
    }

}


