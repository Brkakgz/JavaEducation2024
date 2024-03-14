package JavaHackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet isim girmek istiyorsunuz: ");
        int nameNumber= scanner.nextInt();
        for(int i=0;i<nameNumber;i++) {
            String userNames = scanner.nextLine();
            names.add(userNames);
            System.out.println(names.size());
        }
        System.out.println(names);


    }
}
