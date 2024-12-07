import javafx.application.Application;
import javafx.stage.Stage;

public class StoreController extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
    public void goToCart() {
        try {
            MainApp.switchTo("Cart.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
