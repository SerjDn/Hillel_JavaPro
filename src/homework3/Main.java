package homework3;

import java.util.Scanner;

public class Main {

    static Scanner scanner;
    private static String firstName;
    private static String lastName;
    private static double depAmount;
    private static int depTerm;
    private static double depPercents;
    private static String currency;

    public static void main(String[] args) {
        getData();
        showResult();
    }

    public static void getData() {
        scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter the deposit amount: ");
        depAmount = scanner.nextDouble();
        System.out.println("""
                Enter the term of the deposit:
                1 - one year;
                2 - five years;
                3 - ten years.
                """);
        depTerm = scanner.nextInt();

        switch (depTerm) {
            case 1 -> calcData(depAmount, 1);
            case 2 -> calcData(depAmount, 5);
            case 3 -> calcData(depAmount, 10);
            default -> {
                System.out.println("Invalid command, try again.");
                scanner.close();
                System.exit(0);
            }
        }

        scanner.close();
    }

    public static void calcData(double amount, int term) {
        if (term == 1) {
            depPercents = amount * term * 0.1;// 1 year - 10%
        } else if (term == 5) {
            depPercents = amount * term * 0.12;// 5 years - 12% per year
        } else depPercents = amount * term * 0.15;// 10 years - 15% per year
    }

    public static void showResult() {
        currency = "UAH";

        System.out.printf("Hello %s %s! " +
                "Your percentages on the deposit will be %.2f %s.", firstName, lastName, depPercents, currency);
    }

}
