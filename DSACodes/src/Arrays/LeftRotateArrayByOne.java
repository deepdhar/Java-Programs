package Arrays;
import java.util.*;

public class LeftRotateArrayByOne {
	
	//time complexity: Θ(n), space complexity: Θ(1)
	static void leftRotateOne(int arr[]) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++)
			arr[i-1] = arr[i];
		arr[arr.length-1] = temp;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6};
		leftRotateOne(arr);
		System.out.println(Arrays.toString(arr));
	}
}
