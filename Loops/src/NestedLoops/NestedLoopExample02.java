package NestedLoops;

public class NestedLoopExample02 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }

            System.out.println();
        }

        /*
        //Tam tersi 5 4 3 2 1 üçgeni yapar
           for(int i=5;i>=0;i--){ //i>=1 yaparsak program sonunda fazladan aşağıya inmez
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
         */
    }
}
