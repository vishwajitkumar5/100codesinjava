//To check number is palindrom or not
package codes;

import java.util.Scanner;

public class check_palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (n == rev) {
			System.out.println("Number is palindrom");
		} else {
			System.out.println("Number is not palindrom");
		}
	}

}
