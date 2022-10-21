package backend_d6;

public class Teacher {
	private int ID;
	private String name;
	private int absence;
	private double salary;
	private int ClassID;
	private String contactInfo;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int iD, String name, int absence, double salary, int classID, String contactInfo) {
		super();
		ID = iD;
		this.name = name;
		this.absence = absence;
		this.salary = salary;
		ClassID = classID;
		this.contactInfo = contactInfo;
	}

}
