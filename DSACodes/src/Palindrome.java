import java.util.*;

public class Palindrome {
	
	public static int reverse(int n) {
		int res=0;
		while(n!=0) {
			res = (res*10) + n%10;
			n = n/10;
		}
		return res;
	}
	
	public static void main(String args[]) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		if(reverse(n)==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
