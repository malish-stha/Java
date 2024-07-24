module com.example.crud_app {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.crud_app to javafx.fxml;
    exports com.example.crud_app;
}