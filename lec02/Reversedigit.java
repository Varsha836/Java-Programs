package lec02;

import java.util.Scanner;

public class Reversedigit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
int num = scn.nextInt();
int ans=0;
while(num!=0) {
	
	int digit = num%10;
	ans=ans*10+digit;
	//System.out.print(digit);
	num=num/10;
}
System.out.println(ans);
	}

}
