package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student Id :" +id);
	}
	
public void getStudentInfo(int id , String name) {
		System.out.println("studentId and Name : " +id + " " +name);
	}

public void getStudentInfo(String email, int phoneNumber) {
	System.out.println("Student email and phoneNumber "+ email +" " +phoneNumber);
}
	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(10);
		stud.getStudentInfo(10, "testleaf");
		stud.getStudentInfo("test@gmail.com", 12345);

	}

}
