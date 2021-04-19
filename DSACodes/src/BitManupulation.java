

public class BitManupulation {
	
//	//find only non-repeating element in array where every element repeats twice
//	//time complexity: 0(n), space complexity: 0(1)
//	public static void main(String args[]) {
//		int a[] = {5, 4, 3, 4, 1, 5, 1};
//		int res = 0;
//		
//		for(int i=0; i<a.length; i++)
//			res = res ^ a[i];	//using XOR
//		
//		System.out.println(res);
//	}
	
	
	
	
//	//find the two non-repeating elements in array where every element repeats twice
//	public static void main(String args[]) {
//		int a[] = {5, 4, 1, 4, 3, 5, 1, 2};
//		int res=0;
//		
//		for(int i=0; i<a.length; i++)
//			res = res^a[i];
//		
//		res = res& - res;		//res& is 2's complement of 2
//		
//		int res1=0, res2=0;
//		
//		for(int i=0; i<a.length; i++) {
//			if((a[i]&res)>0)
//				res1 = res1^a[i];
//			else
//				res2 = res2^a[i];
//		}
//		
//		System.out.println(res1 + " " + res2);
//	}
	
	
	
	
	//Find the only non-repeating element in an array where every other element repeats thrice.
	public static void main(String args[]) {
		int a[] = {2, 2, 1, 5, 1, 1, 2};
		
	}

}
