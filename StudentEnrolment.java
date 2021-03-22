package StudentEnrolmentManager;
import java.util.Scanner;

public class StudentEnrolment {
	public static void main(String argv[]) {
		Student student1 = new Student("12345,","Phuc","17/01/1999");
		Student student2 = new Student("54321,","John","15/03/1998");
		System.out.println("Enter Student ID : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);
		
	}
	protected String student;
	protected String course;
	protected String semester;
	
	
}

