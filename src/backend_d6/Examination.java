package backend_d6;

public class Examination {
	private int SubjectID;
	private int StudentID;
	private int TeacherID;
	private int year;
	private int semester;
	private String examType;
	private double grade;
	
	public Examination() {
		// TODO Auto-generated constructor stub
	}
	public Examination(int subjectID, int studentID, int teacherID, int year, int semester, String examType,
			double grade) {
		super();
		SubjectID = subjectID;
		StudentID = studentID;
		TeacherID = teacherID;
		this.year = year;
		this.semester = semester;
		this.examType = examType;
		this.grade = grade;
	}

	public String getExamType() {
		return examType;
	}
	public double getGrade() {
		return grade;
	}
	public int getSubjectID() {
		return SubjectID;
	}
	public int getSemester() {
		return semester;
	}
}
