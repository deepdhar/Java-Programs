import java.util.*;
public class Recursion {
	
//	static void printHello(int n) {
//		if(n==0)
//			return;
//		System.out.println("Hello");
//		printHello(n-1);
//	}
//	
//	public static void main(String args[]) {
//		printHello(20);
//	}
	
	
	
	
	
//	// find sum of n natural numbers
//	static int sumOfN(int n) {
//		if(n==1)
//			return 1;
//		return n + sumOfN(n-1);
//		
//	}
//	
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		int n = Integer.parseInt(scan.next());
//		System.out.println(sumOfN(n));
//	}
	
	
	
	
	
	
//	// Calculate a^b using recursion
//	static int pow(int x, int y) {
//		if(y==0)
//			return 1;
//		return x * pow(x, y-1);
//	}
//	
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter base: ");
//		int a = Integer.parseInt(scan.next());
//		System.out.print("Enter power: ");
//		int b = Integer.parseInt(scan.next());
//		System.out.println(pow(a,b));
//		
//	}

	
	
	// Find number of ways to traverse last index in nxm matrix
	static int numberOfWays(int n, int m) {
		if(n==1 || m==1)
			return 1;
		 return numberOfWays(n-1, m) + numberOfWays(n, m-1);
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		System.out.println(numberOfWays(n, m));
	}
}
