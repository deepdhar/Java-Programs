import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Palindrome" : "Not Palimdrome" );

	}

}
