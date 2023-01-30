package week3.day1.assignments.abstraction;

public class Automation extends MultipleLanguage {

	public void Java() {
		System.out.println("The Language is JAVA");	
	}
	public void Selenium() {
		System.out.println("The Tool is Selenium");
	}

	@Override
	public void ruby() {
		System.out.println("The Language is Ruby");
	}
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.ruby();
		obj.python();
	}

}
