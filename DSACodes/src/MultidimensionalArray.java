import java.util.*;
public class MultidimensionalArray {
	
	//Matrix addtion
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int rows = Integer.parseInt(scan.next());
		int cols = Integer.parseInt(scan.next());
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		
		System.out.println("Enter matrix a:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++)
				a[i][j] = Integer.parseInt(scan.next());
		}
		
		System.out.println("Enter matrix b:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++)
				b[i][j] = Integer.parseInt(scan.next());
		}
		
		
		// addition
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		
		// printing
		System.out.println("Resultant matrix is:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}

}
