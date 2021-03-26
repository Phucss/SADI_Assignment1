package StudentEnrolmentManager;

import java.util.List;

public class StudentEnrolment implements StudentEnrollmentManager {

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
	@Override
	public void addEnrollment(List<StudentEnrolment> list, StudentEnrolment enroll) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateEnrollment(List<StudentEnrolment> list, StudentEnrolment enroll, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEnrollment(List<StudentEnrolment> list, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getOne(StudentEnrolment enrollment) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	

	
}

