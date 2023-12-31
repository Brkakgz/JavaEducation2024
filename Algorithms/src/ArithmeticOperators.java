public class ArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 5, number2=3, number3=17;
        String websideName="Web Sitemiz ", websdieUrl="www.burak.com";

        System.out.println("Merhaba: " +websideName+ "- " + websdieUrl);
        System.out.println("hello"); // Yapınca direkt alt satıra geçiyor
        //System.out.println ifadesindeki ln nextline anlamına gelir System.out.print yazarsan alt satıra geçmez. Benden sonra geleni alt satıra yaz anlamına gelir
        //ln koymak isemezsen \n yapılır
        //System.out.print("Merhaba: \n" +websideName+ "- " + websdieUrl);
        //System.out.println("Merhaba: " +websideName+ "- " + websdieUrl+"\n\n\n");
        System.out.println("number1+number2="+number1+number2);
        System.out.println("number1+number2="+(number1+number2));
        System.out.println("number1+number2="+(number1-number2));
        System.out.println("number1+number2="+(number1*number2));
        System.out.println("number1%number2="+(number1%number2));
        float result= number1/number2; // Altı sarı okuduğunda sayıları int tanımlamışsın int/int sana int veririm diyor
        float result1=(float)number1/number2; // Yaparsak bu sefer float bölümü yapar
        System.out.println("number1+number2="+(number1/number2));
        System.out.println("result="+result);
        System.out.println("result1="+result1);

        float resultFloat1 = 5f;
        float resultFloat2 = 8f;
        float resultF= resultFloat1/resultFloat2;
        System.out.println("reslt"+resultF);

    }
}
