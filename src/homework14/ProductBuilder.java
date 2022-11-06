package homework14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProductBuilder {

    List<Product> products = new ArrayList<>();
    List<Product> filterProducts = new ArrayList<>();

    public List<Product> addProduct(String type, int price) {
        products.add(new Product(type, price));
        return products;
    }

    public List<Product> filterProduct(List<Product> products, String type) {
        filterProducts = products.stream()
                .filter(s -> s.getType().equals(type))
                .filter(s -> s.getPrice() > 250)
                .collect(Collectors.toList());
        return filterProducts;
    }

    public List<Product> addProduct(String type, int price, boolean discount) {
        products.add(new Product(type, price, discount));
        return products;
    }

    public List<Product> filterProduct(List<Product> products, String type, boolean discount) {
        filterProducts = products.stream()
                .filter(s -> s.getType().equals(type))
                .filter(s -> s.getPrice() > 250)
                .filter(s -> s.isDiscount() == discount)
                .map(s -> {
                    s.setPrice(s.getPrice() - 1);
                    return s;
                })
                .collect(Collectors.toList());
        return filterProducts;
    }

    public List<Product> addProduct(String type, int price, LocalDateTime createDate) {
        products.add(new Product(type, price, createDate));
        return products;
    }

    public List<Product> filterProduct(List<Product> products, int count) {
        filterProducts = products.stream()
                .filter(s -> s.getCreateDate() != null)
                .sorted((s1, s2) -> s2.getCreateDate().compareTo(s1.getCreateDate()))
                .limit(count)
                .toList();
        return filterProducts;
    }

    public void calcPriceOfProducts(List<Product> products, String type, int year) {
        products.stream()
                .filter(s -> s.getCreateDate() != null)
                .forEach(s -> System.out.println(s.getCreateDate().getYear()));
    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "products=" + products +
                ", filterProducts=" + filterProducts +
                '}';
    }
}
