/*a leader is an element in array which is greater than any other element on it's right side
for example: arr[] = {7,10,4,3,6,5,2}
printing leaders: 10, 6, 5, 2
*/
package Arrays;

public class LeadersInArray {
	
	//naive solution, time complexity: O(n^2)
	static void printLeaders(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int flag = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>=arr[i]) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(arr[i] + " ");
		}
	}
	
	
	
	//efficient solution, time complexity: Θ(n)
	static void printLeaders2(int arr[]) {
		int curr = arr[arr.length-1];
		System.out.print(curr + " ");
		for(int i=arr.length-2; i>=0; i--) {
			if(curr<arr[i]) { 
				curr = arr[i];
				System.out.print(curr + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 10, 6, 5, 2};
		printLeaders2(arr);
	}

}
