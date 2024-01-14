package ProtectedMethod;

import AccessSpecifiers.DefaultMethodExample01;
import AccessSpecifiers.ProtectedAccessSpecifiersExample01;

public class ProtectedMethodExample02 {
    public static void main(String[] args) {
        ProtectedMethodExample01 protectedMethodExample01 = new ProtectedMethodExample01();
        protectedMethodExample01.topla(5,5); // Bakınız erişim var çünkü aynı paket içerisinde :)

        DefaultMethodExample01 defaultMethodExample01 = new DefaultMethodExample01();
        // defaultMethodExample01.topla(1,2); erişim sağlanamaz çünkü Access specifiers paketinin aldındadır bu farklı bir pakettir
    }
}
