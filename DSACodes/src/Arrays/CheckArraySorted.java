package Arrays;

public class CheckArraySorted {
	
	static int sortedOrNot(int arr[]) {
		int flag=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				flag = 1;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int arr[] = {10, 200, 30, 200};
		if(sortedOrNot(arr)==1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}
