package sorting;

public class HeapSort {
	
	static void sort(int arr[]) {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i=n/2-1; i>=0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
	
	static void heapify(int arr[], int n, int i) {
		int largest=i, left=2*i+1, right=2*i+2;
		
		// If left child is larger than root
		if(left<n && arr[left]>arr[largest])
			largest = left;
		
		// If right child is larger than largest so far
		if(right<n && arr[right]>arr[largest])
			largest = right;
		
		// If largest is not root
		if(largest!=i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, largest);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 15, 50, 4, 20};
		sort(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
