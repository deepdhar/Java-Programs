package Arrays;

public class SecondLargestElement {
	
	//naive solution, 2 traversals, time complexity: O(n^2)
	static int secondLargest(int arr[]) {
		int largest = getLargest(arr), res = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1)
					res=i;
				else if(arr[i]>arr[res])
					res = i;
			}
		}
		return res;
	}
	
	static int getLargest(int arr[]) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[max])
				max = i;
		}
		return max;
	}
	
	
	
	
	//efficient solution, time complexity: Θ(n)
	static int secondLargest2(int arr[]) {
		int max=0;
		int secMax=-1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[max]) {
				secMax = max;
				max = i;
			} else if(arr[i]!=arr[max]) {
				if(secMax==-1 || arr[i]>arr[secMax])
					secMax = i;
			}
		}
		return secMax;
	}
	

	
	public static void main(String[] args) {
		int arr[] = {22, 14, 35, 32, 69, 78, 67};	//7 elements
		System.out.println(secondLargest2(arr));
	}

}
