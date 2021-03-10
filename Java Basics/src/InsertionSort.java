import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[];
		arr = new int[1000];
		int n, i, j, t, flag=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter no. elements: ");
		n = scan.nextInt();
		
		System.out.print("Enter data: ");
		//i<n-1 is changed to i<n to work
		for(i=0; i<n; i++)
			arr[i] = scan.nextInt();
		
		for(i=1; i<n; i++) {
			t = arr[i];
			for(j=i-1; j>=0; j--) 
			{
				if(arr[j]>t) {
					arr[j+1] = arr[j];
					flag=1;
				} else {
					break;
				}
			}
			if(flag==1)
				arr[j+1] = t;
		}
		
		System.out.print("Sorted List: ");
		for(i=0; i<n; i++)
			System.out.print(arr[i] + " ");
		
	}

}
