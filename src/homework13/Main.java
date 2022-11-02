package homework13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        final String ERROR = "Unknown command! Try again...";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the name of the book: \n(Help: You have to enter <java>)");
            if (bookManager.findBook(scanner.nextLine())) {
                bookManager.showBookInfo();
            } else {
                System.exit(0);
            }

            System.out.println("Do you want to add this statistic in the file?");
            System.out.println("1 - Yes\n2 - No (close the app)");
            int addStat = scanner.nextInt();
            switch (addStat) {
                case 1 -> {
                    bookManager.addToFile();
                    System.out.println("Ok. See more info in statistic-file.");
                }
                case 2 -> {
                    System.out.println("Closing...");
                    System.exit(0);
                }
                default -> {
                    System.out.println(ERROR);
                    System.exit(0);
                }
            }
        } catch (RuntimeException e) {
            System.out.println(ERROR);
        }

    }
}
