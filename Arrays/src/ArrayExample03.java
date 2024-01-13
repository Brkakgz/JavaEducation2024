public class ArrayExample03 {
    public static void main(String[] args) {
        //2,-9,0,5,15,-25,22,9,8,12 sayılarını diziye atayıp toplamını ortalamasını bulan foreach kodu
        int[] dizi = {2,-9,0,5,12,-25,22,9,8,12};
        double toplam=0,ortalama=0;

        for(int number:dizi)
        {
            toplam=toplam+number;
        }
        ortalama= toplam/dizi.length; //dizi.lenght bize dizinin uzunluğunu veriyor olur da dizi uzunluğu değişir diye
        System.out.println("Toplam: "+toplam+"  Ortalama: "+ortalama);

    }
}
