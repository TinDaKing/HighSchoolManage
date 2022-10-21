package backend_d6;

public class Student {
	private int ID;
	private String name;
	private int classID;
	private String contactInfo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int iD, String name, int classID, String contactInfo) {
		super();
		ID = iD;
		this.name = name;
		this.classID = classID;
		this.contactInfo = contactInfo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassID() {
		return classID;
	}
}
