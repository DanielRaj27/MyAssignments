package week1.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		String name = "malayalam";
		String rev = "";
		char[] temp = name.toCharArray();
		for (int i= temp.length-1; i>=0; i--){
			rev = rev + temp[i];
		}
		if (name.equalsIgnoreCase(rev))
		{
			System.out.println("The Given String is a Palindrome");
		} else {
			System.out.println("The Given String is not a Palindrome");
		}
	}
}
