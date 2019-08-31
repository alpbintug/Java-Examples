package ex004;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setID("1249143");
		student1.setName("Leeroy Jenkins");
		
		Student student2 = new Student("Zula", "0142069");

		Class scienceClass = new Class("Science Class");
		scienceClass.students.add(student1);
		scienceClass.students.add(student2);
		
		System.out.println("Class name: " + scienceClass.className);
		System.out.println("Students:");
		for (Student student : scienceClass.students) {
			System.out.println(student.getName());
		}
		/*Output:
		Class name: Science Class
		Students:
		Leeroy Jenkins
		Zula
		*/

	}

}
