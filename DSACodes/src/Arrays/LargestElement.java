package Arrays;

public class LargestElement {
	
	static int largest(int arr[]) {
		int max=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[max])
				max = i;
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {22, 14, 35, 32, 67, 78, 69};
		System.out.println(largest(arr));
	}

}
