import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class CheckoutController extends BaseController {

    @FXML
    private TableView<StudentData> tableView;

    @FXML
    private TableColumn<StudentData, String> studentNameColumn;

    @FXML
    private TableColumn<StudentData, String> studentIdColumn;

    @FXML
    private TableColumn<StudentData, String> itemsColumn;

    @FXML
    private TableColumn<StudentData, String> totalColumn;

    public void initialize() {
        // Bind TableColumns to StudentData properties
        studentNameColumn.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        studentIdColumn.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        itemsColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
    }

    @Override
    public void setCart(Cart cart) {
        super.setCart(cart); // Set the cart in the BaseController
        loadTableData(); // Populate the table once the cart is available
    }

    private void loadTableData() {
        if (cart == null) {
            throw new IllegalStateException("Cart is not initialized!");
        }

        ObservableList<StudentData> data = FXCollections.observableArrayList();

        for (String[] row : cart.mainTable) {
            data.add(new StudentData(row[0], row[1], row[2], row[3]));
        }

        tableView.setItems(data);
    }
    public void goToStore() throws IOException {
        MainApp.switchTo("Store.fxml");
    }

    public void doPayment() throws IOException {
        MainApp.switchTo("Payment.fxml");
    }

    // Inner class to represent a row in the TableView
    public static class StudentData {
        private final String studentName;
        private final String studentId;
        private final String items;
        private final String total;

        public StudentData(String studentName, String studentId, String items, String total) {
            this.studentName = studentName;
            this.studentId = studentId;
            this.items = items;
            this.total = total;
        }

        // Getters for TableView to access
        public String getStudentName() {
            return studentName;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getItems() {
            return items;
        }

        public String getTotal() {
            return total;
        }
    }
}
