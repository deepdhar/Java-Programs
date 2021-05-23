package Arrays;

public class FrequencyInSortedArray {
	
	static void printFrequency(int arr[]) {
		int i=1, n=arr.length;
		while(i<n) {
			int freq=1;
			while(i<n && arr[i] == arr[i-1]) {
				freq++; 
				i++;
			}
			
			System.out.println(arr[i-1] + " " + freq);
			i++;
		}
		if(n==1 || arr[n-1]!=arr[n-2])
			System.out.println(arr[n-1] + " " + 1);
	}

	public static void main(String[] args) {
		int arr[] = {10, 10, 10, 25, 30, 30};
		printFrequency(arr);
	}

}
