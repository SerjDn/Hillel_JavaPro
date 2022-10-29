package homework9.figures;

public class Triangle implements Figure {

    private static double height;
    private static double side;
    public Triangle(double height, double side) {
        Triangle.height = height;
        Triangle.side = side;
    }

    @Override
    public double calcArea() {
        return height * side / 2;
    }
}
