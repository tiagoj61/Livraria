module tiago.j61 {
    requires javafx.controls;
    requires javafx.fxml;

    opens tiago.j61 to javafx.fxml;
    exports tiago.j61;
}
