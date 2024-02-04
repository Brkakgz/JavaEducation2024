package Slayt6Link1;

public class JavaHomeWork18 {
    public static void main(String[] args) {
        /*
**********
**********
**********
**********

ii)

*
**
***
****
*****

iii)

        *
       **
      ***
     ****
    *****



iv)

    *
   ***
  *****
 *******
*********

v)

     1
    222
   33333
  4444444
 555555555

vi)

       1
      212
     32123
    4321234
   543212345
         */

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("----------------");

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------");

        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)
            {
                
            }
            System.out.println();
        }
    }
}
