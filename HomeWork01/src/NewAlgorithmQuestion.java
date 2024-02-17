import java.util.Arrays;

public class NewAlgorithmQuestion {
    public static void main(String[] args) {
        int[] mainArray = {1,1,2,2,4,4,5,5,5};
        int[] maxArray = new int[50];
        int[] controlArray=new int [50];
        int sayac1=0,sayac2=0;

        for(int i=0;i<= mainArray.length;i++)
        {
            if(i+1==9)
            {
                break;
            }
            if(mainArray[i]-mainArray[i+1]<=1 || mainArray[i]-mainArray[i+1]>=-1)
            {
                controlArray[i]=mainArray[i];
                sayac1++;
            }
            else if (sayac1>sayac2) {
                if (mainArray[i] - mainArray[i + 1] > 1 || mainArray[i] - mainArray[i + 1] < -1) {
                    sayac2 = sayac1;
                    for (int j = 0; j <= controlArray.length; j++) {
                        maxArray[j] = controlArray[j];
                    }
                    Arrays.fill(controlArray, 0); // Bu metod dizi değerlerini sıfırlıyormuş. for döngüsünmde de sıfırlardım ama kullanmak istedim.
                    sayac1 = 0;
                }
            }
        }
        for (int i=0;i<maxArray.length;i++)
        {
            System.out.println("["+maxArray[i]+"]"); // Buraya sonunda 0lar olsa bile en çok mutlak değeri 1'den küçük veya eşit olan tekrarı yazar
        }
    }
}
