//calculating gcd of two numbers
package Mathematics;
import java.util.*;

public class GCD {
	
	//naive method, time complexity: O(min(a,b))
	static int calculateGcd(int a, int b) {
		int res = Math.min(a, b);
		while(res>0) {
			if(a%res==0 && b%res==0)
				break;
			res--;
		}
		return res;
	}
	
	
	//Euclid's algo, for better time complexity
	static int calculateGcd2(int a, int b) {
		while(a!=b) {
			if(a>b)
				a = a-b;
			else
				b = b-a;
		}
		return a;
	}
	
	
	//optimized euclid's algo
	static int calculateGcd3(int a, int b) {
		if(b==0)
			return a;
		else
			return calculateGcd3(b,a%b);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		System.out.println(calculateGcd2(a,b));
	}

}
