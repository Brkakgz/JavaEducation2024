public class ArrayArrangement {
    public static void main(String[] args) {

        /*
        * 1, 2, 3, 10, 6, 4, 7 böyle bi array olsun daha uzun veya kısa olabilir,bunu küçükten büyüğe, Arrays.sort gbi methoflar KULLANMADAN. küçükten büyüğe sıralama yapınız
        * hiç bir java methodu kullanmadan döngüler ile algoritma olarak sırala
        * */
        int [] array = {1,2,3,10,6,4,7,8,9,9,10,10,11,2,5};
        int sayi1=0,sayi2=0,sayi3=0;

        for (int i=0;i<array.length;i++)
        {
            for(int ii=0;ii<array.length;ii++)
            {
              if (array[i]<=array[ii])
              {
                  sayi1=array[ii];
                  sayi2=array[i];
                  array[ii]=sayi2;
                  array[i]=sayi1;
                  sayi1=0;
                  sayi2=0;
                  sayi3=0;
              }
            }
        }

        System.out.print("[");
        for(int j=0;j<array.length;j++)
        {
            System.out.print(array[j]+",");
        }
        System.out.print("]");
    }
}
