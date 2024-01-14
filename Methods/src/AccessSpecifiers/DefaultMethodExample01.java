package AccessSpecifiers;

public class DefaultMethodExample01 {
    public static void main(String[] args) {
    DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
    System.out.println(defaultMethodExample01.topla(6,8));
    }
    // defalut int topla(int number1, int number2){ kızarır başına default yazılmaz bo şbırakılrı
    //default asla farklı paketeen çağırılamaz, protected belli bir durumda olabilir ama default olmaz
    int topla(int number1, int number2){

        return number1+number2;
    }
}
