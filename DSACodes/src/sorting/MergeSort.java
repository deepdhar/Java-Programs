//gives index out of bound exception, need to fix that before run
package sorting;
import java.util.*;

public class MergeSort {
	
	static void sort(int arr[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
	        sort(arr, l, mid);
	        sort(arr, mid+1, r);
	        merge(arr, l, mid, r);
		}
	}
	
	static void merge(int arr[], int l, int mid, int r) {
		int i=l, j=mid+1, k=l;
	    int b[] = new int[l+r];
	    while(i<=mid && j<=r) {
	        if(arr[i]<arr[j]) {
	            b[k] = arr[i];
	            i++;
	        } else {
	            b[k] = arr[j];
	            j++;
	        }
	        k++;
	    }
	    if(i>mid) {
	        while(j<=r) {
	            b[k] = arr[j];
	            j++; k++;
	        }
	    } else {
	        while(i<=mid) {
	            b[k] = arr[i];
	            i++; k++;
	        }
	    }
	    for(int m=l; m<=r; m++)
	        arr[m] = b[m];
	}

	public static void main(String args[]) {
		int arr[] = {80, 10, 30, 40, 69, 20, 70};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
