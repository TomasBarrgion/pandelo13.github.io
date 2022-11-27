module com.example.repasoej3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repasoej3 to javafx.fxml;
    exports com.example.repasoej3;
}