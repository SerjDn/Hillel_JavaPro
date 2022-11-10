package homework13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book: \n(Help: You have to enter <java>)");
        bookManager.setBookName(scanner.nextLine());
        if (bookManager.processBook(bookManager.getBookName())) {
            bookManager.showBookInfo();
        } else {
            System.exit(0);
            scanner.close();
        }

        System.out.println("Do you want to add this statistic in the file?");
        System.out.println("1 - Yes\n2 - No (close the app)");
        int addStat = scanner.nextInt();
        switch (addStat) {
            case 1 -> {
                bookManager.addToFile(bookManager.getBookName());
                System.out.println("Ok. See more info in statistic-file.");
            }
            case 2 -> {
                System.out.println("Closing...");
                System.exit(0);
            }
            default -> {
                System.out.println("Unknown command! Try again...");
                System.exit(0);
            }
        }
        scanner.close();
    }
}
