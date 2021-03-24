package StudentEnrolmentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	 public static Student getStudent(String ID, List<Student> list) {
		Student a= new Student();
		for(Student i : list) {
			if(i.getID().equals(ID)) {
				a= i;
			}
		}
		return a;
	}
	 public static Course getCourse(String name, List<Course> list) {
		
		Course a= new Course();
		for(Course i : list) {
			if(i.getID().equals(name)) {
				a= i;
			}
		}
		return a;
	}
	 public static void enroll(List<Student> studentlist,List<Course> courselist,List<StudentEnrolment> studentenrollmentlist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID : ");
		String sID = sc.nextLine();
		System.out.println("Enter semester : ");
		String sem = sc.nextLine();	
		System.out.println("Enter course name : ");
		String course = sc.nextLine();
		Student enrollStudent = getStudent(sID,studentlist);
		Course enrollCourse = getCourse(course, courselist);
		StudentEnrolment newEnrollment = new StudentEnrolment(enrollStudent, enrollCourse, sem);
		studentenrollmentlist.add(newEnrollment);
		System.out.println("Enrolled Successfully");
		sc.close();
	 }
	 public static void showCourse(List<StudentEnrolment> studentenrollmentlist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name : ");			
		String sname = sc.nextLine();
		System.out.println("Course that "+ sname + " enrolled are : ");
			for(int i=0; i < studentenrollmentlist.size();i++) {
				if(	studentenrollmentlist.get(i).getSname().equals(sname) && 
					studentenrollmentlist.get(i).getSemester().equals("2021A")) {
					System.out.println(studentenrollmentlist.get(i).getCname());
				}
			}
		sc.close();
	 }
	 public static void showStudent(List<StudentEnrolment> studentenrollmentlist) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter course name : ");
		String cname = sc.nextLine();
		System.out.println("Students that enrolled in "+ cname + " are : ");
		for(int i=0; i < studentenrollmentlist.size();i++) {
			if(	studentenrollmentlist.get(i).getCname().equals(cname) && 
				studentenrollmentlist.get(i).getSemester().equals("2021A")) {
				System.out.println(studentenrollmentlist.get(i).getSname());
				}
			}
		sc.close();
	 }
	 public static void main(String args[]) {
		//Populate the Student, Course and Enrollment
		//Create 2 students
		Student student1 = new Student("12345,","phuc","17/01/1999");
		Student student2 = new Student("54321,","john","15/03/1998");
		Student student3 = new Student("56789,","andrew","23/07/1999");
		//Create Student list
		List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		//Create 2 courses
		Course course1 = new Course("C001","SADI",12);
		Course course2 = new Course("C002","SEPM",12);
		Course course3 = new Course("C003","Programming 1",12);
		//Create course list
		List<Course> CourseList = new ArrayList<Course>();
		CourseList.add(course1);
		CourseList.add(course2);
		CourseList.add(course3);
		//Create enrollments
		StudentEnrolment enrol1 = new StudentEnrolment(student1,course1,"2021A");
		StudentEnrolment enrol2 = new StudentEnrolment(student2,course2,"2021A");
		StudentEnrolment enrol3 = new StudentEnrolment(student1,course2,"2021A");
		StudentEnrolment enrol4 = new StudentEnrolment(student3,course1,"2021A");
		StudentEnrolment enrol5 = new StudentEnrolment(student3,course2,"2021A");
		//Create a StudentEnrolment list
		List<StudentEnrolment> StudentEnrolmentList = new ArrayList<StudentEnrolment>();
		//add the enrollment into the list
		StudentEnrolmentList.add(enrol1);
		StudentEnrolmentList.add(enrol2);
		StudentEnrolmentList.add(enrol3);
		StudentEnrolmentList.add(enrol4);
		StudentEnrolmentList.add(enrol5);
		
		// Display list of students
		System.out.println("The Student List : ");
		for(Student i : StudentList) {
			System.out.println(i.getName());
		}
		//Create a menu interface
		Scanner sc = new Scanner(System.in);
		String quit = "n";
		System.out.println("=====MENU=====");
		System.out.println("1. Enroll a course");
		System.out.println("2. Show all students in the course");
		System.out.println("3. show all courses that student enrolled");		
		String userinput = sc.nextLine();
		switch (userinput) {
		case "1": {
			enroll(StudentList, CourseList, StudentEnrolmentList);
			break;
		}
		case "2": {
			showStudent(StudentEnrolmentList);
			break;
		}
		case "3": {
			showCourse(StudentEnrolmentList);
			break;
		}
		default:{
			System.out.println("Unvalid input. Please try again");
		}
	}

	
}


}
