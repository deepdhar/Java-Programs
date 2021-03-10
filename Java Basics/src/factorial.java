import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int n, i;
		long p=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		for(i=n; i>=1; i--)
			p = p*i;
		
		System.out.println("Factorial of " + n + " is: " + p);
	}

}
