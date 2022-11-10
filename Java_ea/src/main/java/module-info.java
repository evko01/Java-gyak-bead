module com.example.java_ea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_ea to javafx.fxml;
    exports com.example.java_ea;
}