module com.example.primerpruebovich {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primerpruebovich to javafx.fxml;
    exports com.example.primerpruebovich;
}