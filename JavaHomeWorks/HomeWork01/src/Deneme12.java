import java.util.Scanner;

public class Deneme12 {
    public static void main(String[] args) {
        //Diziyi tersten ekrana bas orjinal diziyi bozmadan yap orjinali de tersi de ekrana bas

        int[] array = {1,2,3,4,5};
        int[] array2 = new int[5];

        int sayac=0;
        for(int i=4;i>=0;i--)
        {
        array2[i]= array[sayac];
            sayac++;
        }

        System.out.println("Orjinal Dizi: ");
        for (int i=0;i<5;i++){
            System.out.print(array[i]);
        }

        System.out.println();

        System.out.println("Ters Dizi: ");
        for (int i=0;i<5;i++){
        System.out.print(array2[i]);
        }
    }
}
