package patternassignment;

public class Pattern03 {

	public static void main(String[] args) {

		 int n = 5;
		    int row = 1;
		   int numst = n;
		   int numsp = 0;
		   
		    
		    while(row<=n) {
		    	int cst = 0;
		    	while(cst<numsp) {
		    		System.out.print("");
		    		cst++;}
		    		int csp = 0;
			    	while(csp<numst) {
			    		System.out.print("* ");
			    		csp++;
			    	
		    }
		    row++;
		    
		    numsp++;
		    numst--;
		    System.out.println();
	}

}
}
