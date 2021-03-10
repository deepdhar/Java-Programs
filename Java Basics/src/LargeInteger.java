import java.math.BigInteger;
import java.util.Scanner;

//operations of large integers using BigInteger class

public class LargeInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = new BigInteger(scan.next());
		BigInteger b = new BigInteger(scan.next());
		
		BigInteger sum, mul;
		sum = a.add(b);
		mul = a.multiply(b);
		
		System.out.println(sum + "\n" + mul);
	}
}
