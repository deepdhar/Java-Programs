package Arrays;

public class MaximumConsecutiveOnes {
	
	//naive method, time complexity: O(n^2), aux space: O(1)
	static int maxConsOnes(int arr[]) {
		int res = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int curr = 0;
			for(int j=i; j<n; j++) {
				if(arr[j]==1) curr++;
				else break;
			}
			res = Math.max(res, curr);
		}
		return res;
	}
	
	
	
	//efficient solution, time complexity: O(n), aux space: O(1)
	static int maxConsOnes2(int arr[]) {
		int res = 0, curr = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) curr = 0;
			else {
				curr++;
				res = Math.max(curr, res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {0,1,1,1,0,1,1,0,1,1};
		System.out.println(maxConsOnes2(arr));
	}

}
