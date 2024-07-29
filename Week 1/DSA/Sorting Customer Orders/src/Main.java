public class Main {
    public static void main(String[] args) {
        // Sample orders
        order[] orders = {
                new order("001", "Alice", 250.00),
                new order("002", "Bob", 150.00),
                new order("003", "Charlie", 300.00),
                new order("004", "David", 100.00),
                new order("005", "Eve", 200.00)
        };

        // Display original orders
        System.out.println("Original Orders:");
        for (order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        System.out.println("\nOrders sorted by Bubble Sort:");
        BubbleSort.bubbleSort(orders);
        for (order order : orders) {
            System.out.println(order);
        }

        // Resetting the order list to original unsorted order
        orders = new order[] {
                new order("001", "Alice", 250.00),
                new order("002", "Bob", 150.00),
                new order("003", "Charlie", 300.00),
                new order("004", "David", 100.00),
                new order("005", "Eve", 200.00)
        };

        // Quick Sort
        System.out.println("\nOrders sorted by Quick Sort:");
        QuickSort.quickSort(orders, 0, orders.length - 1);
        for (order order : orders) {
            System.out.println(order);
        }
    }
}
