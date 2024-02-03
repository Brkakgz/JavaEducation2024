public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        circle.setRadius(5);
        System.out.println("Çemberin alanı:"+circle.calculateArea());

        System.out.println("--------");

        triangle.setBase(10);
        triangle.setHeight(10);
        System.out.println("Üçgenin alanı:"+triangle.calculateArea());

        System.out.println("--------");

        rectangle.setHeight(20);
        rectangle.setWidth(30);
        System.out.println("Dikdörtgenin Alanı: "+ rectangle.calculateArea());


    }
}