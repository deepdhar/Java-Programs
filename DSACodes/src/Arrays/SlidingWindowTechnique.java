//Given an array of integers and a number k, find the maximum sum of k consecutive elements
package Arrays;

public class SlidingWindowTechnique {

	//naive solution, O((n-k)*k)
	static int sum(int arr[], int k) {
		int max_sum = 0;
		for(int i=0; i<arr.length-k+1; i++) {
			int sum = 0;
			for(int j=0; j<k; j++)
				sum += arr[j+i];
			max_sum = Math.max(max_sum, sum);
		}
		return max_sum;
	}
	
	
	
	//efficient solution, window sliding technique
	//O(n) time
	static int sum2(int arr[], int k) {
		int curr_sum = 0;
		
		for(int i=0; i<k; i++)
			curr_sum += arr[i];
		
		int max_sum = curr_sum;
		for(int i=k; i<arr.length; i++) {
			curr_sum += arr[i] - arr[i-k];
			max_sum = Math.max(max_sum, curr_sum);
		}
		
		return max_sum;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,8,30,-5,20,7};
		int k = 3;
		System.out.println(sum2(arr, k));
	}

}
