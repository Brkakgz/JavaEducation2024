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
       int maxSpentMoney=-1;
       int invoice=0;

       for(int i=0;i<keyboards.length;i++)
           for (j=0;j<=drives.length;j++)
           {
               invoice=keyboards[i]+drives[j];
               if(invoice<=b && invoice>maxSpentMoney)
               {
                   maxSpentMoney=invoice;
               }
           }
return maxSpentMoney;

    }
 /*       int selectedItem=0;
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
                    //burada selectedItem budget değerini her türlü geçiyor o yüzden -1 verir
                }
            }
        }
        return sonuc;
    }

  */
}