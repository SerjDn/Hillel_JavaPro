package homework9.figures;

public class Main {

    public static void main(String[] args) {
        showInfo();
    }

    static Figure square = new Square(3);
    static Figure circle = new Circle(2);
    static Figure triangle = new Triangle(3.2, 4);

    private static double calcAreas() {
        Figure[] areas = {square, circle, triangle};
        double sum = 0;
        for (Figure area : areas) {
            sum += area.calcArea();
        }
        return sum;
    }

    private static void showInfo() {
        System.out.println("Area of square is: " + square.calcArea());
        System.out.println("Area of circle is: " + circle.calcArea());
        System.out.println("Area of triangle is: " + triangle.calcArea());
        System.out.println("======================================");
        System.out.println("Area of all figures is: " + calcAreas());
    }

}
