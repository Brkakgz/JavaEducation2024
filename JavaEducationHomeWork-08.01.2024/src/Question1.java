public class Question1 {
    public static void main(String[] args) {
        //Bir for döngüsü kullanarak 1 ile 100 arasındaki çift sayıları ekrana yazdıran Java kodu
        int num=0;
        for(int i=1; i<=100;i++)
        {
          if(i%2==0)
          {
              num++;
              System.out.println(num+". Çift Sayı: "+i);
          }
        }
    }
}