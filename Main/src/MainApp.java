import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private static Stage primaryStage;
    private static Cart cart = new Cart(); // Single Cart instance shared across the application

    @Override
        public static void main(String[] args) {
            launch(args);  // This is the entry point for JavaFX applications
        }
    public void start(Stage stage) throws Exception {
        primaryStage = stage;

        // Load the initial scene (HomePage)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(loader.load());

        // Pass the shared Cart instance to HomePageController
        BaseController controller = loader.getController();
        controller.setCart(cart);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Page");
        primaryStage.show();
    }

    // Method to switch scenes
    public static void switchTo(String fxmlFile) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // Pass the shared Cart instance to the next controller
            BaseController controller = loader.getController();
            controller.setCart(cart);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
