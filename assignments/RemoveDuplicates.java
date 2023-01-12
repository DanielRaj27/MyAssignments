package week1.day2.assignments;
public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] temp = text.split(" ");
		for (int i = 0; i < temp.length-1; i++) {
			for (int j = i+1; j < temp.length; j++) {
				if (temp[i].equalsIgnoreCase(temp[j])) {
					temp[j]= " ";
				}		
			}
		}
		for (int j = 0; j < temp.length; j++) {
			if (temp[j] != " ") {
				System.out.print(temp[j]+ " ");
			}
		}
	}
}