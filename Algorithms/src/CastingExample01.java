public class CastingExample01 {
    public static void main(String[] args) {
        byte byteNumber = 1;
        short shortNumber = 123;

        // byte newByte = shortNumber; böyle yaparsan kızar büyüğü küçüğe çeviremem
        short newShort = byteNumber; // Kızmaz küçük büyüğe dönüşür
        //short newShort = (short)byteNumber; // nprmalde böyledir 1 ile çarpma gibi yazmaz ama ordadır zaten oto yapıyor
        // byte newByte = (byte) shortNumber; Bu bildiğin ameliyat imzası gibi veri kaybı olur bilmem ne ben karışmam diyor java ama işlemi sorunlu da olsa yapar

        //Widening Casting (automatically)
        int intNumber=9;
        double doubleNumber=intNumber;
        System.out.println(doubleNumber);

        System.out.println("--------");

        //Narrowing Casting (manually)
        double doubleNumber2=9.5;
        int newIntNumber = (int) doubleNumber2;
        System.out.println(newIntNumber);





    }
}
