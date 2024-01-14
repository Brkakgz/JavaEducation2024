package AccessSpecifiers;

public class ProtectedAccessSpecifiersExample01 {
    public static void main(String[] args) {
        ProtectedAccessSpecifiersExample01 protectedAccessSpecifiersExample01 = new ProtectedAccessSpecifiersExample01();
      //  protectedAccessSpecifiersExample01.topla(5,3);// Bak olmuyor Protected kısmından protected değil public yapsan alırsın
        //Erişemiyorum çünkü protected olan bir metod farklı bir paket altındaysa kullanmak kalıtım(extends) edilmesi gerekir -> ileride göreceğiz
    }
}
