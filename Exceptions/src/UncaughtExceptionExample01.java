public class UncaughtExceptionExample01 {
    public static void main(String[] args) {
        UncaughtExceptionExample01 uncaughtExceptionExample01 = new UncaughtExceptionExample01(); //metod1 static değil ondan laım
        uncaughtExceptionExample01.method1(null);
    }
    public void method1(String name){
        System.out.println("method1");
        try{
            method2(name)
        }
        catch(NullPointerException nullPointerException)
        {
            System.out.println("NullpointerExcepiton catch!");
        }
        System.out.println("method1 works");
    }

    public void method2(String name){
        System.out.println("method2");
        method3(name);
        System.out.println("method2 works");
    }
    public  void method3(String name)
    {
       /* name.toLowerCase();
        System.out.println("method3 works"); // burada çökecek catch görene kadar çöke çöke gider eğer
        */

        try{
            name.toLowerCase();
        }
        catch(NullPointerException nullPointerException){
            System.out.println("nullpoint-->"+nullPointerException.getMessage());
        }
        System.out.println("method3 works");
        //Artık burada yakalıyor ve catch bulana kadar geri 1.ye dönmüyor çünkü burada yakaladı
        //hiç try catch olmasa en başa gider main'e gider çağırıldığ yerde çöker


//        if(Object.nonNull(name)){
//            name.toLowerCase();
//        } normalde böyle yapmak mantıklı ama amaç uncaught exceptionu öğrenmek yani domino taşi gibi dökülüyor kod
    }
}
