package homework14;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();
        final String LINE_SEPARATOR = "================================================================================";

        System.out.println("Task 1:");
        productBuilder.addProduct("Book", 200);
        productBuilder.addProduct("Book", 300);
        productBuilder.addProduct("Cup", 100);
        productBuilder.addProduct("Cup", 150);
        System.out.println(productBuilder.products);
        System.out.println(productBuilder.filterProducts("Book") + "\n" + LINE_SEPARATOR);

        System.out.println("Task 2:");
        productBuilder.addProduct("Book", 350, true);
        productBuilder.addProduct("Book", 400, false);
        productBuilder.addProduct("Book", 450, true);
        System.out.println(productBuilder.products);
        System.out.println(productBuilder.discountProduct("Book", true) + "\n" + LINE_SEPARATOR);

        System.out.println("Task 3:");
        try {
            System.out.println(productBuilder.getCheapProduct("Pen") + "\n" + LINE_SEPARATOR);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage() + "\n" + LINE_SEPARATOR);
        }

        System.out.println("Task 4:");
        productBuilder.addProduct("Book", 370, LocalDateTime.now());
        productBuilder.addProduct("Book", 375, LocalDateTime.now());
        productBuilder.addProduct("Toy", 400, LocalDateTime.now());
        productBuilder.addProduct("Toy", 450, LocalDateTime.now());
        System.out.println(productBuilder.products);
        System.out.println(productBuilder.getLastProducts(3) + "\n" + LINE_SEPARATOR);

        System.out.println("Task 5:");
        productBuilder.addProduct("Book", 70, LocalDateTime.now());
        productBuilder.addProduct("Book", 60, LocalDateTime.now());
        System.out.println(productBuilder.products);
        productBuilder.calcPriceOfProducts("Book", 2022, 75);
        System.out.println(LINE_SEPARATOR);

        System.out.println("Task 6:");
        productBuilder.groupProducts();
    }
}
