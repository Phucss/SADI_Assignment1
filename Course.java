package StudentEnrolmentManager;

public class Course {
	protected String ID;
	protected String name;
	protected String numbcredit;
	public Course(String ID, String name, String numbcredit) {
		this.ID = ID;
		this.name = name;
		this.numbcredit = numbcredit;
	}
	public Course() {
		ID="";
		name="";
		numbcredit="";
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getNumbcredit() {
		return numbcredit;
	}
}
