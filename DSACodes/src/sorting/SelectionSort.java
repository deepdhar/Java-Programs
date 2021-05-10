package sorting;
import java.util.*;

public class SelectionSort {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(scan.next());
		
		for(int k=0; k<n-1; k++) {
			for(int i=k+1; i<n; i++) {
				if(arr[i] < arr[k]) {
					int temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.print("Sorted array: ");
		for(int item: arr) System.out.print(item + " ");
	}

}
