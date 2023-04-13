module com.example.javafxdemotest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdemotest to javafx.fxml;
    exports com.example.javafxdemotest;
}