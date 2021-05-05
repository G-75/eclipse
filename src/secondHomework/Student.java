package secondHomework;

public class Student {
	int id;
	String studentFirstName;
	String studentLastName;
	
	public Student() {
		
	}
	
	public Student(int id, String studentFirstName, String studentLastName) {
		super();
		this.id = id;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	
}
