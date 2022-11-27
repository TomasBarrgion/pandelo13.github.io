module com.example.repasoej1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repasoej1 to javafx.fxml;
    exports com.example.repasoej1;
}