//To print date and time
package codes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Date_and_time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar date = new GregorianCalendar();
		int day, month, year;
		int second, minute, hours;
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);

		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hours = date.get(Calendar.HOUR);
		System.out.println("Date is " + day + "/" + (month + 1) + "/" + year);
		System.out.println("time is " + hours + ":" + minute + ":" + second);

	}

}
