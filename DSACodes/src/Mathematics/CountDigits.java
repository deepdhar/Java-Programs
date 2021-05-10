package Mathematics;
import java.util.*;

public class CountDigits {
	
//	//iterative solution - O(n)
//	static int countNoOfDigits(long n) {
//		int count = 0;
//		while(n>0) {
//			n = n/10;
//			count++;
//		}
//		return count;
//	}
	
	
	//recursive solution - O(n)
//	static int countNoOfDigits(long n) {
//		if(n==0) return 0;
//		return 1 + countNoOfDigits(n/10);
//	}
	
	
	
	//logarithmic solution - O(1)
	static int countNoOfDigits(long n) {
		return (int) Math.floor(Math.log10(n) + 1);
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println("No. of digits: " + countNoOfDigits(n));
	}

}
