package homework14;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
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

    public void calcPriceOfProducts(List<Product> products, String type, int year, int price) {
        int priceForAll = 0;
        List<Product> sortedProducts = products.stream()
                .filter(s -> s.getType().equals(type))
                .filter(s -> s.getCreateDate() != null)
                .filter(s -> s.getCreateDate().getYear() == year)
                .filter(s -> s.getPrice() >= price)
                .toList();

        for (int i = 0; i < sortedProducts.size(); i++) {
            priceForAll += sortedProducts.get(i).getPrice();
        }
        System.out.println("==========================================");
        System.out.println("List of goods: " + sortedProducts);
        System.out.println("Price for all goods is: " + priceForAll);
        System.out.println("==========================================");
    }

    public void groupingProducts(List<Product> products) {
        Map<String, ArrayList<Product>> mapOfProducts = new HashMap<>();
        products.forEach(s -> {
            if (!mapOfProducts.containsKey(s.getType())) {
                mapOfProducts.put(s.getType(), new ArrayList<Product>());
            }
            mapOfProducts.get(s.getType()).add(s);
        });
        System.out.println(mapOfProducts);
    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "products=" + products +
                ", filterProducts=" + filterProducts +
                '}';
    }
}
