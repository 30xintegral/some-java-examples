public class Circle implements AreaCalc{
    public static final double pi = 3.14159265359;
    private double radius;

    @Override
    public double area() {
        return pi * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
}
