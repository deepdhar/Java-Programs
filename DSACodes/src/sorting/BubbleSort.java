package sorting;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(scan.next());
		
		int count = 0;	
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
		
		System.out.print("Sorted array: ");
		for(int item:arr) System.out.print(item + " ");
	}

}
