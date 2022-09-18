package org.student;
import org.department.Department;
public class Student extends Department {
    //multilevel inheritance
	//create above 3 class and call all your class methods into the Student using multilevel inheritance.
	public void studentName()
	{
		System.out.println("Student Name - Jayanthi");
	}
	public void studentDept()
	{
		System.out.println("Student Dept - IT");
	}
	public void studentId()
	{
		System.out.println("Student Id - 57");
	}

	public static void main(String[] args)
	{
		Student myDetail=new Student();
		myDetail.collegeName();
		myDetail.collegeCode();
		myDetail.collegeRank();
		myDetail.deptName();
		myDetail.studentName();
		myDetail.studentDept();
		myDetail.studentId();
	}
}
