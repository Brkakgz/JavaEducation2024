package StaticMethods;

import java.util.Scanner;

public class StaticMethodsExample03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //sayHello();
        sayHello2();
    }

    public static void sayHello2(){
       // scanner.nextInt(); //Static olunca hemen tanımlar çünkü static hemen devrede bellekte

    }
    public void sayHello(){
       // scanner.nextInt();
        System.out.println("Hello");
    }
}
