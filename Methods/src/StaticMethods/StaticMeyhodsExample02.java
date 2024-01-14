package StaticMethods;

import java.util.Random;

public class StaticMeyhodsExample02 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);
        StaticMeyhodsExample02 myClass = new StaticMeyhodsExample02();
        myClass.topla(5,10);
    }
    public  void topla(int number1, int number2) {
        System.out.println("toplam :"+(number1+number2));

    }
}

