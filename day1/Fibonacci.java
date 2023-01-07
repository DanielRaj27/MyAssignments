package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNum=0, secNum=1, sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=0; i<=11; i++)
		{
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}
		}
		
}

