package week3.day1.assignments.assignment4;

public class Students {

	public void getStudentInfo(int StudentID) {
		System.out.println("Student ID: "+ StudentID);
	}
	public void getStudentInfo(int StudentID, String StudentName) {
		System.out.println("Student ID is " + StudentID +" and "+ "StudentName is " + StudentName);
	}
	public void getStudentInfo (String StudentEmail, String StudentPhoneNumber) {
		System.out.println("Student Email ID: "+ StudentEmail + " and " +"Student Phone Number: "+ StudentPhoneNumber);
	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(51);
		obj.getStudentInfo(51, "Daniel Raj");
		obj.getStudentInfo("yyy@gmail.com" , "7777777777");
	}
	
}
