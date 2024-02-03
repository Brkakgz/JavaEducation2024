import java.util.Scanner;

public class Rectangle extends Shape{
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public double calculateArea(){

        double alan=0;
        alan=width*height;
        return alan;

    }
}
