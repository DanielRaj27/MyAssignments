package week1.day1;

public class isPrime {

	public static void main(String[] args) {
		int n = 13;
		for(int i=2; i<n; i++)
			if(n % i == 0)
			{
				System.out.println("The given number " + n + " is not a Prime Number");
			    break;
		    }
			else
			{
				System.out.println("The given number " + n + " is  a Prime Number");
				break;
			}	
	    }
	}

