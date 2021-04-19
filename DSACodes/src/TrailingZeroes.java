import java.util.*;

//find number of trailing zeroes in a factorial
public class TrailingZeroes {
	
	public static void main(String args[]) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		long res = 0;
		
		for(int i=5; i<=n; i=i*5)
			res = res + n/i;
		
		System.out.println("No. of trailing zeroes: " + res);
	}

}
