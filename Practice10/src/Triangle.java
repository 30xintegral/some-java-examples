public class Triangle implements AreaCalc{
    private double h;
    private double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double area() {
        return 0.5 * a * h;
    }

}
