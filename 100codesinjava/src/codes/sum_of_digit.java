//Sum of digit of number
package codes;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int m = sc.nextInt();
		int n = m;
		int rem = 0;
		int sum = 0;
		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum + " is the sum of number " + m);
	}

}
