package lec02;

public class Hcf {

	public static void main(String[] args) {
		int a = 30;
		int b = 16;
		int divisor = a;
		int dividend = b;
		while (divisor!=0)
		{
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;

		}
		System.out.println(dividend);
	}

}
