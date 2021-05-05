package secondHomework;

public class CourseManager {
	public void add(Student student, Course course) {
		System.out.println(student.getStudentFirstName()+  student.getStudentLastName()+ course.getCourseName() + "  kursuna kaydoldu.");
	
	}
	public void delete(Student student, Course course) {
		System.out.println(student.getStudentFirstName() + student.getStudentLastName() + course.getCourseName() + " kursundan silindi.");
	
	}
	public void update(Student student, Course course) {
		System.out.println(student.getStudentFirstName() + student.getStudentLastName() + course.getCourseName() + " kurs bilgileri güncellendi.");
	
	}
	

}
