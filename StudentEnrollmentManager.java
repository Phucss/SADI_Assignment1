package StudentEnrolmentManager;

import java.util.List;

public interface StudentEnrollmentManager {
	public void addEnrollment(List<StudentEnrolment> list, StudentEnrolment enroll);
	public void updateEnrollment(List<StudentEnrolment> list, StudentEnrolment enroll,int index);
	public void deleteEnrollment(List<StudentEnrolment> list, int index);
	public void getOne(StudentEnrolment enrollment);
	public void getAll();	
}
