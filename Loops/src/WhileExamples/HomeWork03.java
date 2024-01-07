package WhileExamples;

import java.util.Random;

public class HomeWork03 {
    public static void main(String[] args) {
        // Bilgisayardan 2 zar attıracağız ikisi de 6 olana kadar zarlasın

        int zar1,zar2, deneme=0;
        boolean zarAt=true;
        Random random=new Random();

        while(zarAt)// while(true) yapıp if içinde break atabilirdik
        {
            zar1=random.nextInt(6)+1;
            zar2=random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+".deneme: "+"Zar1: "+zar1+" --  Zar2: "+zar2);

            if(zar1==6 && zar2==6){
                System.out.println(deneme+".denemede 6,6 oluştu / "+"Zar1:"+zar1+" --  Zar2:"+zar2);
                zarAt=false; //yerine break yazılabilirdi
                //break;
            }

        }
    }
}
