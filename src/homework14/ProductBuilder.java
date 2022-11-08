package homework14;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ProductBuilder {

    List<Product> products = new ArrayList<>();
    public static final double DISCOUNT_MULTIPLIER = 0.9;

    public void addProduct(String type, int price) {
        products.add(new Product(type, price));
    }

    public List<Product> filterProducts(String type) {
        List<Product> filteredProducts = products.stream()
                .filter(s -> s.getType().equals(type))
                .filter(s -> s.getPrice() > 250)
                .collect(Collectors.toList());
        return filteredProducts;
    }

    public void addProduct(String type, int price, boolean discount) {
        products.add(new Product(type, price, discount));
    }

    public List<Product> discountProduct(String type, boolean discount) {
        List<Product> discountedProducts = products.stream()
                .filter(s -> s.getType().equals(type))
                .filter(s -> s.isDiscount() == discount)
                .map(s -> new Product(s.getType(), (int) (s.getPrice() * DISCOUNT_MULTIPLIER), s.isDiscount()))
                .collect(Collectors.toList());
        return discountedProducts;
    }

    public List<Product> getCheapProduct(String type) {
        List<Product> theCheapest = products.stream()
                .filter(s -> s.getType().equals(type))
                .sorted((s1, s2) -> s1.getPrice() - s2.getPrice())
                .limit(1)
                .collect(Collectors.toList());
        if (theCheapest.isEmpty()) {
            throw new RuntimeException("Product " + "<" + type + ">" + " not found");
        }
        return theCheapest;
    }

    public void addProduct(String type, int price, LocalDateTime createDate) {
        products.add(new Product(type, price, createDate));
    }

    public List<Product> getLastProducts(int count) {
        List<Product> lastProducts = products.stream()
                .filter(s -> s.getCreateDate() != null)
                .sorted((s1, s2) -> s2.getCreateDate().compareTo(s1.getCreateDate()))
                .limit(count)
                .toList();
        return lastProducts;
    }

    public void calcPriceOfProducts(String type, int year, int price) {
        int priceForAll = 0;
        List<Product> filteredProducts = products.stream()
                .filter(s -> s.getType().equals(type))
                .filter(s -> s.getCreateDate() != null)
                .filter(s -> s.getCreateDate().getYear() == year)
                .filter(s -> s.getPrice() <= price)
                .toList();

        for (int i = 0; i < filteredProducts.size(); i++) {
            priceForAll += filteredProducts.get(i).getPrice();
        }
        System.out.println("\nList of " + "<" + type + "> after filter:\n" + filteredProducts);
        System.out.println("Price for all goods is: " + priceForAll);
    }

    public void groupProducts() {
        Map<String, List<Product>> mapOfProducts = products.stream()
                .collect(Collectors.groupingBy(s -> s.getType()));
        System.out.println(mapOfProducts);
    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "products=" + products +
                '}';
    }
}
