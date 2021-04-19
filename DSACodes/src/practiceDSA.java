import java.util.Scanner;

public class practiceDSA {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = Integer.parseInt(scan.next());
//		for(int i=0; i<5; i++) {
//			System.out.print(a + " ");
//			a = a<<1;
//			/* << left shift operator
//			 * it shifts the 1 bit to left,
//			 * which in other terms means, multiplying by 2 
//			 * >>1 will divide by 2 every time */
//		}
//
//	}
	
	
	
	
//	// checking odd/even
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		int a = Integer.parseInt(scan.next());
//
//		if((a&1)==0) {
//			System.out.println("Even");
//		} else {
//			System.out.println("Odd");
//		}
//	}
	
	
	
	
	
	// swapping two numbers using Xor
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a=" + a + " b=" + b);
	}

}
