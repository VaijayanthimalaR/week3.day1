package org.student;

public class Students {

	//Overload
	//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	
	public void getStudentInfo(String id)
	{
	System.out.println("Id- "+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
	System.out.println("id -57 "+" Name "+ name);
	}
	public void getStudentInfo(String email,String phoneNumber)
	{
	System.out.println("mail -"+email+  " PhoneNumber - "+phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students stuInfo=new Students();
		stuInfo.getStudentInfo("IT57");
		stuInfo.getStudentInfo(57,"Jayanthi");
		stuInfo.getStudentInfo("xyz.gmail.com","123456789");
		
	}

}
