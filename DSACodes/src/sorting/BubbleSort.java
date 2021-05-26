package sorting;

public class BubbleSort {
	
	//time complexity: Θ(n^2)
	static void sort(int arr[]) {
		int count = 0, n = arr.length;	
		while(count<n-1) {
			boolean sorted = true;
			for(int i=0; i<n-1-count; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
			count++;
			if(sorted) break;	//if no element is swapped, array is sorted
		}
	}

	public static void main(String[] args) {
		int arr[] = {2, 10, 8, 7, 3, 4, 6};
		sort(arr);
		System.out.print("Sorted array: ");
		for(int item:arr) System.out.print(item + " ");
	}

}
