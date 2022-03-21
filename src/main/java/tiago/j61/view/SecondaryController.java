package tiago.j61.view;

import java.io.IOException;

import javafx.fxml.FXML;
import tiago.j61.controller.App;

public class SecondaryController {

	@FXML
	private void switchToPrimary() throws IOException {
		App.setRoot("primary");
	}
}