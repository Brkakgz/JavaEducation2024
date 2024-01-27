package Class_example01;

public class Dog {


    //Tüm dünyadaki köpekler aynı değil ki. Özellikleri bellidir. Ama aynı değildir o yüzden burada boş bırakıpğ sonradan değerini atarız.
    String name; // dogOfEray 'da nden buranın booş olduğu yazıypr. Example01.Main de
    String eyesColor="brown"; //attribute yani bu özelliği. BAK CLASS İÇİNE TANIMLADIK void falan değil dümdüz claass
    String gender="male";
    int age=10;


    //Burası dog ile ilgili olmalı yoksa mantıksız olur.Burada random sayı üretmek saçma ismi uyuşmuyor clean kod olmaz
    public void run()
    {
        System.out.println("Example01.Dog is running");
    }
    public void bark()
    {
        System.out.println("Example01.Dog is barking");
    }
    public void eat()
    {
        System.out.println("Dos is eating");
    }
}
