public class Main {
    public static void main(String[] args) {

        int[] birdTypes = new int[6];
        int[] givenBirdTypesCount = {1,1,1,3,5,3,5,5,3};
        int max=0;
        for(int birdType: givenBirdTypesCount)
        {
            birdTypes[birdType]++; //burda amaç yukarıda tanımlı olan dizinin değerine göre o değerdeki indexi 1 arttırıyor. 1. index 1 ise yeni dizide 1. indexi 1 arttırıyor :D
            max = Math.max(max, birdTypes[birdType]);
        }

      /*
       burayı 7. satırdaki for içine Max.math ile yaparak ikinci fordan kurtulurum. 10. satır ve for içinde olması burayı komple yapar
       int max=0;
        for(int i=0;i<birdTypes.length;i++)
        {
            if(birdTypes[i]>max)
            {
                max=birdTypes[i];
            }
        }
        */

        for(int i=0;i<birdTypes.length;i++)
        {
            if(birdTypes[i]==max)
            {
                System.out.println("Em çok tekrar eden en küçük sayı : "+i+"'dir");
                break; //Break olmasa tüm eşit sayıda tekrar edeni yazar
            }
        }
        System.out.println();


    }
}