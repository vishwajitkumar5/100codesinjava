//gcd of number
package codes;

import java.util.Scanner;

public class Gcd_of_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		int gcd = 1;
		int min;
		min = n1 < n2 ? n1 : n2;
		for (int i = 1; i <= min; i++) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				gcd = i;
			}
		}
		System.out.println("gcd of number is " + gcd);
	}

}
