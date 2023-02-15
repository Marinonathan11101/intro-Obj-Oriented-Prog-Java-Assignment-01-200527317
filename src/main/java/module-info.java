module com.example.assignment01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment01 to javafx.fxml;
    exports com.example.assignment01;
}