package AccessSpecifiers;

public class PrivateMethodExamples01 {
    public static void main(String[] args) {
        PrivateMethodExamples01 privateMethodExamples01 = new PrivateMethodExamples01();
        privateMethodExamples01.topla(3,5); //bakınız erişilebildi
    }
    private int topla (int a, int b)
    {
        return a+b;
    }
}
