package ex004;

public class Student {
	private String name;
	private String ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public Student() {
	}
	public Student(String name, String iD) {
		this.name = name;
		ID = iD;
	}
	

}
