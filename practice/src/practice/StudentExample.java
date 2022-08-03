package practice;

public class StudentExample {
	
	public static void main(String[] args) {
		Student student = new Student("김현수", "910630-1234567", 3);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
