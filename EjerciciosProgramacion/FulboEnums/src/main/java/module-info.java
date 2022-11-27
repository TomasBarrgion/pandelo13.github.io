module com.example.fulboenums {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fulboenums to javafx.fxml;
    exports com.example.fulboenums;
}