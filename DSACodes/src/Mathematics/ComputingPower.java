package Mathematics;
import java.util.*;

public class ComputingPower {
	
	//naive solution, time complexity: θ(n)
	static int power(int x, int n) {
		int res=1;
		for(int i=0; i<n; i++)
			res = res * x;
		return res;
	}
	
	static int power2(int x, int n) {
		if(n==0) return 1;
		
		int temp = power2(x,n/2);
		temp = temp*temp;
		
		if(n%2==0) return temp;
		else return temp*x;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		int n = Integer.parseInt(scan.next());
		System.out.println(power2(x,n));
	}

}
