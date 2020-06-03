//Program to find a factorial
package codes;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact + " is factorial of " + n);

	}

}
