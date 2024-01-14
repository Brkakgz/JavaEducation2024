package StaticMethods;

import java.util.Random;

public class StaticMethodsExample01 {
    public static void main(String[] args) {
        //static olana classınadı.nextInt yaparak ulaşabiliyorum mayh.max(3,5). static olmayana new yapıyorum örn scanner
        // direkt max yaparsan math'ı import etmen lazım. C++'ad kütüphane eklemek gibi galiba

        Random random= new Random();
        random.nextInt(50);
        //max(3,5); // Zaten kırmızı yapar import et diye
        Math.max(3,5);
        topla(5,10);
        StaticMethodsExample01.topla(5,10);

    }

    public static void topla(int number1,int number2) {
        System.out.println("toplam :"+(number1+number2));

    }
}
