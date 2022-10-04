package patternassignment;

public class Question3 {

	public static void main(String[] args) {

		int n = 5;
		int i = n, j;
		while (i >=1) {
			j = 0;
			while (j++ < i) {
				System.out.print("* ");
			}
			System.out.println();
			i--;
		}

	}

}
