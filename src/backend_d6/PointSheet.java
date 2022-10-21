package backend_d6;

public class PointSheet {
	private int StudentID;
	private int year;
	private double YearFinalPoint;

	public PointSheet() {
		// TODO Auto-generated constructor stub
	}
	public PointSheet(int studentID, int year) {
		super();
		StudentID = studentID;
		this.year = year;
		YearFinalPoint = 1.0;
	}

	public double getYearFinalPoint() {
		return YearFinalPoint;
	}

	public int getStudentID() {
		return StudentID;
	}

	public int getYear() {
		return year;
	}
}
