package VoidMethods;

public class VoidMethodExample03 {
    public static void main(String[] args) {
        double studentNot=80.7;
        //notu buldurup studentNote dğeişkenine atadığımızı hayal et kendimiz girdik ama olsun
        findRank(studentNot);

    }
    public static void findRank(double note){ // findRank(studentNot)---> double note yerine geçti yani anladın artık
        if(note >80)
        {
            System.out.println("Notunuz: AA");
        }
        else if (note>70 && note<=80)
        {
            System.out.println("Notunuz: BB");
        }
        else {
            System.out.println("FF KALDIN. SINIF TEKRARI");
        }
    }
}
