package ex004;

import java.util.LinkedList;

public class Class {
	LinkedList<Student> students;
	String className;
	public Class(LinkedList<Student> students, String className) {
		students = new LinkedList<Student>(); //You have to allocate memory in order to use "students" linked list, otherwise you will get an exception.
		this.students = students;
		this.className = className;
	}
	public Class(String className) {
		this.className = className;
	}
	public Class() {
		students = new LinkedList<Student>(); //Yes. You have to allocate memory in all constructors.
	}
	public LinkedList<Student> getStudents() {
		return students;
	}
	public void setStudents(LinkedList<Student> students) {
		this.students = students;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	
}
