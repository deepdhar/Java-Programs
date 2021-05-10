//calculating lcm of two numbers
package Mathematics;
import java.util.*;

public class LCM {
	
	//naive method, time comlexity: O((a*b)-max(a,b))
	static int calculateLcm(int a, int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res%a==0 && res%b==0)
				break;
			res++;
		}
		return res;
	}
	
	
	
	//efficient method, time complexity: O(log(min(a,b)))
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	static int calculateLcm2(int a, int b) {
		return (a*b)/gcd(a,b);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		System.out.println(calculateLcm2(a,b));
	}

}
