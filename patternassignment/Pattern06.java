package patternassignment;

public class Pattern06 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		
		while(row<=n) {
			
			int csp=1;
			while(csp<row) {
				System.out.print("  ");
				csp++;
				
			}
			int cst = n;
			while(cst>=row) {
				System.out.print("*");
				cst--;
			}
			
			
			System.out.println();
			row++;
		}
	}
	}

