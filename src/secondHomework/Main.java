package secondHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id= 5;
		student1.studentFirstName= "Gülsevim";
		student1.studentLastName = "Şener";
		
		
		
		Course course1 = new Course();
		course1.id = 2;
		course1.courseName= "Yazilim geliştirici yetiştirme kampı (Java+ React)";
		course1.courseTeacher = "Engin Demiroğ";
		
		student1.setId(5);
		student1.setStudentFirstName("Gülsevim");
		student1.setStudentLastName("Sener");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(student1, course1);
		
		
			
	
		

	}

}
