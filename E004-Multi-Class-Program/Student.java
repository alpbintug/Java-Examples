package ex004;

public class Student {
	private String name;
	private String ID;
	private String _class;
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
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public Student() {
	}
	public Student(String name, String iD, String _class) {
		this.name = name;
		ID = iD;
		this._class = _class;
	}
	

}
