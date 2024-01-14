package VoidMethods;

public class VoidMethodExample04 {
    public static void main(String[] args) {
        int number1=3;
        int number2=5;
        String name="burak";
        sum(number1,number2,name,"aaa"); // direkt string ifade girip fonksiyon tanımlamasında string xd olarak tanımlarız

    }
    public static void sum(int num1, int num2,String name,String xd)
    {
        System.out.println("Merhaba: "+name+" iki sayının toplamı: "+(num1+num2)+" "+xd);
    }
}
