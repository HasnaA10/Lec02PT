module com.example.lec02pt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lec02pt to javafx.fxml;
    exports com.example.lec02pt;
}