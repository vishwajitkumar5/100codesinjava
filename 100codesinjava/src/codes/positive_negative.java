//number is postive or negative
package codes;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		if (num == 0) {
			System.out.println("Number is zero");
		} else if (num > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

	}

}
