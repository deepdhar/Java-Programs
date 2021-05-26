package Searching;

public class BinarySearch {
	
	//with location
	static int binarySearch(int arr[], int key) {
		int n = arr.length;
	    int mid, lb=0, ub=n-1, loc=-1;
	    
	    while(lb<=ub && loc==-1) {
	        mid = (lb+ub)/2;
	        if(arr[mid]==key) 
	        	loc = mid;
	        else if(arr[mid]>key) 
	        	ub = mid-1;
	        else 
	        	lb = mid+1;
	    }
	    return loc;
	}
	
	//without location
	static boolean binarySearch2(int arr[], int key) {
		int n = arr.length;
	    int mid, lb=0, ub=n-1;
	    while(lb<=ub) {
	        mid = (lb+ub)/2;
	        if(arr[mid]==key) return true;
	        else if(arr[mid]>key) ub = mid-1;
	        else lb = mid+1;
	    }
	    return false;
	}
	
	
	//recursive binary search
	static int recBinarySearch(int arr[], int key, int lb, int ub) {
		if(lb>ub) return -1;
		int mid = (lb+ub)/2;
		if(arr[mid]==key) return mid;
		else if(arr[mid]>key) return recBinarySearch(arr, key, lb, mid-1);
		else return recBinarySearch(arr, key, mid+1, ub);
	}
	
	

	public static void main(String[] args) {
		int n[] = {10,15,25,45,69,78,89,99};
		int key = 69;
//		if(binarySearch(n, key)!=-1)
//			System.out.println("Element found at location: " + binarySearch(n, key));
//		else
//			System.out.println("Element not found");
		
		if(recBinarySearch(n, key, 0, n.length-1)!=-1)
			System.out.println("Found at " + recBinarySearch(n, key, 0, n.length-1));
		else
			System.out.println("Not Found");
		
	}

}
