package patternassignment;

public class Pattern05 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int numsp=0;
				int numstr=n;
		while(row<=n) {
			
			int csp=0;
			while(csp<=numstr) {
				System.out.print("*");
			}
			int cst = 0;
			while(cst<=numsp) {
				System.out.print("");
			}
			row++;
			numsp++;
			numstr--;
			System.out.println();
			
		}

		
		
		
		
	  	}
}
	