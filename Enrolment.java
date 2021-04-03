package StudentEnrolmentManager;

public class Enrolment {

	protected Student student;
	protected Course course;
	protected String semester;
	
	public Enrolment(Student student, Course course, String semester) {
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

