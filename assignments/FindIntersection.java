package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int table1[] = {3,2,11,4,6,7};
		int table2[]= {1,2,8,4,9,7};
		System.out.println("The Intersections are ");
		for (int i=0; i<table1.length; i++) {
			for(int j=0; j<table2.length; j++) {
				if (table1[i] == table2[j])
				{
					System.out.println(table1[i]);
				}
			}
		}

	}

}
