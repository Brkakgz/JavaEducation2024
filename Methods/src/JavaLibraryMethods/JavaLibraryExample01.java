package JavaLibraryMethods;

import static java.lang.Math.*;
import java.lang.*; // Bu tüm metodları import eder bu tavsiye edilmez

public class JavaLibraryExample01 {
    public static void main(String[] args) {
        System.out.println("Math.sqrt(4): "+sqrt(4)); //Math.sqrt() yapmazsak yukarıda import etmemiz gerekiyor
        System.out.println("Math.max() :" + Math.max(5,11));
        System.out.println("Math.abs() :"+Math.abs(-5));
        System.out.println("Math.pow: "+Math.pow(5,3));
    }
}
