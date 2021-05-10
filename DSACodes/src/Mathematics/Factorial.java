//calculating factorial of a given number
package Mathematics;
import java.util.*;

public class Factorial {
	
	//iterative method
	static int fact(int n) {
		int res = 1;
		for(int i=2; i<=n; i++)
			res *= i;
		return res;
	}
	
	//recursive method
	static int recFact(int n) {
		if(n==0)
			return 1;
		return n*recFact(n-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(recFact(n));		//call any of the two method
	}

}
