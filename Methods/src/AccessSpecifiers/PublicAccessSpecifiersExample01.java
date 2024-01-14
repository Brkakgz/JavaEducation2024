package AccessSpecifiers;

import StaticMethods.StaticMethodsExample02;

import java.util.Random;

public class PublicAccessSpecifiersExample01 {
    public static void main(String[] args) {
        //StaticMethods Paketinin altında Static Methods Example 02'de toplam metodu public olduğundan erişilebilir olmalı
        Random random= new Random();
        random.nextInt(50);//java.until paketindeki nextint methoduna etişrim.

        StaticMethodsExample02 staticMethodsExample02 = new StaticMethodsExample02(); // aa bak eriştim static olmadığından new ile yaptık
        //System.out.println(staticMethodsExample02.topla(5,10); // ama reutn değilmiş o yüzden return yapamuyoruz
        staticMethodsExample02.topla(5,10);//Bak erişim var

        staticMethodsExample02.cikar(10,7); // New lazım değil çünkü static

        PrivateMethodExamples01 privateMethodExamples01 = new PrivateMethodExamples01();
      //  privateMethodExamples01.topla(3,5);
        //Erişemeyiz çünkü privatemethodexamples01 sadece aynı class içerisinden erişilebilir aynı paket bile olsa erişilemez

        DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
        defaultMethodExample01.topla(1,2); // bakınız eriştik

    }
}
