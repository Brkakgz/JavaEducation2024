public class NoteCalculate {
    public static void main(String[] args) {
        double firstExamNote=50;
        double secondExamNote=80;
        
        double vizeNot =firstExamNote*0.3;
        double finalNot=secondExamNote*0.7;
        double resultNote=vizeNot+finalNot;
        
        if(resultNote<45){
            System.out.println("Kaldın");
        } else if (resultNote>=45 && resultNote<=60) {
            System.out.println("Harf Notunuz: CC");

        } else if (resultNote>60 && resultNote<=70) {
            System.out.println("Harf Noyunuz: BB");

        }
        else {
            System.out.println("Harf Notunuz:AA");
        }

        if(resultNote>70)
            System.out.println("Tebrikler");
            System.out.println("Geçtiniz"); // Tek satır bile olsa blok içerisine almak lazım.
    }
}
