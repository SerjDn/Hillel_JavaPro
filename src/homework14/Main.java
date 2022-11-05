package homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();

        productBuilder.addProduct("Book", 10);
        productBuilder.addProduct("Book", 12);
        productBuilder.addProduct("Cup", 5);
        productBuilder.addProduct("Cup", 7);
        System.out.println(productBuilder.products);

        productBuilder.filterProduct(productBuilder.products, "Book");
        System.out.println(productBuilder.goods);

    }
}
