package homework11.coffee.order;

import java.util.ArrayList;

public class CoffeeOrderBoard {

    private ArrayList<Order> listOfOrders;
    private int currentNumber;

    public CoffeeOrderBoard() {
        this.listOfOrders = new ArrayList<>();
        this.currentNumber = 0;
    }

    public void add(String name) {
        Order order = new Order(name, getNextNumber());
        this.listOfOrders.add(order);
    }

    private int getNextNumber() {
        this.currentNumber += 1;
        return this.currentNumber;
    }

    public Order deliver() {
        Order order = listOfOrders.get(0);
        listOfOrders.remove(0);
        return order;
    }

    public Order deliverByNumber(int number) {
        int index = -1;

        for(int i = 0; i < listOfOrders.size(); i++) {
            if (listOfOrders.get(i).getNumber() == number) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("I can't find order number: " + number);
            return null;
        } else {
            Order order = listOfOrders.get(index);
            listOfOrders.remove(index);
            return order;
        }
    }

    public void draw() {
        System.out.println("Num | Name");
        for (Order order : listOfOrders) {
            System.out.println("  " + order.getNumber() + " | " + order.getName());
        }
    }
}
