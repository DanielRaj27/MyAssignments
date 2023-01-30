package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Daniel Raj");
	}
	public void studentDept() {
		System.out.println("Mechanical");
	}
	public void studentId() {
		System.out.println("51");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}
}
