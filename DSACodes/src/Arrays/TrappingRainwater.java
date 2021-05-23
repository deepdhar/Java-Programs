package Arrays;

public class TrappingRainwater {
	
	//naive solution, time complexity: O(n^2)
	static int getWater(int arr[]) {
		int res=0;
		for(int i=1; i<arr.length-1; i++) {
			int lmax = arr[i];
			for(int j=0; j<i; j++)
				lmax = Math.max(lmax, arr[j]);
			int rmax = arr[i];
			for(int j=i+1; j<arr.length; j++)
				rmax = Math.max(rmax, arr[j]);
			res += Math.min(lmax, rmax) - arr[i];
		}
		return res;
	}
	
	
	
	
	//efficient solution
	static int getWater2(int arr[]) {
		
	}
	
	

	public static void main(String[] args) {
		int arr[] = {3,5,2,3};
		System.out.println(getWater(arr));
	}

}
