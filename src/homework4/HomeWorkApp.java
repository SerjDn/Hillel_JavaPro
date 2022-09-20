package homework4;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        compareTwoNumbers(3, 17);
        isNumPositiveOrNegative(0);
        isThisNumberNegative(-1);
        printString("This is a string...", 3);
        isYearLeap(2024);
    }

    public static void printThreeWords() {
        System.out.println("1)======================================");
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        System.out.println("2)======================================");

        int a = 11;
        int b = -22;

        if (a + b >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }

    public static void printColor() {
        System.out.println("3)======================================");

        int value = 0;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        System.out.println("4)======================================");

        int a = 5;
        int b = -5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void compareTwoNumbers(int num1, int num2) {
        System.out.println("5)======================================");

        int sum = num1 + num2;

        System.out.println(sum >= 10 && sum <= 20);
    }

    public static void isNumPositiveOrNegative(int num) {
        System.out.println("6)======================================");

        if (num >= 0) {
            System.out.printf("%d is a positive number.\n", num);
        } else  {
            System.out.printf("%d is a negative number.\n", num);
        }
    }

    public static void isThisNumberNegative(int num) {
        System.out.println("7)======================================");

        System.out.println(num < 0);
    }

    public static void printString(String str, int num) {
        System.out.println("8)======================================");

        do {
            System.out.println(str);
            num--;
        }
        while (num > 0);
    }

    public static void isYearLeap(int year) {
        System.out.println("9)======================================");

        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
