package secondHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id= 5;
		student1.studentFirstName= "G�lsevim";
		student1.studentLastName = "�ener";
		
		
		
		Course course1 = new Course();
		course1.id = 2;
		course1.courseName= "Yazilim geli�tirici yeti�tirme kamp� (Java+ React)";
		course1.courseTeacher = "Engin Demiro�";
		
		student1.setId(5);
		student1.setStudentFirstName("G�lsevim");
		student1.setStudentLastName("Sener");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(student1, course1);
		
		
			
	
		

	}

}
