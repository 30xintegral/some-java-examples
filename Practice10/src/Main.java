public class Main {
    public static void main(String[] args) {

        AreaCalc triangle = new Triangle(3, 6);

        AreaCalc rectangle = new Rectangle(3, 6);

        AreaCalc circle = new Circle(6);

        System.out.println(triangle.area());

        System.out.println(rectangle.area());

        System.out.println(circle.area());
    }
}
