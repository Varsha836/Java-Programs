package patternassignment;

public class NumberPattern25 {

	public static void main(String[] args) {
		int n = 5;
	    int numsp = n-1;
	    int numst = 1;
	    int row = 1;
	    int count = 1;
	    while(row<=n) {
	    	
	    	int csp = 1;
	    	while(csp<=numsp) {
	    		System.out.print("   ");
	    		csp++;
	    		
	    	}
	    	int cst = 0;
	    	while(cst<numst) {
	    		System.out.print("");
	    		System.out.print(count+ "");
	    		
	    		System.out.print("  ");
	    		cst++;
	    		count++;
	    		
	    	}
	    	row++;
	    	numst+=2;
	    	numsp--;
	    	System.out.println();
	    	
	    }
			}

}
