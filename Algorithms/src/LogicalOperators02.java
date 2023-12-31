public class LogicalOperators02 {
    public static void main(String[] args) {
        int password = 123456;
        // password. yapınca diğeri gibi panel yok çünkü class fonksiyon değil
        if (password == 12345) {
            System.out.println("Şifreniz 12345");
        }

        if (password == 123456) {
            System.out.println("Şifreniz:123456");
        }

        String name = "burakakgöz";
        if (name.equals("burak")) {
            System.out.println("Merhaba Burak");
        }
        if (name.equals("burakakgöz")) {
            System.out.println("Merhaba burakakgöz");
        }
        //Biz neden name==name yapmadık password==password yapabiliyoruz ?
        //equals ifade değerini karşılaştırır

        String name1="a"; //Bütün ifade yazanları değiştirmek için seç sağ tıkla refactor rename enter
        String Ifade2= new String("a"); // tek sebebi new olduğunda farklı bir adreste değeri tutarr.> java data memory model kısmında tekrar bakacağız
        if(name1==Ifade2)
        {
            System.out.println("Eşit");
        }
        if(name1.equals(Ifade2))
        {
            System.out.println("Şimdi doğru yoldasın");
        }
    }
}
