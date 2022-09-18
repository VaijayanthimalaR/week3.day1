package org.system;

public class Desktop extends Computer {
	//single inheritance
	//create above 2 class and call all your class methods into the Desktop using single inheritance.
	public void desktopSize()
	{System.out.println("desktopSize");}
	
	
	public static void main (String[] args)
	{
		Desktop sys=new Desktop();
		 sys.desktopSize();
		 sys.computerModel();		 
	}


}
