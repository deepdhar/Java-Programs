import java.util.*;
public class ModuloArithmetics {
	
	static long fastPower(long a, long b, int n) {
		long res = 1;
		
		while(b>0) {
			if((b&1)!=0)	//check if odd
				res = (res * a%n) % n;
			
			a = (a%n * a%n) % n;
			b = b>>1;	// efficient than b=b/2
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());	//base
		int b = Integer.parseInt(scan.next());	//power
		int n = Integer.parseInt(scan.next());
		System.out.println(fastPower(a,b,n));
	}

}
