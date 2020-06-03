//Program to reverse String
package codes;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.next();
		String rev = "";
		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

}
