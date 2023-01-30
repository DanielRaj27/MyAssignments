package week3.day1.assignments.abstraction;

public abstract class MultipleLanguage implements Language, TestTool {

	public void python() {
		System.out.println("The Language is Python");
	}
	public abstract void ruby();
}
