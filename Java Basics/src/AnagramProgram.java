//Program to check whether two strings are anagram or not
//if both the strings have same characters in them, it is an anagram; eg: tuesday, yadseut
import java.util.Scanner;

public class AnagramProgram {
	
	static boolean isAnagram(String a, String b) {
		char aa[] = a.toLowerCase().toCharArray();
		char bb[] = b.toLowerCase().toCharArray();
		
		if(a.length() != b.length()) {
			return false;
		} else {
			java.util.Arrays.sort(aa);
			java.util.Arrays.sort(bb);
			return java.util.Arrays.equals(aa, bb);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagram" : "Not Anagram");
	}
	
}
