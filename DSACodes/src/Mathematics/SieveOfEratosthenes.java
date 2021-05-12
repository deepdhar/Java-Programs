//print all the prime numbers till n
package Mathematics;
import java.util.*;

public class SieveOfEratosthenes {

	//naive solution, time complexity: O(n*√n)
	static void printPrimes(int n) {
		for(int i=2; i<=n; i++)
			//calling checkPrime function to check i is prime or not
			if(checkPrime(i)) System.out.print(i + " ");
	}
	
	
	
	//efficient solution, time complexity: O(nloglogn)
	static void sieve(int n) {
		if(n<=1) return;
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2; i*i<=n; i++) {
			if(isPrime[i]) {
				for(int j=2*i; j<=n; j=j+i)
					isPrime[j] = false;
			}
		}
		
		//printing prime numbers
		for(int i=2; i<=n; i++)
			if(isPrime[i]) System.out.print(i + " ");
	}
	
	
	
	//short and optimized solution
	static void sieve2(int n) {
		if(n<=1) return;
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		//checking and printing in the same master loop
		for(int i=2; i<=n; i++) {
			if(isPrime[i]) {
				System.out.print(i + " ");
				for(int j=i*i; j<=n; j+=i)
					isPrime[j] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		sieve2(n);
		scan.close();
	}
	
	
	static boolean checkPrime(int n) {
		if(n==1) return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
