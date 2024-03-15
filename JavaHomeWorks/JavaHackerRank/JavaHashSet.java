package JavaHackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true

public class JavaHashSet {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet isim girmek istiyorsunuz: ");
        int nameNumber= scanner.nextInt();
        for(int i=0;i<nameNumber;i++) {
            String userNames = scanner.next(); //nextline yaptığım zaman direkt birinci elemanı boşluk olarak alıyor. next yaparsam da isimde boşluk bırakırsam hata veriyor
            names.add(userNames);
            System.out.println(names.size());
        }
        System.out.println(names);


    }
}
