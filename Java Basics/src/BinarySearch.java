import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 22, 50};
		Arrays.sort(arr);
		
		int key = 22;
		int res = Arrays.binarySearch(arr, key);
		
		if (res >= 0)
			System.out.println(key + " found at index " + res);
		else
			System.out.println(key + " not found");
		
		
	}
	
}
