public class Main {
    public static void main(String[] args) {
        // Initialize the Cart
        Cart cart = new Cart();

        // Populate the products array with item IDs and prices
        cart.products[0][0] = "item1";
        cart.products[0][1] = "100"; // Price of item1
        cart.products[1][0] = "item2";
        cart.products[1][1] = "200"; // Price of item2
        cart.products[2][0] = "item3";
        cart.products[2][1] = "300"; // Price of item3

        // Test 1: Add items to the cart
        System.out.println("=== Test 1: Adding Items ===");
        cart.addItem("item1", "1"); // Add item1 for Student 1
        cart.addItem("item2", "1"); // Add item2 for Student 1
        cart.addItem("item3", "2"); // Add item3 for Student 2
        printMainTable(cart);

        // Test 2: Remove an item from the cart
        System.out.println("=== Test 2: Removing Item ===");
        cart.removeItem("item1", "1"); // Remove item1 for Student 1
        printMainTable(cart);

        // Test 3: Add more items to ensure functionality
        System.out.println("=== Test 3: Adding More Items ===");
        cart.addItem("item1", "3"); // Add item1 for Student 3
        cart.addItem("item3", "3"); // Add item3 for Student 3
        printMainTable(cart);

        // Test 4: Remove an item that doesn't exist
        System.out.println("=== Test 4: Removing Non-Existent Item ===");
        cart.removeItem("item2", "4"); // Attempt to remove item2 for Student 4
        printMainTable(cart);
    }

    // Helper method to print the mainTable for debugging
    private static void printMainTable(Cart cart) {
        System.out.println("Main Table:");
        System.out.println("Student Name | Student ID | Items       | Total");
        for (String[] row : cart.mainTable) {
            System.out.printf("%13s | %10s | %-11s | %s%n",
                    row[0], row[1], row[2], row[3]);
        }
        System.out.println();
    }
}
