import java.util.Arrays;

public class Sieve_Of_EratoSthenes {
	
	public static void main(String args[]) throws java.lang.Exception {
		
		boolean isPrime[] = sieveOfEratoSthenes(1000);
		for(int i=0; i<=1000; i++) {
//			System.out.println(i + " " + isPrime[i]);
			if(isPrime[i]==true)
				System.out.println(i);
		}
		
	}
	
	static boolean[] sieveOfEratoSthenes(int n) {
		boolean[] isPrime = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i=2; i*i<=n; i++) {
			
			for(int j=2*i; j<=n; j+=i)
				isPrime[j] = false;
			
		}
		
		return isPrime;
	}
}