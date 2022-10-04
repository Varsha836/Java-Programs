package lec02;

import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int n = scn.nextInt();
		int i = 1;
		while(i<n) {
			System.out.println(i);
			i = i+1;
			sum = sum+i;
			i++;
		}
		
		System.out.printf("sum", +sum);
	}

}
