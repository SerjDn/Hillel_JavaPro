package homework9.figures;

public class Circle implements Figure {

    private static final double PI = 3.14;
    private static double radius;
    public Circle(double radius) {
        Circle.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * radius * radius;
    }
}
