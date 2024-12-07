import javafx.application.Application;
import javafx.stage.Stage;

public class CheckoutController {

    public void goToHome() {
        try {
            // Call the static switchTo method to load HomePage.fxml
            MainApp.switchTo("Homepage.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

