package homework14;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();

        productBuilder.addProduct("Book", 200);
        productBuilder.addProduct("Book", 300);
        productBuilder.addProduct("Cup", 100);
        productBuilder.addProduct("Cup", 150);
        System.out.println(productBuilder.products);
        productBuilder.filterProduct(productBuilder.products, "Book");
        System.out.println(productBuilder.filterProducts);

        productBuilder.addProduct("Book", 350, true);
        productBuilder.addProduct("Book", 400, false);
        System.out.println(productBuilder.products);
        productBuilder.filterProduct(productBuilder.products, "Book", true);
        System.out.println(productBuilder.filterProducts);

        productBuilder.addProduct("Book", 370, LocalDateTime.now());
        productBuilder.addProduct("Book", 375, LocalDateTime.now());
        productBuilder.addProduct("Toy", 400, LocalDateTime.now());
        productBuilder.addProduct("Toy", 450, LocalDateTime.now());
        System.out.println(productBuilder.products);
        productBuilder.filterProduct(productBuilder.products, 3);
        System.out.println(productBuilder.filterProducts);

        productBuilder.calcPriceOfProducts(productBuilder.products, "Book", 2022, 75);

        productBuilder.groupingProducts(productBuilder.products);

    }
}
