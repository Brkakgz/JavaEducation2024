package DoWhileExample;

import java.util.Random;

public class HomeWork01 {
    public static void main(String[] args) {
        int zar1,zar2, deneme=0;
        boolean zarAt=true;
        Random random = new Random();


            /*1. yöntem
            do{
            zar1=random.nextInt(6)+1;
            zar2=random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+".deneme: "+"Zar1: "+zar1+" --  Zar2: "+zar2);
            }
            while(!(zar1==6 && zar2==6)); //6 6 gelmediği sürece devam
            {

            }
            */

       /* do {
            zar1 = random.nextInt(6) + 1;
            zar2 = random.nextInt(6) + 1;
            deneme++;
            System.out.println(deneme + ".deneme: " + "Zar1: " + zar1 + " --  Zar2: " + zar2);


            if (zar1 == 6 && zar2 == 6) {
                zarAt = false;
            }
        }
        while(zarAt);

        */
    }

}
