module com.example.zelda_bo_hazard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zelda_bo_hazard to javafx.fxml;
    exports com.example.zelda_bo_hazard;
}