package patternassignment;

public class Question13 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int numst = 1;
		while (row <= 2 * n-1) {

			int cst = 0;
			while (cst < numst) {
				System.out.print("* ");
				cst++;
			}
			
			row++;
			System.out.println();
			if(row<=n) {
				numst++;
			}
			else {
				numst--;
			}
				
			

		}


	}

}
