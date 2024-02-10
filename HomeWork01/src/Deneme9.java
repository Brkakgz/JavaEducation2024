public class Deneme9 {
    public static void main(String[] args) {

        //tamamımını toplamı, ortalama, teklerin çiftlerin toplamı


        int[] array = {2,-9,0,5,12,-25,22,9,8,12};
        double toplam=0,cift=0,tek=0;
        for(int i=0;i<array.length;i++)
        {
            toplam=toplam+array[i];
            if(array[i]%2==0)
            {
                cift=array[i]+cift;
            }
            else
            {
                tek=array[i]+tek;
            }
        }
        System.out.println("Toplam: "+toplam);
        System.out.println("tek: "+tek);
        System.out.println("cift: "+cift);
        System.out.println("Ortalam: "+(double)toplam/array.length);
    }
}
