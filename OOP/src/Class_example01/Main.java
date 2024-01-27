package Class_example01;

public class Main {
    public static void main(String[] args) {

       // Example01.Dog dog = new Example01.Dog(); yazmadığımız sürece bellekte yer kaplamaz static değil ;)

        Dog dog1 = new Dog(); // Example01.Dog classını çağırdık
        dog1.eat(); // class içinde metodunu kullandık bunu yazmazsak hepsini yazdırır gibi bişey yok. Bunun çağrılması lazım
        System.out.println("Köpeğimizin göz rengi: "+dog1.eyesColor); // yine dog içinden rengi çağırdık. BU BİR ÖZELLİK AÇ KAPA PARANTEZ YOK. EAT FONKSİYONM YUKLARIDA ÖYLE ÇAĞIRDIK
        System.out.println("Cinsiyeti: "+dog1.gender);
        System.out.println("Yaşı: "+dog1.age);
        System.out.println("------------");


        //Dünyadaki tüm köpkeler aynı değil ki o yüzden dog içinde tanımlayıp içini boş bırakıp burada tanımlarım. // Yukarıdakiler gitmesin diye normalde boş kalsacak
        Dog dogOfEray = new Dog();// Bellekte eray için yeni yer oluşturdu. Eğer class new ile oluşturulmuşsa bellekte heap alanında bu bilgiler tutuldu.
        dogOfEray.name ="bulut";
        dogOfEray.gender ="male";
        dogOfEray.age=1;
        dogOfEray.eyesColor="black";


        System.out.println("Köpeğimizin göz rengi: "+dogOfEray.eyesColor);
        System.out.println("Cinsiyeti: "+dogOfEray.gender);
        System.out.println("Yaşı: "+dogOfEray.age);
        System.out.println("GözRengi: "+ dogOfEray.eyesColor);
        System.out.println("------------");

        Dog dogOfGalip = new Dog(); //Bellekte galip için yeni yer oluşturdu ---- Class:Example01.Dog Obje:dogOfGalip
        dogOfGalip.name ="Haze";
        dogOfGalip.gender ="female";
        dogOfGalip.age=5;
        dogOfGalip.eyesColor="yellow";

        System.out.println("Köpeğimizin göz rengi: "+dogOfGalip.eyesColor);
        System.out.println("Cinsiyeti: "+dogOfGalip.gender);
        System.out.println("Yaşı: "+dogOfGalip.age);
        System.out.println("GözRengi: "+ dogOfGalip.eyesColor);
        dogOfGalip.bark();
        dogOfGalip.eat();
        System.out.println("------------");
    }
}