//calculating trailing zeros in factorial of a given number
package Mathematics;
import java.util.*;

public class TrailingZerosInFactorial {
	
	//naive method, but inefficient
	//cannot calculate trailing zeros for large factorials
	static int countZeros(int n) {
		int fact=1;
		for(int i=2; i<=n; i++)
			fact *= i;
		int count=0;
		while(fact%10==0) {
			count++;
			fact = fact/10;
		}
		return count;
	}
	
	
	//efficient method
	static int countZerosEff(int n) {
		int res=0;
		for(int i=5; i<=n; i=i+5)
			res = res + n/i;
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(countZerosEff(n));	//call any method
		scan.close();
	}

}
