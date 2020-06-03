//Program to reverse a number
package codes;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int tem = n;
		int rev = 0;
		int rem;
		while (tem != 0) {
			rem = tem % 10;
			rev = rev * 10 + rem;
			tem = tem / 10;
		}
		System.out.println(rev + " is the reverse of " + n);
	}

}
