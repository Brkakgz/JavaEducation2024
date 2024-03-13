package Slayt6Link1;

public class JavaHomework14 {
    public static void main(String[] args) {

        int num1=0,num2=1,num3=0,sayac=0;
        while(sayac<10)
        {
            System.out.println(num1);
            num3=num1+num2;
            num2=num1;
            num1=num3;
            sayac++;
        }
    }
}
