package StaticMethods;

import java.util.Random;

public class StaticMethodsExample02 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);
        StaticMethodsExample02 myClass = new StaticMethodsExample02(); //static değilse new ile class adı yazıyoruz
        myClass.topla(5,10);
        //topla(3,5); yapamayzı new ile üretip yazarız
        cikar(5,3); //aynı class içerisinde bu yüzden className.methodName gerek yok
        StaticMethodsExample02.cikar(5,3); // ClassName.methodName

        //Eğer bir kodda defalarda kullandığın bir metod varsa onu static tanımlarsın
        //Büyük bir token  içi karışık içinde çok bilgi var olur içinde kullanıcıadı geçiyor. içinden kullanıcı adı çekeceksem static olur
        //Math metodu mesela static
        //Static bellekte hazır bekler heryere static yazılmaz çünkü program açılır açılmaz  run yapılır yapılmaz sürekli hazır bekliyor pc kasar ön bellekte tutulur static :D
        //New olan çağırıldığında çalışır belleğe gelir işi bitince bellekten silinir ama static öyle değil.
    }
    public  void topla(int number1, int number2) {
        System.out.println("toplam :"+(number1+number2));

    }
    public static void cikar(int number1, int number2)
    {
        System.out.println("cikarım: "+(number1 - number2));
    }
}

