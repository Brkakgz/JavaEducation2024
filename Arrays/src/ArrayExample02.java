public class ArrayExample02 {
    public static void main(String[] args) {
        //kapalı hali
        int[] numbers={1,2,3,4,5}; // new int tanımlaması yapıldı değerleri elle atandı

        // Üsttekinin açık halidir
        int[] numbers2=new int[5];
        numbers2[0]=1;
        numbers2[1]=2;
        numbers2[2]=3;
        numbers2[3]=4;
        numbers2[4]=5;

        System.out.println("Yeni numbers 4. index değeri: "+numbers[4]);

        numbers[4]=12; // 5 uçtu gitti

        System.out.println("Numbers 3. index değeri: "+numbers[3]);
        System.out.println("Eski numbers 4. index değeri: "+numbers[4]);

        for (int i=0;i<numbers.length;i++)
        {
            System.out.println("loop i: "+i+" değeri :"+numbers[i]);
        }


        System.out.println("Foreach ile yazılım");
        for(int number: numbers){ //içindeki değer kadar otomatik yazdırır üsttekinde <= kafa karıştırıyor dersen
            System.out.println(number);
        }

    }
}
