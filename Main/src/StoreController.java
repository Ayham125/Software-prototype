import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StoreController extends BaseController {

    // Add FXML references to the buttons
    @FXML
    private Button addItemAppleButton;
    @FXML
    private Button addItemMilkButton;
    @FXML
    private Button addItemBreadButton;
    @FXML
    private Button removeItemAppleButton;
    @FXML
    private Button removeItemMilkButton;
    @FXML
    private Button removeItemBreadButton;
    @FXML
    private Button backButton;
    @FXML
    private Button checkoutButton;

    // Initialize the controller
    @FXML
    public void initialize() {
        // Set button actions
        addItemAppleButton.setOnAction(e -> addItem("Apple", "4"));
        addItemMilkButton.setOnAction(e -> addItem("Milk", "4"));
        addItemBreadButton.setOnAction(e -> addItem("Bread", "4"));

        removeItemAppleButton.setOnAction(e -> removeItem("Apple", "4"));
        removeItemMilkButton.setOnAction(e -> removeItem("Milk", "4"));
        removeItemBreadButton.setOnAction(e -> removeItem("Bread", "4"));

        backButton.setOnAction(e -> goToHome());
        checkoutButton.setOnAction(e -> goToCheckout());
    }

    // Add an item to the cart
    private void addItem(String itemId, String SID) {
        cart.addItem(itemId, SID);
        System.out.println("Added " + itemId + " for Student ID: " + SID);
    }

    // Remove an item from the cart
    private void removeItem(String itemId, String SID) {
        cart.removeItem(itemId, SID);
        System.out.println("Removed " + itemId + " for Student ID: " + SID);
    }

    // Navigate to the home page
    private void goToHome() {
        try {
            MainApp.switchTo("HomePage.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Navigate to the checkout page
    private void goToCheckout() {
        try {
            MainApp.switchTo("Checkout.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
