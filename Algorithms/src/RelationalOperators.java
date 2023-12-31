public class RelationalOperators {
    public static void main(String[] args) {

        int number1=5;
        int number2=3;

        //System.out.println("number1>number2:"+(number1>number2)); alttaki ile aynıdır
        boolean greater=number1>number2;
        System.out.println("number1>number2:"+greater);
        System.out.println("number1<number2:"+!(number1<number2));
        System.out.println("number1<=number2:"+(number1<=number2));
        System.out.println("number1>=number2:"+(number1>=number2)); //num1 num2'den büyük eşit mi ?
        System.out.println("number1==number2:"+(number1==number2)); //num1 num2'ye eşit mi ?
        System.out.println("number1!=number2:"+(number1!=number2)); //num1 num2''den farklı mı ?
    }
}
