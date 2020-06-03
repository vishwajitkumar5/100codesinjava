//Program to find Fibonacci number
package codes;

import java.util.Scanner;

public class Fibonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 10; i++)

		{
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
