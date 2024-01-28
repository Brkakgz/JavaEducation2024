package Class_example03;

public class Main2 {

    int x=5;

    public static void main(String[] args) {
        Main2 myObject = new Main2();
        System.out.println("myObject: "+myObject.x);
        myObject.x=15;
        System.out.println("myObject: "+myObject.x);
        Main2 myObject2 = new Main2();
        System.out.println("MyObject2: "+myObject2.x); // Gördüğünüz gibi sadece myObject kendisine etki ediyor diğerine karışamıyor.2'ye etki edemiyor
    }
}
