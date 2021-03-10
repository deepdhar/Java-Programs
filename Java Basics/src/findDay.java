/* Program to input day, month and year from user
 * and printing the day in that date
*/

import java.time.LocalDate;
import java.util.Scanner;

class Result {
	public static String findDay(int day, int month, int year) {
		LocalDate date = LocalDate.of(year, month, day);
		return date.getDayOfWeek().toString();
	}	
}

public class findDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		String res = Result.findDay(day, month, year);
		System.out.println(res);
	}
}
