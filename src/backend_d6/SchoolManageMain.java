package backend_d6;

import java.util.Date;
import java.util.Scanner;

public class SchoolManageMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Tran Hoang Tin", 3, "tranhoangtin2002@gmail.com");
		Student s2 = new Student(2, "Phu Pham", 2, "phu048@gmail.com");
		Student s3 = new Student(3, "Duc Quang", 1, "quang123@gmail.com");
		Student s4 = new Student(4, "Huu Phuc", 1, "ngohuuphuc@gmail.com");
		Student s5 = new Student(5, "Sang", 3, "ppsang@gmail.com");
		Student[] allStu = { s1, s2, s3, s4, s5 };

		Classes c1 = new Classes(1, "10A9", 3, 2020, 1);
		Classes c2 = new Classes(2, "11A11", 1, 2021, 1);
		Classes c3 = new Classes(3, "12A13", 2, 2022, 1);
		Classes[] allClasses = { c1, c2, c3 };

		Teacher t1 = new Teacher(1, "Nguyen Van Vu", 3, 2, 4300, "nvu@fit.hcmus.vn");
		Teacher t2 = new Teacher(2, "Le Tuan Thu", 2, 0, 4300, "ltthu@fit.hcmus.vn");
		Teacher t3 = new Teacher(3, "Le Hoai Bac", 1, 1, 4300, "lhbac@fit.hcmus.vn");
		Teacher[] allTeac = { t1, t2, t3 };

		Subject sj1 = new Subject(1, "Toan", "Dai so va Hinh hoc");
		Subject sj2 = new Subject(2, "Van", "Van hoc Viet Nam trung dai");
		Subject sj3 = new Subject(3, "Anh", "English grammar and vocabulary");
		Subject[] allSubj = { sj1, sj2, sj3 };

		Course co1 = new Course(3, 1, 2022, "12h30 thu tu"); // Anh - Nguyen Van Vu
		Course co2 = new Course(1, 3, 2020, "7h30 thu ba"); // Toan - Le Hoai Bac
		Course co3 = new Course(2, 2, 2021, "12h30 thu tu"); // Van - Le Tuan Thu
		Course[] allCou = { co1, co2, co3 };

		Location l1 = new Location(1, "I107", "Co so Nguyen Van Cu Q5");
		Location l2 = new Location(2, "G202", "Co so Linh Trung, Thu Duc");
		Location[] allLocate = { l1, l2 };

		Date d1 = new Date(); // today

		ExamType et1 = new ExamType("15p", 1.0);
		ExamType et2 = new ExamType("45p", 1.5);
		ExamType et3 = new ExamType("mid", 2.0);
		ExamType et4 = new ExamType("final", 3.0);
		ExamType [] allExamType = { et1, et2, et3, et4 };

		// toan
		Examination ex1 = new Examination(1, 1, 3, 2022, 1, "15p", 8.5);
		Examination ex2 = new Examination(1, 1, 3, 2022, 1, "45p", 7.5);
		Examination ex3 = new Examination(1, 1, 3, 2022, 1, "mid", 9);
		Examination ex4 = new Examination(1, 1, 3, 2022, 1, "final", 8.75);
		Examination ex5 = new Examination(1, 1, 3, 2022, 2, "15p", 8);
		Examination ex6 = new Examination(1, 1, 3, 2022, 2, "45p", 8.5);
		Examination ex7 = new Examination(1, 1, 3, 2022, 2, "mid", 8.25);
		Examination ex8 = new Examination(1, 1, 3, 2022, 2, "final", 9.5);
		Examination[] MathExams = { ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8};
		// van
		Examination ex10 = new Examination(2, 1, 2, 2022, 1, "15p", 9);
		Examination ex11 = new Examination(2, 1, 2, 2022, 1, "45p", 8.1);
		Examination ex12 = new Examination(2, 1, 2, 2022, 1, "mid", 7);
		Examination ex13 = new Examination(2, 1, 2, 2022, 1, "final", 7.5);
		Examination ex14 = new Examination(2, 1, 2, 2022, 2, "15p", 4.3);
		Examination ex15 = new Examination(2, 1, 2, 2022, 2, "45p", 5.0);
		Examination ex16 = new Examination(2, 1, 2, 2022, 2, "mid", 5.5);
		Examination ex17 = new Examination(2, 1, 2, 2022, 2, "final", 5.5);
		Examination[] LitExams = { ex10, ex11, ex12, ex13, ex14, ex15, ex16,ex17};
		//anh
		Examination ex18 = new Examination(3, 1, 1, 2022, 1, "15p", 9.5);
		Examination ex19 = new Examination(3, 1, 1, 2022, 1, "45p", 8.6);
		Examination ex20 = new Examination(3, 1, 1, 2022, 1, "mid", 8.0);
		Examination ex21 = new Examination(3, 1, 1, 2022, 1, "final", 7.5);
		Examination ex22 = new Examination(3, 1, 1, 2022, 2, "15p", 6.25);
		Examination ex23 = new Examination(3, 1, 1, 2022, 2, "45p", 8.75);
		Examination ex24 = new Examination(3, 1, 1, 2022, 2, "mid", 9.25);
		Examination ex25 = new Examination(3, 1, 1, 2022, 2, "final", 9.5);
		Examination[] EngExams = { ex18, ex19, ex20, ex21, ex22, ex23, ex24, ex25};
		
		PointSheetDetail psd1 = new PointSheetDetail(1, 1, 3, 2022, 1);
		PointSheetDetail psd2 = new PointSheetDetail(1, 1, 3, 2022, 2);
		PointSheetDetail psd3 = new PointSheetDetail(2, 1, 2, 2022, 1);
		PointSheetDetail psd4 = new PointSheetDetail(2, 1, 2, 2022, 2);
		PointSheetDetail psd5 = new PointSheetDetail(3, 1, 1, 2022, 1);
		PointSheetDetail psd6 = new PointSheetDetail(3, 1, 1, 2022, 2);
		PointSheetDetail[] allPSDetail = { psd1, psd2, psd3, psd4, psd5, psd6 };
		
		PointSheet ps1 = new PointSheet(1, 2022);
		
		
		for (Student stu : allStu) {
			System.out.println(stu.getID() + ". " + stu.getName());
		}
		Student chosenStudent = new Student();
		int choice = chooseOption(allStu.length);
		for (Student stu : allStu) {
			if (stu.getID() == choice) {
				chosenStudent = stu;
				break;
			}
		}
		
		//print SheetPoint
		printPointSheet(chosenStudent, ps1,MathExams,LitExams,EngExams,allExamType);

	}
	public static int chooseOption(int n) {
		Scanner scanner = new Scanner(System.in);
		boolean legit = true;
		int choice = 4;
		do {
			try {
				System.out.print("Select 1 student to show sheetpoint: ");
				
				choice = scanner.nextInt();
				if (choice < 1 || choice > n) {
					System.out.println("Please input from 1-" + n);
					legit = false;
				}
			} catch (Exception e) {
				System.out.println("Please input an integer number!");
				legit = false;
			}
		} while (!legit);
		return choice;
	}
	

	public static void printPointSheet(Student st, PointSheet ps, Examination[] mathExams, Examination[] litExams, Examination[] engExams,
			ExamType[] examType) {
		System.out.println("Point Sheet");
		System.out.println("Student: " + st.getName());
		System.out.println("Class: " + st.getClassID());
		System.out.println("Year: " + ps.getYear());
		System.out.println("Subject |             Semester 1        |         Semester 2            | Average |");
		System.out.println("--------|-------------------------------|-------------------------------|---------|");
		System.out.println("        | 15'   | 45'   | Mid   | Final | 15'   | 45'   | Mid   | Final |         |");
		System.out.print(" Math   | ");
		double sub1 = printGradeSubject(mathExams, examType);
		System.out.print(" Lit    | ");
		double sub2 = printGradeSubject(litExams, examType);
		System.out.print(" Eng    | ");
		double sub3 = printGradeSubject(engExams, examType);
		
		double YearFinalPoint= (sub1+sub2+sub3)/3;
		
		System.out.println("AveragePoint: "+ String.format("%.2f",(double)(YearFinalPoint)));
	}
	
	public static double printGradeSubject(Examination[] Exams, ExamType[] examType) {
		double[] gradeArr = new double[8];
		double finalPoint = 0.0;
		double finalMulti = 0.0;
		double multi = 0.0;
		for (Examination exam : Exams) {
			if (exam.getSemester() == 1) {

				switch (exam.getExamType()) {
				case "15p": {
					gradeArr[0] = exam.getGrade();
					multi = examType[0].getMultiplication();
					break;
				}
				case "45p": {
					gradeArr[1] = exam.getGrade();
					multi = examType[1].getMultiplication();
					break;
				}
				case "mid": {
					gradeArr[2] = exam.getGrade();
					multi = examType[2].getMultiplication();
					break;
				}
				case "final": {
					gradeArr[3] = exam.getGrade();
					multi = examType[3].getMultiplication();
					break;
				}
				}
			} else { //semester 2
				switch (exam.getExamType()) {
				case "15p": {
					multi = examType[0].getMultiplication();
					gradeArr[4] = exam.getGrade();
					break;
				}
				case "45p": {
					gradeArr[5] = exam.getGrade();
					multi = examType[1].getMultiplication();
					break;
				}
				case "mid": {
					gradeArr[6] = exam.getGrade();
					multi = examType[2].getMultiplication();
					break;
				}
				case "final": {
					gradeArr[7] = exam.getGrade();
					multi = examType[3].getMultiplication();
					break;
				}
				}
			}
			finalPoint += exam.getGrade()*multi;
			finalMulti += multi;
		}
		
		for (double grade : gradeArr) {
			System.out.print(String.format("%.2f",grade) + "  | ");
		}
		finalPoint= (double) finalPoint / finalMulti;
		System.out.println(" " + String.format("%.2f",(finalPoint))+ "   |");
		return finalPoint;
	}
}
