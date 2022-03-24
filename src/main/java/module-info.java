module com.example.repjegy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.repjegy to javafx.fxml;
    exports com.example.repjegy;
}