import javafx.event.ActionEvent;

import java.io.IOException;

public class PaymentController extends BaseController{

    public void goToExit() throws IOException {
        MainApp.switchTo("HomePage.fxml");
    }
}
