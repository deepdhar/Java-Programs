/**
 * You have been provided with a string A. You have to perform Q queries on this string. In each query you will be
 * provided with another string B. You need to find the number of occurences of B as a substring of A.
 **/

import java.util.*;

public class HashExample {
	
	static int MAXN = 100000 + 5;
	static int p = 31, m = (int)1e9 + 9;
	static long[] powers = new long[MAXN];	//powers[i] = p^i
	static int primeInv = 838709685;	//MMI of p

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		int Q = Integer.parseInt(scan.next());
		while(Q-->0) {
			String B = scan.nextLine();
			if(B.length() == 0)
				B = scan.nextLine();
			System.out.println(rabinKarp(A,B));
		}
	}
	
	//no. of occurences of B in A
	public static int rabinKarp(String A, String B) {
		int N = A.length(), M = B.length();
		powers[0] = 1;
		for(int i=1; i<=M-1; i++) {
			powers[i] = (powers[i-1] * p) % m;
		}
		
		//calculating hash for 1st m sized window
		long hashA = 0, hashB = 0;
		for(int i=0; i<M; i++) {
			hashA = (hashA + value(A.charAt(i)) * powers[i]) % m;
			hashB = (hashB + value(B.charAt(i)) * powers[i]) % m;
		}
		
		int count = 0;
		for(int i=0; i<=N-M; i++) {
			if(hashA==hashB) count++;
			if(i < N-M) {
				hashA = (hashA - value(A.charAt(i)) + m) * primeInv % m; 
				hashA = (hashA + value(A.charAt(i + M)) * powers[M-1]) % m;
			}
		}
		
		return count;
	}
	
	private static int value(char ch) {
		return (int)ch;
	}

}
