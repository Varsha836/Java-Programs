package patternassignment;

public class Pattern14 {

	public static void main(String[] args) {
				int n = 5;
				 int row = 1;
				 
				 
				 
				 while(row<=n) {
					 int csp = 0;
					 while(csp<n-row) {
						 System.out.print("  ");
						 csp++;
					 }
					 int cst = 0;
					 while(cst<row) {
						 System.out.print("* ");
						 cst++;
					 }
					 System.out.println();
					 row++;}
				 int cst1 = 1;
				 while(cst1<=n-1) {
					 int numsp=0;
					 while(numsp<cst1) {
						 System.out.print("  ");
						 numsp++;
					 }
					 int numstr=0;
					 while(numstr<n-cst1) {
						 System.out.print("* ");
						 numstr++;
					 }
					 System.out.println();
				cst1++;	 
				 }
				 
				 
				 }

	}


