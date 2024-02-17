package Polymorphism.polymorphism_examples01;

public class PolymorphismExample01 {
    public static int topla (int number1, int number2)
    {
        return number1+number2;
    }
    public static int topla (int number1, int number2, int number3)
    {
        return number1+number2+number3;
    }
    public static double topla (double number1, int number2)
    {
        System.out.println("Sen misin ?");
        return number1+number2;
    }
    public static double topla (int number1, double number2)
    {
        return number1+number2;
    }
    public static long topla (long number1, long number2)
    {
        return number1+number2;
    }
}
