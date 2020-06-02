package codes;

import java.util.Scanner;

public class check_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");// enter a number to check even or odd
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is Even number");
		} else {
			System.out.println(n + " is Odd number");
		}
	}

}
