package StudentEnrolmentManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentSystem implements StudentEnrollmentManager {
	protected List<Enrolment> enrollmentlist;
	protected List<Student> studentlist;
	protected List<Course> courselist;
	public EnrollmentSystem() {
		this.studentlist = new ArrayList<Student>();
		this.courselist = new ArrayList<Course>();
		this.enrollmentlist = new ArrayList<Enrolment>();
	}
	public void showCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name : ");			
		String sname = sc.nextLine();
		System.out.println("Enter semester : ");			
		String semester = sc.nextLine();
		System.out.println("Courses that "+ sname + " enrolled in sem 2021A are : ");
			for(int i=0; i < enrollmentlist.size();i++) {
				if(	enrollmentlist.get(i).getSname().equals(sname) && 
					enrollmentlist.get(i).getSemester().equals(semester)) {
					System.out.println(enrollmentlist.get(i).getCname());
				}
			}
		sc.close();
	 }
	public void showStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course name : ");
		String cname = sc.nextLine();
		System.out.println("Enter semester : ");			
		String semester = sc.nextLine();
		System.out.println("Students that enrolled in "+ cname + " in sem 2021A are : ");
		for(int i=0; i < enrollmentlist.size();i++) {
			if(	enrollmentlist.get(i).getCname().equals(cname) && 
				enrollmentlist.get(i).getSemester().equals(semester)) {
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
	public Enrolment newEnrollment() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student ID : ");
			String sID = sc.nextLine();
			System.out.println("Enter course name : ");
			String course = sc.nextLine();
			System.out.println("Enter semester : ");
			String sem = sc.nextLine();	
			Student enrollStudent = findStudent(sID);
			Course enrollCourse = findCourse(course);
			Enrolment newEnrollment = new Enrolment(enrollStudent, enrollCourse, sem);
			sc.close();
			return newEnrollment;
		 }
	public void printCSV(List<Enrolment> list) {
		try {
			PrintWriter pw = new PrintWriter(new File("C:\\Users\\asus\\eclipse-workspace\\Assignment1\\src\\StudentEnrolmentManager\\enrollments.csv"));
			StringBuilder sb = new StringBuilder();
			sb.append("Enrollment");
			sb.append(",");
			sb.append("Course");
			sb.append(",");
			sb.append("Student");
			sb.append("\n");
			
			for(int i=1;i<list.size()+1;i++) {
				sb.append(i);
				sb.append(",");
				sb.append(list.get(i-1).getCname());
				sb.append(",");
				sb.append(list.get(i-1).getSname());
				sb.append("\n");
			}
			pw.write(sb.toString());
			pw.close();
			System.out.println("Printed successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addEnrollment() {
		enrollmentlist.add(newEnrollment());
		System.out.println("Added Successfully");
	}
	@Override
	public void updateEnrollment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the enrollment that you want to replace : ");
		int index = sc.nextInt();	
		enrollmentlist.set(index,newEnrollment());
		System.out.println("Updated Succecssfully");	
		sc.close();
	}
	@Override
	public void deleteEnrollment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the enrollment that you want to delete : ");
		int index = sc.nextInt();
		enrollmentlist.remove(index);
		System.out.println("Deleted Successfully");
		sc.close();
	}
	@Override
	public void getOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the enrollment that you want to get: ");
		int index = sc.nextInt();
		if(index>enrollmentlist.size()) {
			System.out.println("Invalid index");
		}
		else {
			System.out.println("Student name : "+ enrollmentlist.get(index-1).getSname());
			System.out.println("Course name : " + enrollmentlist.get(index-1).getCname());
			System.out.println("Semester : "+ enrollmentlist.get(index-1).getSemester());
		}
		sc.close();
	}
	@Override
	public void getAll() {
		for(int i=1;i<enrollmentlist.size()+1;i++ ) {
			System.out.print(i+". ");
			System.out.println("Student name : "+ enrollmentlist.get(i-1).getSname());
			System.out.println("Course name : " + enrollmentlist.get(i-1).getCname());
			System.out.println("Semester : "+ enrollmentlist.get(i-1).getSemester());
			System.out.println("-----------------------");
		}
	}
}

