package org.bank;

public class AxisBank extends BankInfo {
	//Override
	//You have to override the method deposit in AxisBank.
	public void deposit()
	{
		System.out.println("Axis Bank deposit");
	}
	
	public static void main (String[] args)
	{
		AxisBank myBank=new AxisBank();
		myBank.deposit();
	}

}
