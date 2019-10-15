package sk.upjs.prezencka;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SubjectEditController {


	@FXML
	private ListView<?> studentListView;

	@FXML
	private TextField studentNameTextField;

	@FXML
	private Button addStudentButton;

	@FXML
	void initialize() {
		addStudentButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("klik");
				
			}
		});

	}
}
