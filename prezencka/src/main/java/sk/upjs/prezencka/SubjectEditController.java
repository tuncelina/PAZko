package sk.upjs.prezencka;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
////////fsdfsdfds
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	private ListView<String> studentsListView;

	@FXML
	private TextField studentNameTextField;

	@FXML
	private Button addStudentButton;

	@FXML
	private TableView<String> studentsTableView;

	@FXML
	void initialize() {
		List<String> students = new ArrayList<String>();
		ObservableList<String> studentsModel = FXCollections.observableArrayList(students);
		studentsListView.setItems(studentsModel);
		studentsTableView.setItems(studentsModel);

		TableColumn<String, String> nameCol = new TableColumn<String, String>("Meno");
		nameCol.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
		studentsTableView.getColumns().add(nameCol);

		studentNameTextField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue != null && newValue.trim().length() > 0) {
					addStudentButton.setDisable(false);
				} else {
					addStudentButton.setDisable(true);
				}

			}
		});

		addStudentButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String studentName = studentNameTextField.getText();
				studentsModel.add(studentName);
				studentNameTextField.setText(null); // alebo ("")

			}
		});

	}
}
