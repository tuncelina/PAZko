package sk.upjs.prezencka;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SubjectEditController {

	@FXML
	private ListView<String> studentListView;

	@FXML
	private TextField studentNameTextField;

	@FXML
	private Button addStudentButton;

	@FXML
	private TableView<String> studentsTableView;

	@FXML
	void initialize() {
		TableColumn<String, String> nameCol = new TableColumn<String, String>("Meno");
		nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
		studentsTableView.getColumns().add(nameCol);

		addStudentButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				studentListView.getItems().add("Fero");
				studentsTableView.getItems().add("Fero");

			}
		});

	}
}
