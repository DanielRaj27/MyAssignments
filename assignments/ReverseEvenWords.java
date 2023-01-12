package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] wordsArray=test.split(" ");
		for (int i = 1; i < wordsArray.length; i+=2) {
			char[] evenWordsArray=wordsArray[i].toCharArray();
			char[] reversedEvenWordsArray=new char[evenWordsArray.length];
			int z=0;
			for (int j = evenWordsArray.length-1; j >=0; j--) {
				reversedEvenWordsArray[z]=evenWordsArray[j];
				z++;
			}
	
			wordsArray[i]=String.valueOf(reversedEvenWordsArray);
		}
		System.out.println("Reverse Even Words: ");
		for (int i = 0; i < wordsArray.length; i++) {
			if(i!=wordsArray.length-1)
				System.out.print(wordsArray[i]+" ");
			else
				System.out.print(wordsArray[i]);
		}
	}
}
