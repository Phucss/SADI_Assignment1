package StudentEnrolmentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentSystem implements StudentEnrollmentManager {
	protected List<StudentEnrolment> enrollmentlist;
	protected List<Student> studentlist;
	protected List<Course> courselist;
	public EnrollmentSystem() {
		this.studentlist = new ArrayList<Student>();
		this.courselist = new ArrayList<Course>();
		this.enrollmentlist = new ArrayList<StudentEnrolment>();
	}
	 public void showCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name : ");			
		String sname = sc.nextLine();
		System.out.println("Courses that "+ sname + " enrolled in sem 2021A are : ");
			for(int i=0; i < enrollmentlist.size();i++) {
				if(	enrollmentlist.get(i).getSname().equals(sname) && 
					enrollmentlist.get(i).getSemester().equals("2021A")) {
					System.out.println(enrollmentlist.get(i).getCname());
				}
			}
		sc.close();
	 }
	 public void showStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course name : ");
		String cname = sc.nextLine();
		System.out.println("Students that enrolled in "+ cname + " in sem 2021A are : ");
		for(int i=0; i < enrollmentlist.size();i++) {
			if(	enrollmentlist.get(i).getCname().equals(cname) && 
				enrollmentlist.get(i).getSemester().equals("2021A")) {
				System.out.println(enrollmentlist.get(i).getSname());
				}
			}
		sc.close();
	 }
	public Student findStudent(String ID) {
			Student a = new Student();
			
			for(Student i : studentlist) {
				if(i.getID().equals(ID)) {
					a = i;
				}
			}
			return a;
		}
	public Course findCourse(String name) {
			Course b = new Course();
			for(Course i : courselist) {
				if(i.getName().equals(name)) {
					b = i;
				}
			}
			return b;
		}
	public StudentEnrolment newEnrollment() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student ID : ");
			String sID = sc.nextLine();
			System.out.println("Enter course name : ");
			String course = sc.nextLine();
			System.out.println("Enter semester : ");
			String sem = sc.nextLine();	
			Student enrollStudent = findStudent(sID);
			Course enrollCourse = findCourse(course);
			StudentEnrolment newEnrollment = new StudentEnrolment(enrollStudent, enrollCourse, sem);
			sc.close();
			return newEnrollment;
		 }
	@Override
	public void addEnrollment(StudentEnrolment enroll) {
		enrollmentlist.add(enroll);
		System.out.println("Added Successfully");
	}
	@Override
	public void updateEnrollment(StudentEnrolment enroll, int index) {
		enrollmentlist.set(index,enroll);
		System.out.println("Updated Succecssfully");	
	}
	@Override
	public void deleteEnrollment(int index) {
		enrollmentlist.remove(index);
		System.out.println("Deleted Successfully");
	}
	@Override
	public void getOne(int index) {
		System.out.println("Student name : "+ enrollmentlist.get(index-1).getSname());
		System.out.println("Course name : " + enrollmentlist.get(index-1).getCname());
		System.out.println("Semester : "+ enrollmentlist.get(index-1).getSemester());
		
	}
	@Override
	public void getAll() {
		for(int i=1;i<enrollmentlist.size()+1;i++ ) {
			getOne(i);
			System.out.println("-----------------------");
		}
	}
}

