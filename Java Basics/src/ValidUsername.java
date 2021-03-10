import java.util.Scanner;

/*
 * If the entered username consists of less then 8 or greater than 30 characters, it is invalid 
*/

class UsernameValidator {
	//public static final String regularExpression = "^[A-Z]|[a-z][[A-Z]|[a-z]|\\d|[_]]{7,29}$";
	//or
	public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}

public class ValidUsername {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int n = Integer.parseInt(scan.nextLine());
		int n = scan.nextInt();
		
		while(n-- != 0) {
			String userName = scan.nextLine();
			
			if(userName.matches(UsernameValidator.regularExpression))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}

}
