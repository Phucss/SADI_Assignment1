package StudentEnrolmentManager;

public class StudentEnrolment {

	protected Student student;
	protected Course course;
	protected String semester;
	
	public StudentEnrolment(Student student, Course course, String semester) {
		this.student = student;
		this.course = course;
		this.semester = semester;
	}
	public String getSname() {
		return this.student.getName();
	}
	public String getCname() {
		return this.course.getName();
	}
	public String getSemester() {
		return this.semester;
	}
}

