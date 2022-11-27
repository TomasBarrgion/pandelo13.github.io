module com.example.ejrepaso9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejrepaso9 to javafx.fxml;
    exports com.example.ejrepaso9;
}