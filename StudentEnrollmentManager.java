package StudentEnrolmentManager;

public interface StudentEnrollmentManager {	
	public void addEnrollment(StudentEnrolment enroll);
	public void updateEnrollment(StudentEnrolment enroll, int index);
	public void deleteEnrollment(int index);
	public void getOne(int index);
	public void getAll();
}
