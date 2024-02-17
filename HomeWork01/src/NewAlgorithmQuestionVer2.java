/*import java.util.Arrays;

public class NewAlgorithmQuestionVer2 {
    public static void main(String[] args) {
        int [] array = {1,1,2,2,4,4,5,5,5};
        Arrays.sort(array);
        int count=0;
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<=array.length;j++)
            {
                if(Math.abs(array[i]-array[j]<=1))
                {
                    count++;
                }
                else{
                    break; //Sıralı olduğu için sonuna kadar tekrar etmesine gerek yok
                }
            }
            if(count>max)
            {
                max=count;
            }
            count=0;
        }
        System.out.println("max: "+(max+1));
    }
}
*/