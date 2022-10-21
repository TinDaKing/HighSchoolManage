package backend_d6;

public class ExamType {
	private String type;
	private double multiplication;
	
	public ExamType() {
		// TODO Auto-generated constructor stub
	}

	public ExamType(String type, double multiplication) {
		super();
		this.type = type;
		this.multiplication = multiplication;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public double getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(double multiplication) {
		this.multiplication = multiplication;
	}
	
}
