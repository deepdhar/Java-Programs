package Arrays;

public class MaximumDifference {
	
	//naive method, time complexity: Θ(n^2)
	static int maximumDifference(int arr[]) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				max = Math.max(max, arr[j]-arr[i]);
			}
		}
		return max;
	}
	
	
	
	//efficient method, time complexity: Θ(n)
	static int maximumDifference2(int arr[]) {
		int max=arr[1]-arr[0], min=arr[0];
		for(int j=1; j<arr.length; j++) {
			max = Math.max(max, arr[j]-min);
			min = Math.min(min, arr[j]);
		}
		return max;
	}

	
	
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 10, 6, 4, 8, 1};
		System.out.println(maximumDifference2(arr));
	}

}
