package homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductBuilder {

    List<Product> products = new ArrayList<>();
    List<Product> goods = new ArrayList<>();

    public List<Product> addProduct(String type, int price) {
        products.add(new Product(type, price));
        return products;
    }

    public List<Product> filterProduct(List<Product> products, String type) {
        goods = products.stream()
                .filter(s -> s.getType().equals(type))
                .collect(Collectors.toList());
        return goods;
    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "products=" + products +
                '}';
    }
}
