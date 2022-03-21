package tiago.j61.view;

import java.io.IOException;
import javafx.fxml.FXML;
import tiago.j61.controller.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
