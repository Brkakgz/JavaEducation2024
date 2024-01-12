public class Question7 {
    public static void main(String[] args) {
        //Bir do-while döngüsü kullanarak, 1 ile 50 arasındaki sayıların karelerini ekrana yazdıran bir Java kodu
        int i=0,square;
        do{
        i++;
        square=i*i;
            System.out.println(i+" Sayısının Karesi: "+square);
        }
        while(i<50);
    }
}
