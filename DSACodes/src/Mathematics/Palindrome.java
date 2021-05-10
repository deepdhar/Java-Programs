package Mathematics;
import java.util.*;

public class Palindrome {
		
	static boolean isPalindrome(int n) {
		int res=0, temp=n;
		while(n!=0) {
			res = res*10 + (n%10);
			n = n/10;
		}
		return res==temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(isPalindrome(n)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
		scan.close();
	}

}
