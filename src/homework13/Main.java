package homework13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book read = new Book();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book: \n(Help: You have to enter <java>)");
        read.findBook(scanner.nextLine());

    }

}
