package Arrays;

public class MaxLengthEvenOddSubarray {
	
	// O(n) time
	static int calculate(int arr[]) {
		int n = arr.length;
		int count=1, res=0;
		for(int i=1; i<n; i++) {
			//(n&1)!=1 even;  (n&1)==1 odd
			if( ((arr[i-1]&1)!=1 && (arr[i]&1)==1) || ((arr[i-1]&1)==1 && (arr[i]&1)!=1) )
				count++;
			else 
				count = 1;
			res = Math.max(res, count);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {5,10,20,6,3,8};
		System.out.println(calculate(arr));
	}

}
