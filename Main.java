package StudentEnrolmentManager;
import java.io.File;
import java.util.Scanner;

public class Main {
	 public static void main(String args[]) {
		
		EnrollmentSystem admin = new EnrollmentSystem();
		String filename = "";
		System.out.println("Do you have your own CSV file ? (y/n)");
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		
		
		switch (userinput.toLowerCase()) {
		case "y": 
			System.out.println("Enter the path of the CSV file :");
			userinput = sc.nextLine();
			filename = userinput;
			break;
		case "n": 
			filename = "C:\\Users\\asus\\eclipse-workspace\\Assignment1\\src\\StudentEnrolmentManager\\default.csv";
			break;
		default: 
			System.out.println("Invalid input");
		
		}
		
		
		File file = new File(filename);
		
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] enrollment = data.split(",");

				admin.studentlist.add(new Student(enrollment[0],enrollment[1],enrollment[2]));
				admin.courselist.add(new Course(enrollment[3],enrollment[4],enrollment[5]));
				admin.enrollmentlist.add(new Enrolment(
						new Student(enrollment[0],enrollment[1],enrollment[2]), 
						new Course(enrollment[3],enrollment[4],enrollment[5]),
						enrollment[6]));
			}
			inputStream.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		//Create a menu interface
		System.out.println("=======MENU=======");
		System.out.println("1. Enroll a course");
		System.out.println("2. Update an enrollment");
		System.out.println("3. Delete an enrollment");
		System.out.println("4. View an enrollment");
		System.out.println("5. View all enrollment");
		System.out.println("6. Show all students in the course");
		System.out.println("7. Show all courses that student enrolled");
		System.out.println("8. Print all enrollments to CSV file");
		userinput = sc.nextLine();
		
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
			admin.getOne();
			break;
		}
		case "5": {
			admin.getAll();
			break;
		}
		case "6": {
			admin.showStudent();
			break;
		}
		case "7": {
			admin.showCourse();
			break;
		}
		case "8": {
			admin.printCSV(admin.enrollmentlist);
			break;
		}
		default:{
			System.out.println("Unvalid input. Please try again");
		}
		sc.close();
	}
		

	
}



}
