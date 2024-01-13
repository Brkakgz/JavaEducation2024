package ForEach;

public class ForEachExample01 {
    public static void main(String[] args) {
        //for(veritipi degiskenadi: array/liste/)
        int array[]={1,2,3,4,5};

        for(int number: array){ //dizideki değerleri sırayla number içine koyar
            System.out.println("değer: "+ number);
        }

    }
}
