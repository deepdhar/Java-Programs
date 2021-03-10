// Sum of digits of a number

import java.util.Scanner;

public class SumOfNum {
	
	static int SumOfNumReturning(int x) {
		if(x==0)
			return 0;
		else
			return (x%10 + SumOfNumReturning(x/10));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = SumOfNumReturning(n);
		System.out.println("Sum of " + n + " is " + s);
	}

}
