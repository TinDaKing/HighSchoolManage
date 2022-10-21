package backend_d6;

public class Classes {
	private int ID;
	private String name;
	private int PrimaryTeacherID;
	private int year;
	private int LocationID;
	
	public Classes() {
		// TODO Auto-generated constructor stub
	}

	public Classes(int iD, String name, int primaryTeacherID, int year, int locationID) {
		super();
		ID = iD;
		this.name = name;
		PrimaryTeacherID = primaryTeacherID;
		this.year = year;
		LocationID = locationID;
	}

	
}
