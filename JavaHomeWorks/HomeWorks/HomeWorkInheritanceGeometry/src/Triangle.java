public class Triangle extends Shape{

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a Triangle");
    }

    @Override
    public double calculateArea(){
        double alan=0;
        alan=base*height/2;
        return alan;

    }
}
