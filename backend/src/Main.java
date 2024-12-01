import java.util.Arrays;

public static void main(String[] args) {
    Cart cart = new Cart();

    // Add some items
    cart.addItem("ItemA", "1");
    cart.addItem("ItemB", "1");
    cart.addItem("ItemC", "1");
    cart.addItem("ItemD", "2");

    // View initial items
    System.out.println("Before removal:");
    for (String[] row : cart.mainTable) {
        System.out.println(Arrays.toString(row));
    }

    // Remove an item
    cart.removeItem("ItemB", "1");

    // View items after removal
    System.out.println("\nAfter removing ItemB:");
    for (String[] row : cart.mainTable) {
        System.out.println(Arrays.toString(row));
    }

    // Remove all items
    cart.removeItem("ItemA", "1");
    cart.removeItem("ItemC", "1");

    // View after removing all items for Student 1
    System.out.println("\nAfter removing all items for Student 1:");
    for (String[] row : cart.mainTable) {
        System.out.println(Arrays.toString(row));
    }
}
