package lec01;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int P = scn.nextInt();
		int R = scn.nextInt();
		int T = scn.nextInt();
	
		int abs=P*R*T/100;
		System.out.println(abs);
	}

}
