import java.io.IOException;

public class HomePageController extends BaseController {
    public void goToCart() throws IOException {
        MainApp.switchTo("Store.fxml"); // Switch to the Store page
    }
}
