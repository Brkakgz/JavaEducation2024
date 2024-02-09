import java.util.Random;
import java.util.Scanner;

public class Deneme8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Kaç adet random sayı üretilsin: ");
        int num= scanner.nextInt();
        int[] array1 = new int[num];
        int[] array2 = new int[num];
        int[] array3 = new int[num];

        int arraySayaci=0;
        do{

           array1[arraySayaci]=random.nextInt(5)+1;
            arraySayaci++;
        }
        while(arraySayaci<num);


        for(int i=0;i<num;i++)
        {System.out.print("Array1 : "+array1[i]);
            }
        System.out.println();
        System.out.println("-----");

        for(int i=0;i<num;i++)
        {
            array2[i]=array1[i];
            System.out.print(" Array2: "+array2[i]);
        }
        System.out.println();
        
        int minArrayIndex=0;


        //Diziyi en küçükten en büyüğe doğru sıralamak gerkeli. Sıraladıktan sonra kontrol işlemi ile dizinin ilk elemanı ne zaman değişiyorsa o zamana kadar sayac ile sayısını tutturmak lazım
        //Daha sonra yeni sayıya geçerse onu da saymak ve bu iki sayacı karşılaştırmak lazım, sayaclar eşit ise küçük olanı değerini kaydetmek lazım.
        // Sayacı büyük olanın değerini kaydedip 3. farklı sayıya geçtğinde aynı işlemi tekrar ettirmek gerekli.
        // Dizi bittiğinde ise sayac sayısını ve değeri ekrana yazdırırsak en küçük ve en fazla tekrar eden sayıyı bulmuş oluruz. Ama kod olarak yazamadım :D :D

        //Aslında tek bir dizi üzerinden karşılaştırma yapmıştım array2 yoktu array1[i] ile array1[j] değerlerini karşılaştırıyordum sonuç olarak diziye ellemediğim için 2. bir diziye ihtiyacım yoktu
        //kafa karışıklığı olmasın diye 2. diziye 1. dizinin değerlerini atadım.
        //while(true)
       // {
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<num;j++) {

                    if(array1[i]<=array2[j])
                    {

                        array3[i]=array1[i];
                    }
                    else if (array2[j]<=array1[i])
                    {
                        array3[i]=array2[j];
                    }
        //Burada aslında mantık hatası şu array1 de bir sonraki index'e geçtiğinde array2'nin en başından beri kontrol yaptığı için en küçük sürekli aynı çıkar.
        // Aslında o 3. diziye atadığımız sayıyı tekrar kontrol etmemesi için continue kullanmamız lazım.
                    }
            }

        System.out.println("-----");
           for(int i=0;i<num;i++)
           {System.out.print(" Array3 : "+array3[i]);}
       // }

    }

}
        /*for(int i=0;i<num;i++)
        {System.out.println(array[i]);}*/

       /* int controlSayaci=0;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++) {
                if (array[i]==array[j])
                    continue;
                    if (array[i] == array[j]) {

                    controlSayaci++;
                    }
                }
            }
        }*/


