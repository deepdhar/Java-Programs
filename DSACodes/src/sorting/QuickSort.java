package sorting;
import java.util.*;

public class QuickSort {
	
	//naive partition
	static void naivePartition(int arr[], int l, int h, int p) {
		int temp[] = new int[h-l+1], index=0;
	
		//bringing smaller values of pivot to left
		for(int i=l; i<=h; i++) {
			if(arr[i]<=arr[p])
				temp[index] = arr[i]; index++;
		}
		//bringing larger values of pivot to right
		for(int i=l; i<=h; i++) {
			if(arr[i]>arr[p])
				temp[index] = arr[i]; index++;
		}
		//copy temp array to arr
		for(int i=l; i<=h; i++)
			arr[i] = temp[i-l];
	}
	
	
	
	
	//lomuto partition
	static int lomutoPartition(int arr[], int low, int high) {
		int pivot = arr[high], i = low-1;
		
		for(int j=low; j<=high; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

	
	
	//hoarse partition
	static int hoarsePartition(int arr[], int low, int high) {
		int pivot = arr[low], i=low-1, j=high+1;
		while(true) {
			do {
				i++;
			} while(arr[i]<pivot);
			do {
				j--;
			} while(arr[j]>pivot);
			if(i>=j) return j;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	
	
	static void sort(int arr[], int low, int high) {
		if(low<high) {
			int p = lomutoPartition(arr, low, high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10, 80, 30, 90, 40, 50, 70};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
