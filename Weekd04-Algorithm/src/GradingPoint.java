//import java.util.Random;
//import java.util.Scanner;
//
//// Hocanın yazdığına bak burda yanlışlıklar var
//
//
//public class GradingPoint {
//    public static void main(String[] args) {
//        //Soru Wp üzerinde
//       /* int [] points = new int[20]; //20 elemanlı dizi tanımladık
//        points[0]=54; kendimiz ek girdik
//        */
//        // int[] points = {5,56,79,81,93,38,37}; // 3 elemanlı elemanları belli dizi oldu
//        GradingPoint gradingPoint = new GradingPoint();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kaç Adet Öğrenci Notu Oluşturulsun ? ");
//        int ogrSayi= scanner.nextInt();
//
//        }
//
//
//    int [] grades = gradingPoint.generatePints(ogrSayi);
//       int [] newGrades = gradingPoint.gradingStudents(grades);
//       for(int grade : newGrades)
//       {
//           System.out.println(grade);
//       }
//
//    }
//
//    public int[] generatePoints(int n)
//    {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int[] grades = new int[ogrSayi];
//        for(int i=0;i<=ogrSayi;i++) {
//            int grade = random.nextInt(101);
//            grades[i]=grade;
//            // grades[i]=random.nextInt(101);
//    }
//
//
//    public int[] gradingStudents(int[] grades)
//    {
//
//        for (int i=0;i<grades.length;i++)
//        {
//            int grade = grades[i];
//            if(!(grade<38)) // sayı 38'den küçük değilse yap
//            {
//                int nextMultiple = (int)(Math.ceil((double)grade/5)*5); // yuvarlama işlemi
//                if(nextMultiple - grade<3)
//                {
//                    /*grade = nextMultiple; // Burası artık puan 3 farktan küçükse yuvarlayacak.
//                    grades[i]=grade;*/
//
//                    grades[i]=nextMultiple; //yukarıdakinin tek satırlı hali
//                }
//            }
//        }
//        return grades;
//    }
//}