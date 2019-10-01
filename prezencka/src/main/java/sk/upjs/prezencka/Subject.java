package sk.upjs.prezencka;

import java.util.List;

public class Subject {

	private String name;
	private List<String> students;
	private List<Practice> practices;

	public List<Practice> getPractices() {
		return practices;
	}

	public List<String> getStudents() {
		return students;

	}

	public void setPractices(List<Practice> practices) {
		this.practices = practices;
	}

	public void addStudent(String stuedentName) {

	}

	public void modifyStudent(String oldName, String newName) {

	}

	public String getPresenceOfAll() {
		return null;
	}

}
