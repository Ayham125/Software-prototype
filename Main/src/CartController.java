import javafx.application.Application;
import javafx.stage.Stage;


public class CartController {
    public void goToHome() {
        try {
            // Call the static switchTo method to load HomePage.fxml
            MainApp.switchTo("HomePage.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

