package org.abstraction;

public class Automation extends MultipleLangauge implements Language,TestTool {
	//Abstraction
	// Implement all the methods of interface and abstract class in Automation class


	public void Selenium() {
		System.out.println("interface method - testtool");
		
	}

	public void Java() {
		System.out.println("interface method - Language");
		
	}

	@Override
	public void ruby() {
		System.out.println("Abstract Class unimplemented Method Ruby");
		
	}
	
	public static void main(String[] args) {
		
		Automation lang=new Automation();
		lang.Java();
		lang.Selenium();
		lang.python();
		lang.ruby();
	}

}
