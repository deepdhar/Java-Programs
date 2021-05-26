// We are given an array, we have to find majority of an element if it exists
// An element in array is called majority if it appears more than n/2 times in array, n = arr.length

package Arrays;

public class MajorityElement {
	
	//naive solution, O(n^2) time
	static int findMajority(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=i+1; j<n; j++)
				if(arr[j]==arr[i]) count++;
			if(count>n/2) return i;
		}
		return -1;
	}
	
	
	//efficient solution, O(n) time, O(1) aux space
	//Moore's Voting Algorithm
	static int findMajority2(int arr[]) {
		int res = 0, count = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[res]==arr[i]) count++;
			else count--;
			if(count == 0) {
				res = i;
				count = 1;
			}
		}
		
		count = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[res]==arr[i]) count++;
		if(count<=arr.length/2) res = -1;
		
		return res;
	}
	
	
	
	

	public static void main(String[] args) {
		int arr[] = {8,8,6,6,6,4,6};
		System.out.println(findMajority(arr));
	}

}
