package homework5;

import java.util.Scanner;

public class App2 {

    static Scanner scanner;
    private static double result;

    public static void main(String[] args) {
        getData();
        showResult();
        calcAgain();
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
                    System.out.println("Can't divide by zero!");
                    calcAgain();
                } else result = num1 / num2;
            }
            case 0 -> {
                System.out.println("App closed.");
                closeApp();
            }
            default -> {
                System.out.println("Unknown command!");
                calcAgain();
            }
        }
    }

    private static void showResult() {
        System.out.printf("Result is: %.2f \n", result);
        System.out.println("==================================");
    }

    private static void calcAgain() {
        System.out.println("""
                Do you want to calc another operations?
                1 - Calc again
                0 - Close the app
                """);

        int selectOption = scanner.nextInt();
        if (selectOption == 1) {
            getData();
        } else if (selectOption == 0) {
            System.out.println("App closed.");
            closeApp();
        } else {
            System.out.println("Unknown command! App closed.");
            closeApp();
        }
    }

    private static void closeApp() {
        scanner.close();
        System.exit(0);
    }
}
