import java.util.Arrays;

public class NewAlgorithmQuestion {
    public static void main(String[] args) {
        int[] mainArray = {1,1,2,2,4,4,5,5,5,0};
        int[] maxArray = new int[10];
        int[] controlArray=new int [10];
        int sayac1=0,sayac2=0;

        for(int i=0;i<= mainArray.length;i++)
        {
            if(i+1==10)
            {
                break;
            }
            if(mainArray[i]-mainArray[i+1]<=1 || mainArray[i]-mainArray[i+1]>=-1)
            {
                controlArray[i]=mainArray[i];
                sayac1++;
            }
            if (sayac1>sayac2) {
                if (mainArray[i] - mainArray[i + 1] > 1 || mainArray[i] - mainArray[i + 1] < -1) {
                    sayac2 = sayac1;
                    for (int j = 0; j < controlArray.length; j++) {
                        maxArray[j] = controlArray[j];
                    }
                    Arrays.fill(controlArray, 0); // Bu metod dizi değerlerini sıfırlıyormuş. for döngüsünmde de sıfırlardım ama kullanmak istedim.
                    sayac1 = 0;
                }
            }
        }

        System.out.print("[");
        for (int i=0;i<maxArray.length;i++)
        {
            System.out.print(","+maxArray[i]); // Buraya sonunda 0lar olsa bile en çok mutlak değeri 1'den küçük veya eşit olan tekrarı yazar
        }
        System.out.println("]");
        System.out.println(sayac2+" tane Mutlak değer 1 veya küçük sayı serisi vardır.");
    }
}
