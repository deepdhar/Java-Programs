package sorting;
import java.util.*;

public class SelectionSort {
	
	static void sort(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++){
            int min_ind = i;
            
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
		
	}
	
	public static void main(String args[]) {
		int arr[] = {2, 10, 14, 56, 3, 21};
		sort(arr);
		System.out.print("Sorted array: ");
		for(int item: arr) System.out.print(item + " ");
	}

}
