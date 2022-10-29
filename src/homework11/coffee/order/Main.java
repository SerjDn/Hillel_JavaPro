package homework11.coffee.order;

public class Main {

    public static void main(String[] args) {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        System.out.println("================================================");
        System.out.println("Method 'add' working:");
        System.out.println("================================================");
        board.add("Alex");
        board.add("Joe");
        board.add("Mary");
        board.add("Bob");
        board.add("Dave");
        board.draw();

        System.out.println("================================================");
        System.out.println("Method 'deliver' working:");
        System.out.println("================================================");
        Order firstOrder = board.deliver();
        System.out.println(firstOrder.getNumber() + " | " + firstOrder.getName()  + " -> Your order has been completed!\n");
        board.draw();

        System.out.println("================================================");
        System.out.println("Method 'deliverByNumber' working:");
        System.out.println("================================================");
        Order secondOrder = board.deliverByNumber(5);
        System.out.println(secondOrder.getNumber() + " | " + secondOrder.getName()  + " -> Your order has been completed!\n");
        board.draw();
    }
}
