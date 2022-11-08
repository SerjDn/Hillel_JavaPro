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
        System.out.println(productBuilder.filterProducts(productBuilder.products, "Book") + "\n" + LINE_SEPARATOR);

        System.out.println("Task 2:");
        productBuilder.addProduct("Book", 350, true);
        productBuilder.addProduct("Book", 400, false);
        productBuilder.addProduct("Book", 450, true);
        System.out.println(productBuilder.products);
        System.out.println(productBuilder.discountProduct(productBuilder.products, "Book", true) + "\n" + LINE_SEPARATOR);

        System.out.println("Task 3:");
        System.out.println(productBuilder.getCheapProduct(productBuilder.products, "Cup") + "\n" + LINE_SEPARATOR);

        System.out.println("Task 4:");
        productBuilder.addProduct("Book", 370, LocalDateTime.now());
        productBuilder.addProduct("Book", 375, LocalDateTime.now());
        productBuilder.addProduct("Toy", 400, LocalDateTime.now());
        productBuilder.addProduct("Toy", 450, LocalDateTime.now());
        System.out.println(productBuilder.products);
        System.out.println(productBuilder.getLastProducts(productBuilder.products, 3) + "\n" + LINE_SEPARATOR);

        System.out.println("Task 5:");
        productBuilder.addProduct("Book", 70, LocalDateTime.now());
        productBuilder.addProduct("Book", 60, LocalDateTime.now());
        System.out.println(productBuilder.products);
        productBuilder.calcPriceOfProducts(productBuilder.products, "Book", 2022, 75);
        System.out.println(LINE_SEPARATOR);

        System.out.println("Task 6:");
        productBuilder.groupProducts(productBuilder.products);
    }
}
