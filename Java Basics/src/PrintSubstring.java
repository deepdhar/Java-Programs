import java.util.Scanner;

//Program to print substring of an inputted string

public class PrintSubstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int startIndex = scan.nextInt();
		int endIndex = scan.nextInt();
		scan.close();
		
		System.out.println(str.substring(startIndex, endIndex));
	}
}
