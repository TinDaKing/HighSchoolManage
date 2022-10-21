package backend_d6;

public class Course {
	private int SubjectID;
	private int TeacherID;
	private int year;
	private String schedule;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int subjectID, int teacherID, int year, String schedule) {
		super();
		SubjectID = subjectID;
		TeacherID = teacherID;
		this.year = year;
		this.schedule = schedule;
	}

}
