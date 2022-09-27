package homework5;

import java.util.Scanner;

public class App2 {

    static Scanner scanner;
    private static double result;

    public static void main(String[] args) {
        getData();
        showResult();
    }

    private static void getData() {
        scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = scanner.nextDouble();
        System.out.println("""
                Select operation:
                1 - Sum
                2 - Difference
                3 - Multiplication
                4 - Division
                0 - Close application
                """);
        int selectOperation = scanner.nextInt();
        calcData(selectOperation, firstNum, secondNum);
    }

    private static void calcData(int operation, double num1, double num2) {
        switch (operation) {
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Can't divide by zero! Try again.");
                    getData();
                } else result = num1 / num2;
            }
            case 0 -> {
                System.out.println("App closed.");
                scanner.close();
                System.exit(0);
            }
            default -> {
                System.out.println("Unknown command. Try again.");
                getData();
            }
        }
    }

    private static void showResult() {
        System.out.printf("Result is: %.2f \n", result);
        System.out.println("==================================");
        getData(); // Добавил вызов, т.к. по ТЗ закрытие приложения только через операцию выхода.
    }
}
