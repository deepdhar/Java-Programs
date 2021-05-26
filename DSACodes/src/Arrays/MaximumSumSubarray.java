package Arrays;


public class MaximumSumSubarray {
	
	//naive solution, O(n^2) time
	static int maxSum(int arr[]) {
		int res = arr[0], n = arr.length;
		for(int i=0; i<n; i++) {
			int curr = 0;
			for(int j=i; j<n; j++) {
				curr += arr[j];
				res = Math.max(curr, res);
			}
		}
		return res;
	}
	
	
	//efficient solution, O(n) time
	static int maxSum2(int arr[]) {
		int res = arr[0], maxEnding = arr[0];
		for(int i=1; i<arr.length; i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(res, maxEnding);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {-3,8,-2,4,-5,6};
		System.out.println(maxSum2(arr));
	}

}
