import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Klavye fiyatlarını giriniz: ");
        int budget = 40;
        int [] keyboards = {40,50,60};
        int [] drives ={5,8,12};
        int secim=getMoneySpent(budget,keyboards,drives);
        System.out.println("Bütçenize göre maksimum alabileceğiniz ürünlerin fiyatı: "+secim);



    }
    public static int getMoneySpent(int budget,int[] keyboards,int[] drives)
    {
        int selectedItem=0;
        for (int i = 0; i < keyboards.length; i++)
        {
            for(int j = 0; j < drives.length; j++)
            {
                selectedItem=keyboards[i]+drives[j];
                if(selectedItem<=budget)
                {
                sonuc=selectedItem;
                }
                else{
                    sonuc=-1;
                    break;
                }
            }
        }
        return sonuc;
    }
}