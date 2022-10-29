package homework9.figures;

public class Square implements Figure {

    private static double side;
    public Square(double side) {
        Square.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
