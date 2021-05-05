package secondHomework;

public class Course {
	int id;
	String courseName;
	String courseTeacher;
	
	public Course() {
		
	}
	
	public Course(int id, String courseName, String courseTeacher) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	

}
