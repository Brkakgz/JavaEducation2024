public class Question3 {
    public static void main(String[] args) {
        //Do-while döngüsü kullanarak, 5'e bölünebilen sayıları 1'den 50'ye kadar olan aralıkta ekrana yazdıran bir Java programı
        int i=1;
        do {
            for(;i<=50;i++)
            {
                if(i%5==0)
                {
                    System.out.println(i+" sayısı 5'e tam bölünür");
                }
            }
        }
        while(i<=50 && i>1);
    }
}
