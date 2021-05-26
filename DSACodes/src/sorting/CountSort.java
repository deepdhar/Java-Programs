package sorting;
import java.util.*;

public class CountSort {
	
	static void sort(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
			max = Math.max(max, arr[i]);
		
		int count_arr[] = new int[max+1], new_arr[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
			count_arr[arr[i]]++; 
		
		int idx = 0;
		
		for(int i=0; i<count_arr.length; i++) {
			while(count_arr[i]!=0) {
				count_arr[i]--;
				new_arr[idx] = i;
				idx++;
			}
		}
		
		for(int i=0; i<arr.length; i++)
			arr[i] = new_arr[i];
	}

	
	
	public static void main(String[] args) {
		int arr[] = {40, 56, 78, 23, 12, 69};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
