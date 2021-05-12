package Mathematics;
import java.util.*;

public class AllDivisors {
	
	//naive solution, time complexity: θ(n)
	static void printDivisors(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				System.out.print(i + " ");
		}
	}
	
	//efficient solution, time complexity: θ(√n)
	static void printDivisors2(int n) {
		for(int i=1; i*i<=n; i++) {
			if(n%i==0) {
				System.out.print(i + " ");
				if(i!=n/i)
					System.out.print(n/i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printDivisors(n);
	}

}
