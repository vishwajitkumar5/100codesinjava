//lcm of number
package codes;

import java.util.Scanner;

public class Lcm_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		int lcm = 0;
		lcm = (n1 > n2) ? n1 : n2;
		while (true) {
			if ((lcm % n1 == 0) && (lcm % n2 == 0))
				;
			System.out.println("Lcm of number is " + lcm);
			break;
		}
		lcm = lcm + 1;
	}

}
