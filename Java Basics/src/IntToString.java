import java.util.Scanner;

public class IntToString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Integer: " + a);
		
		String s = "" + a;
		System.out.println("String: " + s);
	}

}
