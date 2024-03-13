import java.util.Scanner;

public class Deneme17 {
    public static void main(String[] args) {
        //kullanıcıdan kaç tane sayı girmek istediğini alınız->metod
        // daha sonra girileceği kadar sayıyı array'e atın-->metod

        Deneme17 deneme17 = new Deneme17();
       int arrayLength = deneme17.getArrayLenghtFronUser();
        int [] array = new int[arrayLength];
        array= deneme17.getNumbersFromUser(array);
        deneme17.calculateAvarageAndSum(array);
    }

    public int getArrayLenghtFronUser() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı: ");
        int arrayLenght = scanner.nextInt();
        return arrayLenght;
    }

    public int[] getNumbersFromUser(int[] array)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        for(int i=0;i<array.length;i++)
        {
            System.out.println(i+1+". sayıyı giriniz: ");
            number = scanner.nextInt();
            array[i]=number;
        }
        return array;
    }

    public void calculateAvarageAndSum(int[] array)
    {
        int sum=0;
        for(int number:array)
        {
            sum = sum+number;
        }
        System.out.println("Girdiğiniz sayıların toolamı:"+sum);
        System.out.println("Girdiğiniz sayıların ort:"+(double)sum/array.length);
    }
}
