public class OperantExample01 {
    public static void main(String[] args) {
        int number1=87, number2=13;
        boolean condition=true;

        //Ön arttırma ve azaltma operatörü (++a/--a)
        System.out.println("(number1) değeri: "+ number1+"\n(++number) değeri="+(++number1));
        //Ctrl+D olan satırı aşağı kopyalar
        System.out.println("(number2) değeri: "+ number2+"\n(++number2) değeri="+(--number2));
        System.out.println("____________");
        System.out.println("(number2) değeri: "+ number1+"\n(++number1) değeri="+(number1++));
        System.out.println("Number1 son değer="+number1);
        System.out.println("(number2) değeri: "+ number2+"\n(++number2) değeri="+(number2--)+ "number2 yeni hali"+(number2));
        System.out.println("Number2 son değer="+number2);
        //++number1 önce arttırır sonra kullanır, number1++ ise önce işler sonra arttırır 13. satırda daha iyi anlaşılıyor
        System.out.println("00000000000000000000");
        System.out.println("condition : " + condition);
        System.out.println("contidion neg : " +!condition);
        System.out.println("condition last : "+ condition);
        // Bu num++ gibi değildir o anda ters çevrilir kaydedilmez yani

        condition=!condition; //Ancak atama yaparsan değer kalıcı olur
        System.out.println("contidion reverse : "+ condition);

        System.out.println("+++++++++++");

        System.out.println("Num1:" +number1);
        System.out.println("Num2:" +number2);
        number1+=number2; //soldaki değere kendi değerini ekleyerek tekrar sola atar yani num1=num1+num2
        System.out.println("number1+=number2 değeri:"+number1);

        System.out.println("---------");

        System.out.println("Num1:" +number1);
        System.out.println("Num2:" +number2);
        number1-=number2; // number1=number1-number2;
        System.out.println("number1+=number2 değeri:"+number1);

        System.out.println("**********");

        System.out.println("Num1:" +number1);
        System.out.println("Num2:" +number2);
        number1*=number2; // number1=number1-number2;
        System.out.println("number1+=number2 değeri:"+number1);

        System.out.println("//////////////");

        System.out.println("Num1:" +number1);
        System.out.println("Num2:" +number2);
        number1/=number2; // number1=number1-number2; Burdaki halini pek görmezsin niye çünkü okunaklılığı az ama yapan var
        System.out.println("number1+=number2 değeri:"+number1);





    }
}
