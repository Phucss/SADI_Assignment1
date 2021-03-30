package StudentEnrolmentManager;
import java.util.Scanner;

public class Main {
	 public static void main(String args[]) {
		//Populate the Student, Course and Enrollment
		EnrollmentSystem admin = new EnrollmentSystem();
		//Create 3 students
		Student student1 = new Student("12345","phuc","17/01/1999");
		Student student2 = new Student("54321","john","15/03/1998");
		Student student3 = new Student("56789","andrew","23/07/1999");
		//Add student to Student list
		admin.studentlist.add(student1);
		admin.studentlist.add(student2);
		admin.studentlist.add(student3);
		//Create 3 courses
		Course course1 = new Course("C001","SADI",12);
		Course course2 = new Course("C002","SEPM",12);
		Course course3 = new Course("C003","Programming 1",12);
		//Add course to course list
		admin.courselist.add(course1);
		admin.courselist.add(course2);
		admin.courselist.add(course3);
		//Create enrollments
		StudentEnrolment enrol1 = new StudentEnrolment(student1,course1,"2021A");
		StudentEnrolment enrol2 = new StudentEnrolment(student2,course2,"2021A");
		StudentEnrolment enrol3 = new StudentEnrolment(student3,course2,"2021A");
		//add the enrollment into the list
		admin.enrollmentlist.add(enrol1);
		admin.enrollmentlist.add(enrol2);
		admin.enrollmentlist.add(enrol3);
		//Create a menu interface
		Scanner sc = new Scanner(System.in);
		System.out.println("Current Enrollment");
		admin.getAll();
		System.out.println("=====MENU=====");
		System.out.println("1. Enroll a course");
		System.out.println("2. Update an enrollment");
		System.out.println("3. Delete an enrollment");		
		System.out.println("4. Show all students in the course");
		System.out.println("5. show all courses that student enrolled");		
		String userinput = sc.nextLine();
		
		switch (userinput) {
		case "1": {
			admin.addEnrollment();
			admin.getAll();
			break;
		}
		case "2":{
			admin.updateEnrollment();
			admin.getAll();
			break;
		}
		case "3":{
			admin.deleteEnrollment();
			admin.getAll();
			break;
		}
		case "4": {
			admin.showStudent();
			break;
		}
		case "5": {
			admin.showCourse();
			break;
		}
		default:{
			System.out.println("Unvalid input. Please try again");
		}
		sc.close();
	}
		

	
}



}
