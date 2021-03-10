/*
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be
 * one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
*/
import java.util.Scanner;

public class StringTokens {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if(s.length() > 0) {
			String[] tokens = s.split("[ !,?._'@\\s]+");
			System.out.println(tokens.length);
			for(String token : tokens)
				System.out.println(token);
		} else {
			System.out.println(0);
		}
		scan.close();
	}
}
