package patternassignment;

public class Pattern02 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int numst = 1;
		while (row <= n) {

			int cst = 0;
			while (cst < numst) {
				System.out.print("* ");
				cst++;
			}
			numst++;
			row++;
			System.out.println();

		}

	}
}