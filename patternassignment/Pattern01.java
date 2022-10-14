package patternassignment;

public class Pattern01 {

	public static void main(String[] args) {
		int n = 5;
		int numst = n;
		int row = 1;
		while (row <= numst) {
			int cst = 0;
			while (cst < n) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}
