//check if number is prime or not
package Mathematics;
import java.util.*;

public class Prime {
	
	//naive method, time complexity: O(n)
	static boolean checkPrime(int n) {
		if(n==1) return false;
		for(int i=2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	//efficient method, time complexity: O(√n)
	static boolean checkPrime2(int n) {
		if(n==1) return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(checkPrime2(n))
			System.out.println("It's prime");
		else
			System.out.println("Not prime");
	}

}
