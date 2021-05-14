package Arrays;
import java.util.*;

public class MoveZerosToEnd {
	
	static void moveToEnd(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j]!=0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 5, 0, 0, 8, 0, 9, 0};
		moveToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

}
