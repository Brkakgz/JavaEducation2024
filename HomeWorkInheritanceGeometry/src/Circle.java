import java.util.Scanner;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }

    @Override
    public double calculateArea(){
        double alan;
        alan=3.14f*radius*radius;
        return alan;
    }
}
