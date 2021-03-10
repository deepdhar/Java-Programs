import java.util.Scanner;

public class Palindrome2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a[] = scan.next().toLowerCase().toCharArray();
		int h = a.length - 1;
		int l = 0;
		while(h>l) {
			if(a[h] == a[l]) {
				h = h-1;
				l = l+1;
				continue;
			} else {
				break;
			}
		}
		if(h<=l) 
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
