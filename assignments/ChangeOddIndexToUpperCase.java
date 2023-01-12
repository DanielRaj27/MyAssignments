package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String name = "calendar";
		char[] temp = name.toCharArray();
		for (int i=1; i<temp.length ; i=i+2){
			temp[i] = Character.toUpperCase(temp[i]);
		}
		for (int i=0; i<temp.length; i++) {
				System.out.print(temp[i]);
		}
		}

}
