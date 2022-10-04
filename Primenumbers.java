package lec02;

public class Primenumbers {

	public static void main(String[] args) {
		int n = 6;
		int div = 1;
		int numFact = 0;
		while (div <= n) {

			int rem = n % div;
			// System.out.println(rem);

			if (rem == 0) {

				numFact = numFact + 1;

			}

			div++;
		}
		System.out.println(numFact);
		if (numFact == 2) {
			System.out.println("Prime"); 

		} else {
			System.out.println("Not Prime");
		}
	}

}
