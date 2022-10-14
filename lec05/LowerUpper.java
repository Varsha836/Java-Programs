package lec05;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch <= 'Z' && ch >= 'A') {
			System.out.println("UPPER");
		} else if (ch <= 'z' && ch >= 'a') {
			System.out.println("LowER");
		} else {
			System.out.println("kuch ni");
		}
			}
		
	}


