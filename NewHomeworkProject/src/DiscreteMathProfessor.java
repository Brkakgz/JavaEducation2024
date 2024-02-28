import java.util.Scanner;

public class DiscreteMathProfessor {

    public boolean Counter(int numberOfClass, int numberOfTreshold)
    {
        Scanner scanner = new Scanner(System.in);
        int [] timeCount = new int [numberOfClass];
        int counter=0;

        for(int i=0;i<numberOfClass;i++)
        {
            System.out.println((i+1)+". öğrenci için değeri giriniz(Erken gelen öğrenci için neg. geç gelen için poz.) : ");
            timeCount[i]= scanner.nextInt();
            if(timeCount[i]<=0)
            {
                counter++;
            }
        }
        if(counter>=numberOfTreshold)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci Sayısını Giriniz: ");
        int numberOfClass = scanner.nextInt();
        System.out.println("Profesörden önce kaç kişi sınıfta olmalı ?");
        int numberOfTreshold = scanner.nextInt();
        DiscreteMathProfessor discreteMathProfessor = new DiscreteMathProfessor();
        boolean decision;
        decision=discreteMathProfessor.Counter(numberOfClass,numberOfTreshold);
        if (decision==true)
        {
            System.out.println("Öğrenci sayısı yeterli ders yapılacak");
        }
        else
        {
            System.out.println("Yeterli Öğrenci Katılım Sağlamadı ! Ders Yapılmayacak");
        }
    }
}
