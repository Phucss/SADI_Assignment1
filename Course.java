package StudentEnrolmentManager;

public class Course {
	protected String ID;
	protected String name;
	protected int numbcredit;
	public Course(String ID, String name, int numbcredit) {
		this.ID = ID;
		this.name = name;
		this.numbcredit = numbcredit;
	}
	public Course() {
		ID="";
		name="";
		numbcredit=0;
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getNumbcredit() {
		return numbcredit;
	}
}
