package backend_d6;

public class PointSheetDetail {
	private int SubjectID;
	private int StudentID;
	private int TeacherID;
	private int year;
	private int semester;
	private double CourseAveragePoint;

	public PointSheetDetail() {
		// TODO Auto-generated constructor stub
	}

	public PointSheetDetail(int subjectID, int studentID, int teacherID, int year, int semester) {
		super();
		SubjectID = subjectID;
		StudentID = studentID;
		TeacherID = teacherID;
		this.year = year;
		this.semester = semester;
		CourseAveragePoint = 1.0;
	}


}
