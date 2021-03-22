package StudentEnrolmentManager;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;


public class StudentEnrolment {
	public static void main(String args[]) {
		//Create 2 students
		Student student1 = new Student("12345,","phuc","17/01/1999");
		Student student2 = new Student("54321,","john","15/03/1998");
		//Create 2 courses
		Course course1 = new Course("C001","SADI",12);
		Course course2 = new Course("C002","SEPM",12);
		//Create enrollments
		StudentEnrolment enrol1 = new StudentEnrolment(student1,course1,"2021A");
		StudentEnrolment enrol2 = new StudentEnrolment(student2,course2,"2021A");
		StudentEnrolment enrol3 = new StudentEnrolment(student1,course2,"2021A");
		//Create a StudentEnrolment list
		List<StudentEnrolment> StudentEnrolmentList = new ArrayList<StudentEnrolment>();
		//add the enrollment into the list
		StudentEnrolmentList.add(enrol1);
		StudentEnrolmentList.add(enrol2);
		StudentEnrolmentList.add(enrol3);
		
		//Q5.1 Print all the course of 1 student
		System.out.println("Enter student name : ");
		Scanner sc = new Scanner(System.in);
		String sname = sc.nextLine();
		
		for(int i=0; i < StudentEnrolmentList.size();i++) {
			if(StudentEnrolmentList.get(i).getSname().equals(sname) && 
			   StudentEnrolmentList.get(i).getSemester().equals("2021A")) {
				System.out.println(StudentEnrolmentList.get(i).getCname());
			}
		}
		//Q5.2 Print all the student enroll in 1 course
		System.out.println("Enter course name : ");
		String cname = sc.nextLine();
		
		for(int i=0; i < StudentEnrolmentList.size();i++) {
			if(StudentEnrolmentList.get(i).getCname().equals(cname) && 
			   StudentEnrolmentList.get(i).getSemester().equals("2021A")) {
				System.out.println(StudentEnrolmentList.get(i).getSname());
			}
		}
		
		
//		System.out.print("Enter Student ID : ");
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		System.out.println(input);
		
		
	}
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

