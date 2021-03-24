package StudentEnrolmentManager;

public class Student {
	protected String ID;
	protected String name;
	protected String birthdate;
	
	public Student() {
		ID="";
		name="";
		birthdate="";
	}
	public Student(String ID,String name,String birthdate) {
		this.ID = ID;
		this.name = name;
		this.birthdate = birthdate;
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	
}
